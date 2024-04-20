package br.com.keidsonroby.tdr_teste.modules.clientes.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.keidsonroby.tdr_teste.modules.clientes.entity.ClienteEntity;


public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
  @Query("select c from cliente c where c.nome like :nome")
  List<ClienteEntity> findByNome(String nome);
}
