consultaViajes.jsp<%--
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
<h2>Introduce los datos del viaje a Ofertar</h2>
<div id="divlistadoMain">
    <ul>
        <form action = "ServletOfertaViaje" method="POST">
        <li> <label>Origen </label><input type="text" name="origen" required></li>
        <li> <label>Destino </label><input type="text" name="destino" required></li>
        <li> <label>Fecha (dd-mm-aaaa)</label><input type="text" name="fecha" required></li>
        <li> <label>Precio </label><input type="text" name="precio" required></li>
        <li> <label>Número de Plazas </label><input type="text" name="numPlazas" required></li>
        <input type="submit" value="ofertar">
        </form>
    </ul>
</div>
</body>
</html>
