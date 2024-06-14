<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar Curso</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <header>
        <h1>Editar Curso</h1>
    </header>

    <main>
        <c:if test="${empty curso}">
            <p>Curso não encontrado.</p>
        </c:if>

        <c:if test="${not empty curso}">
            <form action="editarCurso" method="post">
                <input type="hidden" name="id" value="${curso.id}">

                <label for="nome_curso">Nome do Curso:</label><br>
                <input type="text" id="nome_curso" name="nome_curso" value="${curso.nome_curso}" required><br>

                <label for="coordenador">Coordenador:</label><br>
                <input type="text" id="coordenador" name="coordenador" value="${curso.coordenador}" required><br>

                <label for="materias">Matérias:</label><br>
                <textarea id="materias" name="materias" rows="4" required>${curso.materias}</textarea><br>

                <label for="status">Status do Curso:</label><br>
                <select id="status" name="status">
                    <option value="analise" ${curso.statuscurso eq 'analise' ? 'selected' : ''}>Em Análise</option>
                    <option value="execucao" ${curso.statuscurso eq 'execucao' ? 'selected' : ''}>Em Execução</option>
                    <option value="finalizado" ${curso.statuscurso eq 'finalizado' ? 'selected' : ''}>Finalizado</option>
                </select><br><br>

                <button type="submit">Salvar Alterações</button>
            </form>
        </c:if>

        <c:if test="${not empty mensagem}">
            <p>${mensagem}</p>
        </c:if>

        <a href="dashboard">Voltar para o Dashboard</a>
    </main>

    <footer>
        <p>&copy; 2024 Nome da Empresa</p>
    </footer>
</body>
</html>
