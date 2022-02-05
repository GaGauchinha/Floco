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

    <c:choose>
        <c:when test="${usuario.id !=null}">
            <h1>
                Editar Usuário
                <input type="hidden" value="${usuario.id}" name="id_paciente">
            </h1>
        </c:when>
        <c:otherside>
            <h1>
                Cadastrar
                <input type="hidden" value="${0}" name="id_usuario">
            </h1>
        </c:otherside>
    </c:choose>
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
                        <a href="http://localhost:5432/americanos/cliente-controller?opcao=excluir&&id=${u.id}">Excluir</a>
                    </td>
                    <td>
                        <a href="http://localhost:5432/americanos/cliente-controller?opcao=editar&&id=${u.id}">Editar</a>
                    </td>
                </tr>
            </c:if>
        </c:forEach>
    </table>
</body>
</html>
