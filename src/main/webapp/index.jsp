<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
    <link rel="stylesheet" href="css/login.css">
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
                <h2 class="title title-second">Acessar sua Conta</h2>
                <p class="description description-second">Use sua matrícula e senha:</p>

                <form id="loginForm" class="form" action="login" method="POST">
                    <label class="label-input" for="">
                        <i class="far fa-user icon-modify"></i>
                        <input type="number" id="matricula" name="matricula" placeholder="Matrícula">
                    </label>

                    <label class="label-input" for="">
                        <i class="fas fa-lock icon-modify"></i>
                        <input type="password" id="senha" name="senha" placeholder="Senha">
                    </label>

                    <button type="submit" class="btn btn-second" name="submit" style="text-decoration: none;">Entrar</button>
                    <!-- Botão Cadastrar -->
                    <a href="cadastrar.jsp" class="btn btn-primary" style="text-decoration: none; margin-top: 1rem;">Cadastrar</a>
                </form>
            </div><!-- second column -->
        </div><!-- first content -->
    <script src="js/login.js"></script>
</body>
</html>
