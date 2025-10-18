package Atividade02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletAloMundo extends HttpServlet {
    public void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>P&aacute;gina Alo Mundo</title>");
        out.println("</head>");
        out.println("<body>");
        String nome = request.getParameter("nome");
        out.println("<h1>Alo Mundo, " + nome + "</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
