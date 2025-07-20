# 🧩 Desafio: CRUD de Clientes - Spring Boot

Este projeto é um desafio proposto com o objetivo de construir um CRUD completo utilizando Java com Spring Boot, focado na entidade **Client**.

## 📌 Funcionalidades Implementadas

O sistema expõe uma API REST que permite:

- 🔍 **Busca paginada de clientes**  
- 🔎 **Busca de cliente por ID**
- ➕ **Criação de um novo cliente**
- ✏️ **Atualização de cliente existente**
- ❌ **Remoção de cliente por ID**

## 📄 Modelo da Entidade `Client`

A entidade segue rigorosamente a especificação exigida no desafio:

- `id` (Long)
- `name` (String)
- `cpf` (String)
- `income` (Double)
- `birthDate` (Instant)
- `children` (Integer)

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Banco de dados em memória H2 (ambiente de teste)
- Maven (gerenciador de dependências)

## 🚀 Objetivo do Projeto

Este repositório tem fins educacionais e faz parte de um desafio para reforçar os conhecimentos em:

- ✅ Criação de web services RESTful com **Spring Boot**
- ✅ Aplicação do padrão de camadas: **Controller**, **Service** e **Repository**
- ✅ Integração com banco de dados em memória **H2**
- ✅ Manipulação de dados utilizando **Spring Data JPA**