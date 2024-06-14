<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Painel de Cursos - SISGECC</title>
    <link rel="stylesheet" href="css/dashboard.css">
    <style>
        /* Estilos CSS */
        /* ... */
    </style>
</head>
<body>
    <%@ include file="/WEB-INF/header.jsp" %> <!-- Incluir o cabeçalho comum -->

    <div class="content">
        <div class="titulo">
            <h1>Painel de Cursos</h1>
        </div>

        <c:if test="${not empty cursos}">
            <c:forEach var="curso" items="${cursos}">
                <div class="curso">
                    <h2>${curso.nome}</h2>
                    <h3>Coordenador:</h3>
                    <p>${curso.coordenador}</p>
                    <h3>Matérias:</h3>
                    <c:forEach var="materia" items="${curso.materias}">
                        <p>${materia}</p>
                    </c:forEach>
                    <h3>Status:</h3>
                    <p>${curso.status}</p>
                    <div class="botoes">
                        <a href="editar?id=${curso.id}" class="editar">Editar</a>
                        <form action="deletar" method="post">
                            <input type="hidden" name="curso_id" value="${curso.id}">
                            <button type="submit" class="deletar" onclick="return confirm('Tem certeza que deseja excluir este curso?')">Deletar</button>
                        </form>
                    </div>
                </div>
            </c:forEach>
        </c:if>

        <c:if test="${empty cursos}">
            <p>Nenhum curso encontrado.</p>
        </c:if>
    </div>

    <script src="js/index.js"></script> <!-- Arquivo JavaScript -->

    <%@ include file="/WEB-INF/footer.jsp" %> <!-- Incluir o rodapé comum -->
</body>
</html>
