<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Gabi
  Date: 11/08/2021
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="resources/bootstrap/bootstrap.css"/>" type="text/css">
    <title>Listagem do Usuário</title>
</head>
<body>
    <h1>Usuários</h1>
    <table>
        <tr>
            <th>Código</th>
            <th>Nome</th>
            <th>E-mail</th>
            <th>Tipo</th>
        </tr>
        <c:forEach var="u" items="${usuarios}">
            <c:if test="${u.ativo!=false}">
                <tr>
                    <td>$(u.id)</td>
                    <td>$(u.nome)</td>
                    <td>$(u.email)</td>
                    <td>$(u.tipo)</td>
                    <td>
                        <a href="http://localhost:8080/americanos/cliente-controller?opcao=excluir&&id=${u.id}">Excluir</a>
                    </td>
                    <td>
                        <a href="http://localhost:8080/americanos/cliente-controller?opcao=editar&&id=${u.id}">Editar</a>
                    </td>
                </tr>
            </c:if>
        </c:forEach>
    </table>
</body>
</html>
