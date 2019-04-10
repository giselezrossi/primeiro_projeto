<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action='http://localhost:8080/primeiro_projeto/cadastro' method="post">
  <label>Livro</label>
        <input type="text" name="livro" />
        <label>Autor</label>
        <input type="text" name="autor" />
        <label>tipo</label>
        <input type="text" name="tipo" />
        <label>Valor</label>
  <input type="number" step="0.01" name="valor"/>
  <button>Cadastrar</button>
  </form>
</body>
</html>