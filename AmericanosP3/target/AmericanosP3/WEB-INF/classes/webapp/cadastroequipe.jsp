<%--
  Created by IntelliJ IDEA.
  User: Gabi
  Date: 11/08/2021
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Cadastro</title>
  <link rel="stylesheet" href="<c:url value="resources/bootstrap/bootstrap.css"/>" type="text/css">
</head>
<body>
  <form method="post" action="usuario-controller">
    Nome: <input name="nome" type="text">
    E-mail: <input name="email" type="email">
    Senha: <input name="senha" type="password">
    Tipo de Documento: <input name="tipodoc" type="text">
    Número do Documento: <input name="doc" type="text">
    Data de Nascimento: <input name="data_nascimento" type="date">
    Endereço: <input name="endereco" type="text">
    Tipo: <input name="tipo" type="text">
    Salário: <input name="salario" type="text">
    Função: <input name="funcao" type="text">
    <input type="submit" value="Cadastrar">
  </form>
  <c:if text="${retorno==ok}">
    <h2>Usuário cadastrado com sucesso</h2>
  </c:if>
</body>
</html>
