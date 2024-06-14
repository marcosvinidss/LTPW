
CREATE SCHEMA IF NOT EXISTS projetoLTPW;

USE projetoLTPW;


CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    matricula BIGINT,
    senha VARCHAR(255)
);

CREATE TABLE cursos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_curso VARCHAR(255) NOT NULL,
    coordenador VARCHAR(255) NOT NULL,
    materias TEXT,
    statuscurso ENUM('analise', 'execucao', 'finalizado') NOT NULL
);


-- Consulta para selecionar todos os registros da tabela usuarios
SELECT * FROM usuarios;

SET SQL_SAFE_UPDATES = 0;
DELETE FROM usuarios;
SET SQL_SAFE_UPDATES = 1;

-- Consulta para selecionar todos os registros da tabela cursos
SELECT * FROM cursos;

SET SQL_SAFE_UPDATES = 0;
DELETE FROM cursos;
SET SQL_SAFE_UPDATES = 1;



-- Comando para deletar o banco de dados (use com cautela!)
DROP DATABASE IF EXISTS projetoLTPW;
