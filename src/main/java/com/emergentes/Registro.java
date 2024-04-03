
package com.emergentes;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Registro", urlPatterns = {"/Registro"})
public class Registro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession ses=request.getSession();
        ses.invalidate();
        response.sendRedirect("Index.jsp");
            
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         // Obtener los parámetros del formulario
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        
        int parcial1 = Integer.parseInt(request.getParameter("parcial1"));
        int parcial2 = Integer.parseInt(request.getParameter("parcial2"));
        int parcial3 = Integer.parseInt(request.getParameter("parcial3"));

        // Crear un objeto Datos con los datos recibidos
        Datos dato = new Datos(id, nombre, parcial1, parcial2, parcial3);

        // Obtener acceso al objeto session
        HttpSession ses = request.getSession();
        
        // Obtener la lista existente de datos (si existe)
        ArrayList<Datos> listaDatos = (ArrayList<Datos>) ses.getAttribute("listaDatos");
        
        // Si la lista no existe, crear una nueva lista
        if (listaDatos == null) {
            listaDatos = new ArrayList<>();
        }
        
        // Agregar el nuevo dato a la lista
        listaDatos.add(dato);
        
        // Guardar la lista actualizada en la sesión
        ses.setAttribute("listaDatos", listaDatos);
        
        // Redireccionar a index.jsp para mostrar los datos
        response.sendRedirect("Index.jsp");
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
