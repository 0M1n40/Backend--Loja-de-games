# 🕹️ Backend - Loja de Games

## 📌 Sobre o Projeto

Este projeto é um sistema backend para uma loja de games, permitindo o gerenciamento de produtos (games), incluindo cadastro, consulta e remoção de registros. Desenvolvido utilizando Java e Spring Boot.

## 🛠 Tecnologias Utilizadas

- **Backend:** Java com Spring Boot  
- **Banco de Dados:** MySQL  
- **Gerenciamento de Dependências:** Maven  

## 📂 Estrutura do Projeto

A principal entidade do sistema é **Produto**, que contém os seguintes atributos:

- `id (Long)` - Identificador único do game  
- `nome (String)` - Nome do jogo  
- `preco (Double)` - Preço do jogo  
- `descricao (String)` - Descrição do jogo  

## 🔧 Funcionalidades (CRUD) Teste Insominia

### Cadastrar um Jogo (Class **Produto**)

- **Cadastrar Game (POST)** → `POST localhost:8080/produto`   
- **Listar Todos os Games (GET)** → `GET  localhost:8080/produto`  
- **Buscar Game por ID (GET)** → `GET  localhost:8080/produto/{id}`  
- **Atualizar Game (PUT)** → `PUT  localhost:8080/produto`  
- **Remover Game (DELETE)** → `DELETE  localhost:8080/produto/{id}`
##
### Cadastrar um Jogo (Class **Classe**)
- **Cadastrar Game (POST)** → `POST localhost:8080/classe`  
- **Listar Todos os Games (GET)** → `GET localhost:8080/classe`  
- **Buscar Game por ID (GET)** → `GET localhost:8080/classe/{id}`  
- **Atualizar Game (PUT)** → `PUT localhost:8080/classe`  
- **Remover Game (DELETE)** → `DELETE localhost:8080/classe/{id}` 

## 🚀 Como Executar o Projeto

### 1️⃣ Pré-requisitos:

- Java 17+  
- Spring Boot  
- MySQL  
- Maven  

### 2️⃣ Clonando o Repositório:

```sh
git clone https://github.com/0M1n40/Backend--Loja-de-games.git
cd Backend--Loja-de-games
