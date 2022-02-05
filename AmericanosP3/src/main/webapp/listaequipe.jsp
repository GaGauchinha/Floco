<%--
  Created by IntelliJ IDEA.
  User: Gabi
  Date: 11/08/2021
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="<c:url value="resources/bootstrap/bootstrap.css"/>" type="text/css">
  <title>Listagem da Equipe</title>
</head>
<body>

<h1>Equipe</h1>
<table>
  <tr>
    <th>Código</th>
    <th>Nome</th>
    <th>E-mail</th>
    <th>Tipo</th>
  </tr>
  <c:forEach var="e" items="${equipe}">
    <c:if test="${e.ativo!=false}">
      <tr>
        <td>$(e.id)</td>
        <td>$(e.nome)</td>
        <td>$(e.email)</td>
        <td>$(e.tipo)</td>
        <td>
          <a href="http://localhost:8080/americanos/equipe-controller?opcao=excluir&&id=${e.id}">Excluir</a>
        </td>
        <td>
          <a href="http://localhost:8080/americanos/equipe-controller?opcao=editar&&id=${e.id}">Editar</a>
        </td>
      </tr>
    </c:if>
  </c:forEach>
</table>
</body>
</html>
