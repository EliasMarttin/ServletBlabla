<%--
  Created by IntelliJ IDEA.
  User: ELIAS
  Date: 17/12/2022
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BlablaUji</title>
    <div id="div1">
        <img src="Vista/recursos/img.png" alt="Italian Trulli" height=100% width=100%>
    </div>
</head>
<link rel="stylesheet" href="Vista/CSS/mystyle.css">
<body>
<h1 id="tituloMain">BlaBla UJI</h1>
<div id="subtituloMain">
    <h2> Datos de las oferta </h2>
    <p><%=request.getAttribute("res")%></p>
</div>
</body>
</html>
