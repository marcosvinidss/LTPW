import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editar")
public class EditarCursoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idStr = request.getParameter("id");
        if (idStr != null) {
            int id = Integer.parseInt(idStr);

            // Buscar o curso pelo ID e setar como atributo na requisição
            Curso curso = CursoDAO.buscarCursoPorId(id); // Implementar o método

            if (curso != null) {
                request.setAttribute("curso", curso);
                request.getRequestDispatcher("/WEB-INF/editarcurso.jsp").forward(request, response);
            } else {
                response.sendRedirect(request.getContextPath() + "/dashboard");
            }
        } else {
            response.sendRedirect(request.getContextPath() + "/dashboard");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idStr = request.getParameter("id");
        String nomeCurso = request.getParameter("nome_curso");
        String coordenador = request.getParameter("coordenador");
        String materias = request.getParameter("materias");
        String status = request.getParameter("status");

        if (idStr != null) {
            int id = Integer.parseInt(idStr);

            // Atualizar o curso no banco de dados
            Curso curso = new Curso(id, nomeCurso, coordenador, materias, status);
            boolean atualizado = CursoDAO.atualizarCurso(curso); // Implementar o método

            if (atualizado) {
                request.setAttribute("mensagem", "Curso atualizado com sucesso!");
            } else {
                request.setAttribute("mensagem", "Erro ao atualizar o curso.");
            }

            // Redirecionar de volta para a página de edição
            request.getRequestDispatcher("/editar?id=" + id).forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/dashboard");
        }
    }
}
