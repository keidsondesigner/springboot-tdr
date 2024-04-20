package br.com.keidsonroby.tdr_teste.modules.clientes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity(name = "cliente")
public class ClienteEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_funcao")
  @SequenceGenerator(name = "sq_funcao", sequenceName = "seq_cliente_id", schema = "public", allocationSize = 1)
  private Integer id;

  @NotNull(message = "O campo [name], não foi informado.")
  private String nome;

  private boolean ativo;
}
