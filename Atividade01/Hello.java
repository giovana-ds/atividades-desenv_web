import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Hello extends HttpServlet {
    public void doGet(HttpServletRequest request, 
                        HttpServletResponse response) 
                        throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("usuario");
        if (user == null) {
            user = "World";
        }
        out.println("<html><head><title>");
        out.println("Saida Simples Servlet");
        out.println("</title></head><body>");
        out.println("<h1>Saida simples servlet</h1>");
        out.println("<p>Hello, " + user + "!</p>");
        out.println("</body></html>");
        out.close();
    }
    
}
