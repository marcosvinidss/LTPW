import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/criarCurso")
public class CriarCursoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/criarcurso.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nomeCurso = request.getParameter("nome_curso");
        String coordenador = request.getParameter("coordenador");
        String materias = request.getParameter("materias");
        String status = request.getParameter("status");

        // Aqui você irá inserir os dados do novo curso no banco de dados
        Curso curso = new Curso(nomeCurso, coordenador, materias, status);
        boolean inserido = CursoDAO.inserirCurso(curso); // Implementar o método

        if (inserido) {
            request.setAttribute("mensagem", "Curso criado com sucesso!");
        } else {
            request.setAttribute("mensagem", "Erro ao criar o curso.");
        }

        request.getRequestDispatcher("/WEB-INF/criarcurso.jsp").forward(request, response);
    }
}
