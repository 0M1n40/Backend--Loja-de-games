# 🕹️ Backend - Loja de Games

## 📌 Sobre o Projeto

Este projeto é um sistema backend para uma loja de games, permitindo o gerenciamento de produtos (games), incluindo cadastro, consulta e remoção de registros. Desenvolvido utilizando Java e Spring Boot.

## 🛠 Tecnologias Utilizadas

- **Backend:** Java com Spring Boot  
- **Banco de Dados:** MySQL  
- **Gerenciamento de Dependências:** Maven

  ### 1️⃣ Pré-requisitos:

- Java 17+  
- Spring Boot  
- MySQL  
- Maven  

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

- JSON para teste no Insominia
- **Classes**
  ```sh
  [
  {
    "nome": "Ação",
    "descricao": "Jogos repletos de adrenalina e combates intensos."
  },
  {
    "nome": "RPG",
    "descricao": "Jogos de RPG com histórias envolventes e escolhas impactantes."
  },
  {
    "nome": "Corrida",
    "descricao": "Velocidade e emoção em competições eletrizantes."
  },
  {
    "nome": "Esportes",
    "descricao": "Simuladores de esportes para os fãs de competições."
  }
  ]
- **Produtos**

  ```sh
  [
  {
    "nome": "CyberWarrior",
    "descricao": "Um jogo de ação futurista com combates intensos.",
    "valor": 199.90,
    "faixaEtaria": "18",
    "classe": {
      "id": 1
    }
  },
  {
    "nome": "Legends of Eldoria",
    "descricao": "RPG épico com mundo aberto e escolhas impactantes.",
    "valor": 249.90,
    "faixaEtaria": "14",
    "classe": {
      "id": 2
    }
  },
  {
    "nome": "Speed Legends",
    "descricao": "Corridas de alta velocidade com gráficos realistas.",
    "valor": 179.90,
    "faixaEtaria": "10",
    "classe": {
      "id": 3
    }
  },
  {
    "nome": "Ultimate Soccer",
    "descricao": "Futebol com jogabilidade realista e multiplayer online.",
    "valor": 199.90,
    "faixaEtaria": "0",
    "classe": {
      "id": 4
    }
  }
  ]



### 2️⃣ Clonando o Repositório:

```sh
git clone https://github.com/0M1n40/Backend--Loja-de-games.git
cd Backend--Loja-de-games
