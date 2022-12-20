package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;

@WebServlet(name = "ServletconsultaViajes", value = "/ServletconsultaViajes")
public class ServletConsultaViajes extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        request.setCharacterEncoding("UTF-8");
        String codViaje = request.getParameter("codViaje");
        System.out.println("El código que me están pasando es " + codViaje + "" );
        JSONArray res = gestor.consultaViajes(codViaje);
        System.out.println(res);
        //Aqui es donde tengo que ver si mando algo que no se algo vacío.

        request.setAttribute("res", res);
        RequestDispatcher vista = request.getRequestDispatcher("resConsultaViajes.jsp");
        vista.forward(request, response);




    }

}
