# 📦 Projeto Java Servlets — Calculadora e Fatorial

Esta pasta contém dois exemplos práticos de aplicações web desenvolvidas com **Java Servlets**:

- `servlet_calculadora`: realiza operações matemáticas básicas.
- `servlet_fatorial`: calcula o fatorial de números inteiros, com entrada fixa ou personalizada.

## 🚀 Tecnologias Utilizadas

- Java EE (Servlet API)
- Apache Tomcat
- HTML5
- NetBeans (estrutura compatível)
- Maven (opcional)

## 📁 Estrutura dos Projetos

### 🔢 servlet_calculadora
- `ServletFrmCalculadora.java`: gera o formulário HTML.
- `ServletCalculadora.java`: processa os dados e exibe o resultado.
- `index.html`: página inicial.
- `web.xml`: mapeamento dos servlets.

### 🧮 servlet_fatorial
- `ServletFatorial.java`: calcula fatorial de 1 a 10.
- `ServletFatorialN.java`: calcula fatorial até o número informado.
- `index.html`: formulário de entrada.
- `web.xml`: mapeamento dos servlets.

## ▶️ Como Executar

```bash
1. Clone o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git

2. Importe o projeto na sua IDE (ex: NetBeans)

3. Configure o Apache Tomcat como servidor

4. Compile e execute o projeto

5. Acesse via navegador:
# Calculadora
http://localhost:8080/servlet_calculadora/servlet/ServletFrmCalculadora

# Fatorial
http://localhost:8080/servlet_fatorial/
