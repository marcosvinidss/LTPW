<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Cadastro</title>
    <link rel="stylesheet" href="css/cadastrar.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"
        integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="content first-content">
            <div class="first-column">
                <img src="img/policiapenal.png" alt="Descrição da imagem">
            </div>

            <div class="second-column">
                <h2 class="title title-second">Crie uma Conta</h2>
                <p class="description description-second">Preencha os campos abaixo:</p>

                <form id="cadastroForm" class="form" action="cadastro" method="POST">
                    <label class="label-input" for="">
                        <i class="far fa-user icon-modify"></i>
                        <input type="text" id="nome" name="nome" placeholder="Nome">
                    </label>

                    <label class="label-input" for="">
                        <i class="far fa-id-card icon-modify"></i>
                        <input type="number" id="matricula" name="matricula" placeholder="Matrícula">
                    </label>

                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="password" id="senha" name="senha" placeholder="Senha">
                    </label>

                    <button type="submit" name="submit" class="btn btn-second">Cadastrar</button>
                    <!-- Botão Voltar para o Login -->
                    <a href="index.jsp" class="btn btn-primary" style="text-decoration: none; margin-top: 1rem;">Login</a>
                </form>
            </div><!-- second column -->
        </div><!-- first content -->
    <script src="js/cadastrar.js"></script>
</body>
</html>
