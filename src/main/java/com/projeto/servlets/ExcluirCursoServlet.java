import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deletar")
public class ExcluirCursoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idStr = request.getParameter("curso_id");

        if (idStr != null) {
            int id = Integer.parseInt(idStr);

            // Excluir o curso do banco de dados
            boolean excluido = CursoDAO.excluirCurso(id); // Implementar o método

            if (excluido) {
                response.getWriter().write("Curso excluído com sucesso.");
            } else {
                response.getWriter().write("Erro ao excluir o curso.");
            }
        } else {
            response.getWriter().write("ID do curso não especificado.");
        }
    }
}
