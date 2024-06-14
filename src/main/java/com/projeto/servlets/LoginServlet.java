package com.seuprojeto.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String matricula = request.getParameter("matricula");
        String senha = request.getParameter("senha");

        // Aqui você faria a lógica de autenticação
        // Exemplo simplificado de redirecionamento após o login
        if ("admin".equals(matricula) && "admin123".equals(senha)) {
            response.sendRedirect("home.jsp"); // Página de sucesso (home.jsp)
        } else {
            response.sendRedirect("index.jsp?login=error"); // Página de login com erro (index.jsp)
        }
    }
}
