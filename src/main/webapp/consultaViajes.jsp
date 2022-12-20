<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta charset="UTF-8">
    <title>BlablaUji</title>
    <div id="div1">
        <img src="Vista/recursos/img.png" alt="Italian Trulli" height=100% width=100%>
    </div>
</head>
<link rel="stylesheet" href="Vista/CSS/mystyle.css">
<body>
<h1 id="tituloMain">BlaBla UJI</h1>
<div id="divlistadoMain">
    <form action = "ServletconsultaViajes" method="GET">
        <label>Indica el Origen del Viaje </label><input type="text" name="codViaje" required>
        <input type="submit" value="Enviar">
    </form>
</div>
</body>
</html>
