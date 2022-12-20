package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletEliminaReserva", value = "/ServletEliminaReserva")
public class ServletEliminaReserva extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext contexto = getServletContext();
        request.setCharacterEncoding("UTF-8");
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        String codViaje = request.getParameter("codViaje");
        System.out.println("El código que me están pasando es " + codViaje + "" );
        HttpSession sesion = request.getSession();
        String codCli = (String) sesion.getAttribute("codCli");
        System.out.println("Datos"+ codViaje + codCli);
        String res = gestor.anulaReserva(codViaje, codCli).toJSONString();
        System.out.println(res);
        response.setContentType("text/html");
        request.setAttribute("res",res);
        RequestDispatcher vista = request.getRequestDispatcher("resEliminaReserva.jsp");
        vista.forward(request, response);

    }
}
