import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Aqui você fará a lógica para buscar os cursos do banco de dados
        List<Curso> cursos = CursoDAO.listarCursos(); // Implementar o método conforme sua lógica

        // Setando os cursos como atributo na requisição
        request.setAttribute("cursos", cursos);

        // Encaminhando para a página JSP correspondente
        request.getRequestDispatcher("/WEB-INF/dashboard.jsp").forward(request, response);
    }
}
