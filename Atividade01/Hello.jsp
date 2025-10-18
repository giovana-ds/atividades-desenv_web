<html>

<head>
    <title>Saida simples servlet</title>
</head>

<body>
    <% String user=request.getParameter("usuario"); if (user==null) user="World" ; %>
        <h1>Saida Simples Servlet<h1>
                <p> Hello <%= user %>! </p>
</body>

</html>