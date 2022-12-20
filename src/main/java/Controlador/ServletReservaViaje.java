package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletReservaViaje", value = "/ServletReservaViaje")
public class ServletReservaViaje extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        String codViaje = request.getParameter("codViaje");
        HttpSession sesion = request.getSession();
        String codCli = (String) sesion.getAttribute("codCli");
        String res = gestor.reservaViaje(codViaje,codCli).toJSONString();
        System.out.println(res);
        response.setContentType("text/html");
        request.setAttribute("res",res);
        RequestDispatcher vista = request.getRequestDispatcher("resReservaViaje.jsp");
        vista.forward(request, response);

    }
}
