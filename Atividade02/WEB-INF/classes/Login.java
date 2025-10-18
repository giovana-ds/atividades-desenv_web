import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Define o tipo de conteúdo da resposta
        response.setContentType("text/html;charset=UTF-8");

        // Obtém os parâmetros do formulário
        String nome = request.getParameter("txtNome");
        String senha = request.getParameter("txtSenha");

        // Cria o writer para enviar resposta ao navegador
        PrintWriter out = response.getWriter();

        // Simples verificação de login (exemplo)
        if ("admin".equals(nome) && "1234".equals(senha)) {
            out.println("<html><body>");
            out.println("<h2>Bem-vindo, " + nome + "!</h2>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h2>Login inválido. Tente novamente.</h2>");
            out.println("</body></html>");
        }

        out.close();
    }
}
