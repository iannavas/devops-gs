# DevOps - Entrega Global Solutions 2025

Este projeto consiste em uma aplicação Java (Spring Boot) conectada a um banco de dados MySQL, configurada e executada em containers Docker. A aplicação suporta operações CRUD expostas via Swagger UI.

## 📽️ Vídeo de Demonstração

*Link para o vídeo:* https://www.youtube.com/watch?v=PzzoKKlrZ9A&ab_channel=IanNavas

---

## 🚀 Tecnologias Utilizadas

- Java + Spring Boot
- MySQL 8
- Docker
- Docker Compose
- Maven
- Swagger
- DBeaver (cliente para conexão com o banco)

---

## ⚙️ Como Rodar a Aplicação

### Pré-requisitos

- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)
- [Java 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)

---

### 1. Build da Aplicação

Certifique-se de que a aplicação foi empacotada corretamente. Execute no terminal ou pelo IntelliJ:

```bash
mvn clean package
```

O .jar será gerado na pasta target/.

### 2. Subir os Containers com Docker Compose
Com o terminal na raiz do projeto, execute:

```bash
docker compose up --build
```

Para rodar em segundo plano (modo background), use:
```bash
docker compose up -d
```

### 3. Acessar a Aplicação
Swagger: http://localhost:8080/swagger-ui/index.html

### 4. Conectar ao MySQL (opcional)
Você pode usar o DBeaver ou qualquer outro cliente MySQL com as credenciais definidas no docker-compose.yml:

Host: localhost

Porta: 3306

Usuário: root

Senha: root

Database: appdb

## 🧪 Funcionalidades Demonstradas
Criação de usuário e autenticação via JWT

Operações CRUD sobre entidades (ex: Categoria)

Persistência via volume Docker (dados mantidos entre execuções)

Visualização de logs dos containers

## 📦 Estrutura dos Containers
API Java: exposta na porta 8080, baseada em imagem customizada via Dockerfile

MySQL: versão 8, com volume persistente e variáveis de ambiente para configuração

## 📁 Logs
Para visualizar os logs dos containers:

```bash
docker logs <nome-ou-id-do-container>
```

## 🧹 Finalizando
Para parar os containers:

```bash
docker compose down
```
## 📄 Licença
Este projeto é parte da entrega da Global Solutions 2025 — DevOps.