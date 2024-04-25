package br.com.keidsonroby.tdr_teste.modules.clientes.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.keidsonroby.tdr_teste.modules.clientes.entity.ClienteEntity;
import br.com.keidsonroby.tdr_teste.modules.clientes.service.ClienteService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/clientes")
public class ClienteController {
  
  @Autowired
  ClienteService clienteService;

  @PostMapping
  public ResponseEntity<Object> createCliente(@Valid @RequestBody ClienteEntity clienteEntity, BindingResult bindingResult) {
      if(bindingResult.hasErrors()) {
        return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
      }
      var clienteSalvo = this.clienteService.salvar(clienteEntity);
      return ResponseEntity.ok(clienteSalvo);
  }

  
  @GetMapping("/{id}")
  public ResponseEntity<Object> getClientePorId(@PathVariable Integer id) {
    var cliente = this.clienteService.buscaPorId(id);
    return ResponseEntity.ok(cliente);
  }
  
  @GetMapping
  public ResponseEntity<Object> getAllClientes() {
    var clientes = this.clienteService.listaClientes();
    return ResponseEntity.ok(clientes);
  }
  
  @GetMapping("/busca")
  public ResponseEntity<Object> getClientePorNome(@RequestParam String nome) {
    var cliente = this.clienteService.buscaPorNome(nome);
    return ResponseEntity.ok(cliente);
  }
  
  @PutMapping
  public ResponseEntity<Object> putCliente(@RequestBody ClienteEntity clienteEntity, BindingResult bindingResult) {
    if(bindingResult.hasErrors()) {
      return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
    }
    var clienteAtualizado = this.clienteService.atualizar(clienteEntity);
    return ResponseEntity.ok(clienteAtualizado);
  }

  // @DeleteMapping("/{id}")
  // public ResponseEntity<Object> deleteClientePorId(@PathVariable Integer id) {
  //   this.clienteService.deletaPorId(id);
  //   return ResponseEntity.noContent().build();
  // }

  @DeleteMapping("/{id}")
  public ResponseEntity<Object> deleteCliente(@PathVariable Integer id) {
    var cliente = this.clienteService.buscaPorId(id);
    this.clienteService.deletarCliente(cliente);
    // return ResponseEntity.noContent().build();
    return ResponseEntity.ok("Item deletado" + " " + cliente);
  }
}
