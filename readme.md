# Projeto Spring Boot com Java 17


**Descrição**:
Este projeto é uma aplicação Spring Boot desenvolvida com Java 17. Ela fornece uma API RESTful para gerenciar entidades Cliente.

# Tecnologias Utilizadas
- Spring Boot: Framework para desenvolvimento rápido e simplificado de aplicações Java.

- Java 17: A versão mais recente da linguagem Java, oferecendo recursos de produtividade e desempenho aprimorados.

- Spring Web: Módulo do Spring Framework para desenvolvimento de APIs RESTful.

- Spring DevTools: Fornece reinicialização dinâmica de código e atualização automática do navegador, facilitando o desenvolvimento.

- Lombok: Simplifica o código Java eliminando a necessidade de boilerplate para getters, setters, equals, toString, etc.

- Spring Data JPA: Abstrai o acesso ao banco de dados relacional PostgreSQL, permitindo interações com entidades usando JPA.

- PostgreSQL Driver: Driver JDBC para conectar ao banco de dados PostgreSQL.

- Hibernate Validator: Fornece validação de dados para entidades usando anotações do Bean Validation API.



# A API expõe os seguintes endpoints para gerenciar os clientes:


**POST** http://localhost:8080/clientes: Cria um novo cliente. O corpo da requisição deve conter um objeto ClienteEntity válido.

**PUT** http://localhost:8080/clientes: Atualiza um cliente existente. O corpo da requisição deve conter um objeto ClienteEntity válido.

**GET** http://localhost:8080/clientes/{id}: Recupera um cliente pelo seu identificador (ID).

**GET** http://localhost:8080/clientes: Recupera uma lista de todos os clientes.

**GET** http://localhost:8080/clientes/busca?nome={nome}: Recupera um cliente pelo seu nome (parâmetro de consulta nome).

  

# Execução de uso dos endpoints:

>Criando um Cliente (POST /clientes):

Método HTTP: POST
URL: http://localhost:8080/clientes
Corpo da Requisição:
Conteúdo: Objeto JSON representando o novo cliente.
Tipo de Conteúdo: application/json

Exemplo:

```JSON
{
  "nome": "João da Silva",
  "ativo": "true",
}
```

  
>Atualizando um Cliente (PUT /clientes):

Método HTTP: PUT
URL: http://localhost:8080/clientes/{id}
Substitua {id} pelo ID do cliente que deseja atualizar.
Corpo da Requisição:
Conteúdo: Objeto JSON representando o cliente atualizado.
Tipo de Conteúdo: application/json

Exemplo:

```JSON
{
  "id": 1,
  "nome": "João da Silva Mendes",
  "ativo": "true" 
}
```


>Consultando um Cliente por ID (GET /clientes/{id}):

Método HTTP: GET
URL: http://localhost:8080/clientes/{id}
Substitua {id} pelo ID do cliente que deseja consultar.
Observação: Nenhum dado precisa ser enviado no corpo da requisição para essa consulta.

  
>Consultando Lista de Clientes (GET /clientes):

Método HTTP: GET
URL: http://localhost:8080/clientes
Observação: Nenhum dado precisa ser enviado no corpo da requisição para essa consulta.

  
>Consultando Cliente por Nome (GET /clientes/busca?nome={nome}):

Método HTTP: GET
URL: http://localhost:8080/clientes/busca?nome={nome}
Substitua {nome} pelo nome do cliente que deseja consultar.
Observação: Nenhum dado precisa ser enviado no corpo da requisição para essa consulta.

  

# Execução da Aplicação
  
>Pré-requisitos:
- Java 17 instalado e configurado no PATH do sistema.
- Banco de dados PostgreSQL instalado e configurado (opcional, para persistência real).
- Configuração do Banco de Dados (Opcional):
- Edite a configuração do banco de dados (por exemplo, application.properties) para especificar os detalhes de conexão ao PostgreSQL.
- Compilação e execução:
- Execute o comando mvn clean install para compilar o projeto.
- Execute a classe principal (geralmente com.example.ProjetoApplication) usando o comando java -jar target/projeto-0.0.1-SNAPSHOT.jar.
