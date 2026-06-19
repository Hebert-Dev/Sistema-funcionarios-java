-- Script de criação do banco de dados para o Sistema de Funcionários
-- Execute este script no MySQL antes de rodar o programa

CREATE DATABASE IF NOT EXISTS sistema_funcionarios;
USE sistema_funcionarios;

CREATE TABLE IF NOT EXISTS funcionarios (
                                            id INT PRIMARY KEY AUTO_INCREMENT,
                                            nome VARCHAR(100),
    cargo VARCHAR(50),
    salario_base DOUBLE,
    adicional DOUBLE
    );