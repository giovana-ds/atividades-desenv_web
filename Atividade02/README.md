# Formulários Básicos em HTML

Este projeto reúne uma série de exercícios práticos sobre formulários HTML, com foco em elementos de entrada, validação com JavaScript e estilização com CSS. Os exemplos foram desenvolvidos com base em um material didático voltado para aplicações web com Servlets e JSP.

## 📚 Conteúdo Abordado

- Estrutura básica de um documento HTML
- Comentários em HTML
- Elementos de formulário:
  - Campos de texto (`input[type="text"]`)
  - Campos de senha (`input[type="password"]`)
  - Campos ocultos (`input[type="hidden"]`)
  - Botões (`submit`, `reset`, `button`)
  - Checkboxes e Radio Buttons
  - Áreas de texto (`textarea`)
  - Caixas de seleção (`select`)
  - Upload de arquivos (`input[type="file"]`)
- Validação de formulários com JavaScript
- Separação de scripts em arquivos externos
- Estilização com CSS (inline, interna e externa)
- Exemplos de integração com Servlets e JSP

## 🧪 Estrutura dos Exercícios

Cada exercício está organizado em arquivos HTML separados, como:

- `entradaTexto.html`
- `entradaSenha.html`
- `entradaOculta.html`
- `entradaCheckbox.html`
- `entradaRadioButton.html`
- `formularioCadastro.html`
- `upload.html`
- `formularioValidacao.html`
- `exemploCSS1.html`
- `exemploCSS2.html`
- `biblioteca.js` (validação externa)

## 🚀 Como Executar

1. Clone ou baixe este repositório.
2. Abra os arquivos `.html` diretamente no navegador.
3. Para testar validações, interações e estilos, utilize o console do navegador (`F12`).
4. Para integração com Servlets, configure um servidor como Apache Tomcat e direcione os formulários para os endpoints corretos.

## 🎨 Estilo

O projeto utiliza um arquivo externo de estilo (`estilo.css`) para padronizar a aparência dos formulários:

```css
p {
  color: green;
}
h1 {
  color: red;
  font-size: 13pt;
  font-weight: bold;
}
div.titulo {
  font-family: tahoma;
  font-size: 11pt;
  font-weight: bold;
  color: black;
  text-align: left;
}
input {
  font-size: 9pt;
  color: green;
}
