<%@page import="com.emergentes.Datos"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registro de Calificaciones</title>
    <style>
        .contenedor {
            border: 1px solid black;
            padding: 8px;
            display: inline-block;
            text-align: center;
        }
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            padding: 6px;
        }
    </style>
    <script>
        function eliminarFila(id) {
            var fila = document.getElementById(id);
            fila.parentNode.removeChild(fila);
        }
    </script>
</head>
<body>
    <div class="contenedor">
        <label>PRIMER PARCIAL TEM-742</label><br>
        <label>Nombre: RUDDY FRANKLIN VARGAS CHOQUE</label><br>
        <label>CI: 13939450 lp.</label>
    </div>
    <div>
        <br><h2>REGISTRO DE CALIFICACIONES</h2>
    </div>
    <form action="Registro" method="post">
        <table>
            <tr>
                <th>ID</th>
                <td><input type="number" name="id"></td>
            </tr>
            <tr>
                <th>Nombre del estudiante </th>
                <td><input type="text" name="nombre"></td>
            </tr>
            <tr>
                <th>Primer Parcial (30pts)</th>
                <td><input type="number" name="parcial1"></td>
            </tr>
            <tr>
                <th>Segundo Parcial (30pts) </th>
                <td><input type="number" name="parcial2"></td>
            </tr>
            <tr>
                <th>Examen Final (40pts)</th>
                <td><input type="number" name="parcial3"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="procesar"></td><br>
            </tr>
        </table>
    </form>

 
    
    <table border="1">
    <tr><br><br><br><br>
        <th>ID</th>
        <th>Nombre</th>
        <th>Parcial 1</th>
        <th>Parcial 2</th>
        <th>Parcial 3</th>
        <th>Total</th>
        <th>Eliminar</th> 
        <th>Editar</th> 
        
    </tr>
    <%
        ArrayList<Datos> listaDatos = (ArrayList<Datos>) session.getAttribute("listaDatos");
        if (listaDatos != null) {
            for (Datos dato : listaDatos) {
    %>
    <tr id="<%= dato.getId() %>">
        <td><%= dato.getId() %></td>
        <td><%= dato.getNombre() %></td>
        <td><%= dato.getParcial1() %></td>
        <td><%= dato.getParcial2() %></td>
        <td><%= dato.getParcial3() %></td>
        <td><%= dato.getParcial1() + dato.getParcial2() + dato.getParcial3() %></td>
        <td><a href="javascript:eliminarFila('<%= dato.getId() %>')">Eliminar</a></td>
                <td><a href="Editar?id=<%= dato.getId() %>">Editar</a></td> <!-- Enlace para editar -->

    </tr>
    <%
            }
        }
    %>
</table>

</body>
</html>
