package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletExit", value = "/ServletExit")
public class ServletExit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        gestor.guardaDatos();
        response.setContentType("text/html");
        RequestDispatcher vista = request.getRequestDispatcher("resExit.jsp");
        vista.forward(request, response);
    }
}
