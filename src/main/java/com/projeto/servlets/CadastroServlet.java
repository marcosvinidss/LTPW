package com.seuprojeto.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String matricula = request.getParameter("matricula");
        String senha = request.getParameter("senha");

        // Aqui você faria a lógica para salvar o usuário no banco de dados
        // Exemplo simplificado de redirecionamento após o cadastro
        response.sendRedirect("index.jsp?cadastro=success"); // Página de sucesso (index.jsp)
    }
}
