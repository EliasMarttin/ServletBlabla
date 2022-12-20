package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletOfertaViaje", value = "/ServletOfertaViaje")
public class ServletOfertaViaje extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        String origen = request.getParameter("origen");
        String destino = request.getParameter("destino");
        String fecha = request.getParameter("fecha");
        long precio = Long.parseLong(request.getParameter("precio"));
        long numPlazas = Long.parseLong(request.getParameter("numPlazas"));
        HttpSession sesion = request.getSession();
        String codCli = (String) sesion.getAttribute("codCli");
        String res = gestor.ofertaViaje(codCli, origen, destino, fecha, precio, numPlazas).toJSONString();
        System.out.println(res);
        response.setContentType("text/html");
        request.setAttribute("res",res);
        RequestDispatcher vista = request.getRequestDispatcher("resOfertaViaje.jsp");
        vista.forward(request, response);
    }
}
