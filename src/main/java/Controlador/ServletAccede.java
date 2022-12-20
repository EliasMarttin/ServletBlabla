package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletAccede", value = "/ServletAccede")
public class ServletAccede extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        if(gestor == null) {
            gestor = new GestorViajes();
            contexto.setAttribute("gestor", gestor);
        }
        // Obtengo el parámetro del formulario
        String codCli = request.getParameter("codCli");
        HttpSession sesion = request.getSession(true);
        if(sesion != null) {
            sesion.setAttribute("codCli",codCli);
        }
        // Creo la página web con la respuesta
        response.setContentType("text/html");
        RequestDispatcher vista = request.getRequestDispatcher("menu.jsp");
        vista.forward(request, response);

    }
}
