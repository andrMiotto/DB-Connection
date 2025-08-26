create database if not exists MYSQLTESTE;
use MYSQLTESTE;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100)
);

select * from usuarios;

CREATE TABLE alunos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomeAluno VARCHAR(100),
    matricula VARCHAR(20),
    curso VARCHAR(100)
);

select * from alunos;


CREATE TABLE produtos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomeProduto VARCHAR(100),
    precoProduto DECIMAL(10,2),
    quantidadeProduto INT
);

select * from produtos;


CREATE TABLE pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente VARCHAR(100),
    data_pedido DATE,
    total DECIMAL(10,2)
);

select * from pedidos;


CREATE TABLE livros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tituloLivro VARCHAR(200),
    autorLivro VARCHAR(100),
    ano_publicacaoLivro INT
);

select * from livros;

CREATE TABLE funcionarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomeFuncionario VARCHAR(100),
    cargoFuncionario VARCHAR(50),
    salarioFuncionario DECIMAL(10,2)
);

select * from funcionarios;

