package olaMundo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;

@WebServlet("/OlaMundo")
public class OlaMundo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public OlaMundo(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String param1 = request.getParameter("param1");
        String param2 = request.getParameter("param2");

        response.getWriter().append("O parametro 1 é: ").append(param1).append(" O parametro 1 é: ").append(param2);
    }
}
