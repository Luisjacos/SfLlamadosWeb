<%-- 
    Document   : registro
    Created on : 20/10/2017, 11:46:09 AM
    Author     : ThinkPad X240
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado de la Busqueda</title>
    </head>
    <body>
        
        <table>
            <tr>
                <th>Id</th>
                <th>Descripción</th>
            </tr>
        <c:forEach items="${resultados}" var="resultado">
            <tr>
                <td>${resultado.id}</td>
                <td>${resultado.descripcion}</td>
            </tr>
        </c:forEach>
        </table>
    </body>
</html>
    </body>
</html>
