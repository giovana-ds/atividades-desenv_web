
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ServletFatorial extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Calculo Fatorial</h1>");
        for (int i = 1; i <= 10; i++) {
            out.println("Numero " + i + " = " + fatorial(i) + "<br>");
        }
        out.close();
    }

    public int fatorial(int num) {
        int fat = 1;
        for (int i = 1; i <= num; i++) {
            fat = fat * i;
        }
        return fat;
    }
}
