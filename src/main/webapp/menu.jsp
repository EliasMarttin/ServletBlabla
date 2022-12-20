<%--
  Created by IntelliJ IDEA.
  User: ELIAS
  Date: 17/12/2022
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
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
<h2>Bienvenido mi pa: <%= request.getParameter("codCli")%></h2>
<div id="divlistadoMain">
    <ul>

        <li><a href="exit.jsp">Salir</a></li>
        <li><a href="consultaViajes.jsp">Consulta viajes desde un Origen</a></li>
        <li><a href="reservaViaje.jsp">Reservar un Viaje</a></li>
        <li><a href="eliminarReserva.jsp">Anular una reserva de viaje</a></li>
        <li><a href="ofertaViaje.jsp">Ofertar un nuevo Viaje</a></li>
        <li><a href="eliminarViaje.jsp">Eliminar un viaje Ofertado</a></li>

    </ul>
</div>
</body>
</html>
