<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Criar Novo Curso - SISGECC</title>
    <link rel="stylesheet" href="css/criar.css">
    <link rel="stylesheet" href="css/styles.css"> <!-- Adicione seus estilos -->
</head>
<body>
    <%@ include file="/WEB-INF/header.jsp" %> <!-- Incluir o cabeçalho comum -->

    <div class="content">
        <h1 style="margin-bottom: 20px;">Criar Novo Curso:</h1>

        <form action="criarCurso" method="POST">
            <label for="nome_curso">Nome do Curso:</label><br>
            <input type="text" id="nome_curso" name="nome_curso"><br>
            <label for="coordenador">Coordenador:</label><br>
            <input type="text" id="coordenador" name="coordenador"><br>
            <label for="materias">Matérias:</label><br>
            <textarea id="materias" name="materias" rows="4" placeholder="Digite as matérias separadas por vírgula"></textarea><br>
            <br><br>
            <label for="status">Status do Curso:</label><br>
            <select id="status" name="status">
                <option value="analise">Em Análise</option>
                <option value="execucao">Em Execução</option>
                <option value="finalizado">Finalizado</option>
            </select><br>
            <input type="submit" name="submit" value="Criar Curso">
        </form>

        <% if (request.getAttribute("mensagem") != null) { %>
            <p>${mensagem}</p>
        <% } %>
    </div>

    <script src="js/criar.js"></script> <!-- Arquivo JavaScript -->

    <%@ include file="/WEB-INF/footer.jsp" %> <!-- Incluir o rodapé comum -->
</body>
</html>
