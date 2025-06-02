# CRUD-Client - DevSuperior Desafio 03

Este projeto é um CRUD completo de clientes, desenvolvido como parte do Desafio 03 da [DevSuperior](https://devsuperior.com.br/), utilizando Java com Spring Boot. O objetivo é implementar uma API RESTful com operações básicas de criação, leitura, atualização e exclusão de clientes, além de validações e tratamento de exceções.

## 🧰 Tecnologias Utilizadas

* Java 17
* Spring Boot 
* Spring Data JPA
* Bean Validation
* Banco de Dados H2 (em memória)
* Maven

## 📋 Funcionalidades

* **Listar Clientes**: Paginação de clientes com ordenação por nome.
* **Buscar Cliente por ID**: Retorna os dados de um cliente específico.
* **Inserir Cliente**: Adiciona um novo cliente ao banco de dados.
* **Atualizar Cliente**: Modifica os dados de um cliente existente.
* **Deletar Cliente**: Remove um cliente do banco de dados.

## 🧪 Validações

* **Nome**: Não pode ser vazio.
* **Data de Nascimento**: Não pode ser uma data futura.
* **CPF**: Deve ter 11 caracteres.
* **Renda**: Deve ser um número inteiro não negativo.
* **Filhos**: Deve ser um número inteiro não negativo.

## ⚠️ Tratamento de Exceções

* **404 Not Found**: Recurso não encontrado.
* **422 Unprocessable Entity**: Dados inválidos fornecidos na requisição.

## 🚀 Como Executar o Projeto

1. **Execute o projeto**:

   * Utilizando o Maven Wrapper:

     ```bash
     ./mvnw spring-boot:run
     ```

   * Ou importe o projeto em sua IDE e execute a classe principal.

2. **Acesse a aplicação**:

   * A API estará disponível em: `http://localhost:8080/clients`
   * O console do H2 pode ser acessado em: `http://localhost:8080/h2-console`

     * JDBC URL: `jdbc:h2:mem:testdb`
     * Usuário: `sa`
     * Senha: *(deixe em branco)*

## 📦 Exemplos de Requisições

### 🔍 Buscar todos os clientes (com paginação)

**GET** `http://localhost:8080/clients?page=0&size=5&sort=name`

📥 **Resposta (200 OK)**:

```json
{
  "content": [
    {
      "id": 1,
      "name": "Maria Silva",
      "cpf": "12345678900",
      "income": 5000.0,
      "birthDate": "1990-01-01T00:00:00Z",
      "children": 2
    },
    ...
  ],
  "totalPages": 1,
  "totalElements": 5,
  "size": 5,
  "number": 0
}
```

---

### 🔍 Buscar cliente por ID

**GET** `http://localhost:8080/clients/1`

📥 **Resposta (200 OK)**:

```json
{
  "id": 1,
  "name": "Maria Silva",
  "cpf": "12345678900",
  "income": 5000.0,
  "birthDate": "1990-01-01T00:00:00Z",
  "children": 2
}
```

### 📝 Inserir novo cliente

**POST** `http://localhost:8080/clients`

📤 **Corpo da requisição**:

```json
{
  "name": "João Santos",
  "cpf": "98765432100",
  "income": 4200.0,
  "birthDate": "1985-06-15T00:00:00Z",
  "children": 1
}
```

📥 **Resposta (201 Created)**:

```json
{
  "id": 6,
  "name": "João Santos",
  "cpf": "98765432100",
  "income": 4200.0,
  "birthDate": "1985-06-15T00:00:00Z",
  "children": 1
}
```

---

### ✏️ Atualizar cliente

**PUT** `http://localhost:8080/clients/1`

📤 **Corpo da requisição**:

```json
{
  "name": "Maria Silva Atualizada",
  "cpf": "12345678900",
  "income": 5500.0,
  "birthDate": "1990-01-01T00:00:00Z",
  "children": 3
}
```

📥 **Resposta (200 OK)**:

```json
{
  "id": 1,
  "name": "Maria Silva Atualizada",
  "cpf": "12345678900",
  "income": 5500.0,
  "birthDate": "1990-01-01T00:00:00Z",
  "children": 3
}
```

---

### ❌ Deletar cliente

**DELETE** `http://localhost:8080/clients/1`

📥 **Resposta (204 No Content)**:

```http
<sem corpo>
```

## 🗂️ Estrutura do Projeto

* `src/main/java`: Contém o código-fonte da aplicação.

  * `controller`: Camada responsável por receber as requisições HTTP.
  * `service`: Camada de lógica de negócios.
  * `repository`: Interface de acesso ao banco de dados.
  * `dto`: Objetos de Transferência de Dados.
  * `entities`: Entidades JPA.
  * `exceptions`: Classes de tratamento de exceções.
* `src/main/resources`: Recursos da aplicação.

  * `application.properties`: Configurações do Spring Boot.

## 🔢 Dados de Seeding

* O projeto já vem com alguns clientes pré-cadastrados para facilitar os testes.
* **Os CPFs utilizados no seeding foram gerados pelo site [4Devs - Gerador de CPF](https://www.4devs.com.br/gerador_de_cpf).**

## 👩‍💻 Autora

* [Camille Oliveira](https://github.com/camilleoliveira324)


