# Demo DAO JDBC

Este projeto é uma demonstração prática da implementação do padrão **DAO (Data Access Object)** utilizando **JDBC (Java Database Connectivity)** em Java.

## Objetivo

O objetivo do projeto é mostrar como estruturar um sistema simples de persistência de dados em Java puro, sem o uso de frameworks ORM como JPA ou Hibernate. Ele ilustra como separar a lógica de acesso a dados da lógica de negócios, promovendo uma arquitetura mais limpa e organizada.

## Ferramentas Utilizadas

- Java
- JDBC
- MySQL
- Padrão DAO

## Estrutura

- `src/`: Contém o código-fonte do projeto, incluindo entidades, DAOs, factories e a aplicação principal.
- `db.properties`: Arquivo com as configurações de conexão com o banco de dados (URL, usuário e senha).
- `.gitignore`: Arquivo de configuração para o Git ignorar arquivos desnecessários.

## Como executar

1. Configure um banco de dados relacional (como MySQL).
2. Atualize o arquivo `db.properties` com os dados corretos da sua conexão.
3. Compile e execute a aplicação.

## Autor
Marco Antonio Borghetti

---

Este projeto é baseado em estudos de JDBC e boas práticas de desenvolvimento Java.
