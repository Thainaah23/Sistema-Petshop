-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 25-Nov-2023 às 10:58
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `sistema`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `agendamento`
--

CREATE TABLE `agendamento` (
  `indice` int(8) NOT NULL,
  `opcoes_agendamento` varchar(90) NOT NULL,
  `cliente_fk` bigint(8) NOT NULL,
  `data_agendamento` varchar(255) NOT NULL,
  `horario` varchar(255) NOT NULL,
  `preco` double NOT NULL,
  `situacao` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` bigint(8) NOT NULL,
  `nome_c` varchar(120) NOT NULL,
  `cpf_cliente` varchar(50) NOT NULL,
  `data_cadastro` varchar(255) NOT NULL DEFAULT current_timestamp(),
  `nome_pet` varchar(255) NOT NULL,
  `Categoria` varchar(150) NOT NULL,
  `peso_kg` varchar(255) NOT NULL,
  `raca` varchar(255) NOT NULL,
  `observacoes` varchar(255) NOT NULL,
  `telefone_cliente` varchar(200) NOT NULL,
  `situacao` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nome_c`, `cpf_cliente`, `data_cadastro`, `nome_pet`, `Categoria`, `peso_kg`, `raca`, `observacoes`, `telefone_cliente`, `situacao`) VALUES
(8, 'Juliana Silva Freitas', '323.244.543-65', '2023-05-20', 'Carequinha', 'Canino', '25kg', 'Xoloitzcuintle', 'Alergia a poeira', '(35)34546-5798', 'Vinculado'),
(9, 'Jonas Barbosa Ramos', '232.874.823-72', '2023-05-10', 'Dogão', 'Canino', '12,25kg', 'Buldogue', 'Nenhuma alergia', '(24)32343-5342', 'Vinculado'),
(10, 'Luis Otavio', '131.232.423-56', '2023-07-29', 'Alemão', 'Canino', '43,10', 'Pastor Alemão', 'Alergia a pulgas', '(23)42423-4523', 'Vinculado'),
(11, 'Rafael Silva do Patrocinio', '123.456.789-10', '2023-04-12', 'Luna', 'Felino', '4kg', 'Siamês', 'Toma remedio para não engolir pelos', '(21)96628-3432', 'Vinculado'),
(12, 'Joao Guilherme Santos', '394.239.482-93', '2023-04-23', 'Doguinho', 'Canino', '4,5kg', 'Pinchser', 'Nenhuma alergia', '(21)89384-9224', 'Vinculado'),
(13, 'Kawane Ferreira Ribeiro', '123.456.789-90', '2023-08-08', 'Cascão', 'Canino', '27kg', 'Rhusky', 'Nenhuma alergia', '(21)90498-5992', 'Vinculado'),
(17, 'Maria Dark', '351.992.117-06', '2023-09-07', 'Pikachu', 'Aves', '120G', 'Calopsita', 'Nenhuma', '(21)99163-7637', 'Vinculado'),
(18, 'Julia Vieira dos Santos', '938.749.287-49', '2023-09-10', 'Sansão', 'Roedores', '2kg', 'Angorá Inglês', 'Apresenta pelagem sensível e alergia a poeira', '(21)13212-3234', 'Vinculado'),
(19, 'Iris Motta da Silva', '382.493.773-45', '2023-10-10', 'Mickey Mouse', 'Roedores', '150g', 'Hamster', 'Dentes pequenos', '(21)30198-2308', 'Vinculado'),
(20, 'Cezar Lima Moraes', '094.209.430-85', '2023-10-26', 'Gato de Botas', 'Felino', '5g', 'Siamês', 'Alergia a poeira', '(21)93459-4903', 'Vinculado'),
(21, 'Francisco Ferreira', '283.424.283-42', '2023-11-16', 'Alemão', 'Canino', '9g', 'Pastor Alemão', 'nenhuma', '(21)36824-7826', 'Vinculado');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `id_fornecedor` int(8) NOT NULL,
  `razao_empresarial` varchar(120) NOT NULL,
  `telefone_fornecedor` varchar(50) NOT NULL,
  `cnpj` varchar(25) NOT NULL,
  `tipo_produto` varchar(255) NOT NULL,
  `nome_fantasia` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `situacao` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`id_fornecedor`, `razao_empresarial`, `telefone_fornecedor`, `cnpj`, `tipo_produto`, `nome_fantasia`, `email`, `situacao`) VALUES
(8, 'Comércio atacadista de alimentos para animais', '(11)30701-1000', '11.462.614/0001-01', 'Ração', 'PREMIER PET COMERCIAL LTDA', 'tributario@premierpet.com.br', 'Vinculado'),
(9, 'Alimentos para gatos', '(21)2743-6823', '10.012.129/3342-43', 'Ração para gatos', 'Whiskas', 'whiskas@gmail.com', 'Vinculado'),
(10, 'Distribuidora de produtos pra petshop', '(11)2914-1594', '10.203.622/0001-70', 'Produtos e acessórios para pets no geral', 'My Pet', 'mypet@gmail.com', 'Vinculado'),
(11, 'Golden', '(24)2343-5345', '13.123.123/0001-01', 'Ração para cachorro', 'Golden', 'golden@gmail.com', 'Vinculado');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id_func` bigint(8) NOT NULL,
  `nome_func` varchar(255) NOT NULL,
  `telefone_func` varchar(255) NOT NULL,
  `email_func` varchar(255) NOT NULL,
  `cargo_func` varchar(255) NOT NULL,
  `data_admissao` varchar(255) NOT NULL,
  `situacao` varchar(50) NOT NULL,
  `cpf_func` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id_func`, `nome_func`, `telefone_func`, `email_func`, `cargo_func`, `data_admissao`, `situacao`, `cpf_func`) VALUES
(10020, 'Thaina Silva do Patrocinio', '(21)13123-1233', 'thaina@gmail.com', 'Gerente', '2023-02-04', 'Contratado', '123.243.555-64'),
(10021, 'Jorge Wagner Alves', '(21)32434-5356', 'jorgewag@gmail.com', 'Atendente', '2023-04-08', 'Contratado', '234.345.345-66'),
(10022, 'Achyley Julia Moraes', '(21)34235-4667', 'achyley@gmail.com', 'Estoquista', '2023-05-10', 'Contratado', '213.234.567-78'),
(10023, 'William Amorim', '(23)24234-2343', 'william@gmail.com', 'Gerente', '2023-06-19', 'Contratado', '132.324.342-34'),
(10024, 'Felipe Campos Santos', '(21)28342-3424', 'felipe@gmail.com', 'Gerente', '2023-08-18', 'Contratado', '242.342.342-46'),
(10025, 'José Augusto', '(21)98279-9607', 'jose.augusto@hotmail.com', 'Atendente', '2023-05-19', 'Contratado', '031.060.790-15'),
(10026, 'Gilber Ribeiro da Silva', '(21)99163-7637', 'gilberibeiro1980@gmail.com', 'Estoquista', '2023-11-02', 'Contratado', '096.350.707-11'),
(10028, 'Ysla Aguiar', '(21)23123-2423', 'ysla@gmail.com', 'Gerente', '2023-09-09', 'Contratado', '232.136.765-65'),
(10029, 'Leoncio Alves', '(21)27648-2763', 'leoncio@gmail.com', 'Banhista ou tosador', '2023-10-01', 'Contratado', '485.738.583-74'),
(10030, 'Helena Alves da Silva', '(21)92423-9489', 'helenaalves@gmail.com', 'Gerente', '2023-11-07', 'Contratado', '211.334.324-53'),
(10031, 'João Gomes Gourlate', '(21)23424-5353', 'joao@gmail.com', 'Estoquista', '2023-11-06', 'Contratado', '276.286.742-76');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `codigo_prod` int(8) NOT NULL,
  `nome_prod` varchar(255) NOT NULL,
  `data_validade` varchar(40) DEFAULT NULL,
  `data_fabricacao` date NOT NULL,
  `preco` float NOT NULL,
  `estoque_geral` int(255) DEFAULT NULL,
  `cartegoria` varchar(255) NOT NULL,
  `fornecedor` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`codigo_prod`, `nome_prod`, `data_validade`, `data_fabricacao`, `preco`, `estoque_geral`, `cartegoria`, `fornecedor`) VALUES
(24, 'Tapete Higiênico Papum para Cães de Pequeno Porte (30 un) ', NULL, '2022-08-12', 41.93, 273, 'Tapete higiênico para filhotes', 'Papum'),
(25, 'Spray Eliminador De Odores Odorout 480ml ', '', '2023-03-20', 59.9, 151, 'Spray para cães', 'Odorout'),
(27, 'Ração Golden Special para Cães Adultos Frango e Carne 15 kg ', '2028-09-02', '2023-09-03', 149.9, 219, 'Ração para cães adultos', 'Golden'),
(29, 'Ração Golden Special para Cães Adultos Frango e Carne 15 kg ', '2023-09-01', '2016-08-12', 229.49, 197, 'Ração para cães adultos', 'Golden'),
(33, 'Rg Whiskas Sache Pratos Favor. Salmon 85g ', '2028-03-10', '2021-09-09', 3.9, 282, 'Ração para filhotes', ' whiskas'),
(35, 'protetor de patas para cães', NULL, '2019-09-12', 4.81, 200, 'Roupas para pet ', 'Pet Supplies '),
(39, 'Coleira Cachorro Premium Fun Madagascar ', NULL, '2022-10-20', 15.9, 227, 'Acessórios', 'My Pet '),
(40, 'Ração de atum para filhotes', '2029-11-09', '2021-11-10', 5.8, 100, 'Ração para gatos', 'Whiskas');

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

CREATE TABLE `venda` (
  `codigo_venda` int(11) NOT NULL,
  `produto_fk` int(8) NOT NULL,
  `quant_prod` float NOT NULL,
  `cliente_fk` bigint(8) NOT NULL,
  `nome_cliente_fk` varchar(255) NOT NULL,
  `unit` double NOT NULL,
  `total_prod` double NOT NULL,
  `total_venda` double NOT NULL,
  `pagamento` varchar(255) DEFAULT NULL,
  `troco` double DEFAULT NULL,
  `data_venda` varchar(100) NOT NULL,
  `recebido` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `venda`
--

INSERT INTO `venda` (`codigo_venda`, `produto_fk`, `quant_prod`, `cliente_fk`, `nome_cliente_fk`, `unit`, `total_prod`, `total_venda`, `pagamento`, `troco`, `data_venda`, `recebido`) VALUES
(23, 24, 1, 11, 'Rafael Silva do Patrocinio', 41.93, 41.93, 41.93, 'Crédito', 28.07, '10/09/2023', 70),
(26, 27, 1, 17, 'Maria Dark', 149.9, 149.9, 149.9, 'Crédito', 50.1, '11/09/2023', 200),
(27, 24, 1, 13, 'Kawane Ferreira Ribeiro', 41.93, 41.93, 191.83, 'Crédito', 8.17, '13/09/2023', 200),
(28, 27, 1, 13, 'Kawane Ferreira Ribeiro', 149.9, 149.9, 191.83, 'Crédito', 8.17, '13/09/2023', 200),
(29, 24, 1, 10, 'Luis Otavio', 41.93, 41.93, 271.42, 'Débito', 128.58, '18/09/2023', 400),
(30, 29, 1, 10, 'Luis Otavio', 229.49, 229.49, 271.42, 'Débito', 128.58, '18/09/2023', 400),
(31, 33, 10, 13, 'Kawane Ferreira Ribeiro', 3.9, 39, 39, 'Crédito', 0, '12/10/2023', 39),
(32, 24, 3, 13, 'Kawane Ferreira Ribeiro', 41.93, 125.79, 133.59, 'Débito', 0, '16/10/2023', 133.59),
(33, 33, 2, 13, 'Kawane Ferreira Ribeiro', 3.9, 7.8, 133.59, 'Débito', 0, '16/10/2023', 133.59),
(34, 33, 3, 20, 'Cezar Lima Moraes', 3.9, 11.7, 57.03, 'Crédito', 0, '26/10/2023', 57.03),
(35, 39, 3, 20, 'Cezar Lima Moraes', 15.11, 45.33, 57.03, 'Crédito', 0, '26/10/2023', 57.03),
(36, 27, 2, 10, 'Luis Otavio', 149.9, 299.8, 341.73, 'Pix', 0, '17/11/2023', 341.73),
(37, 24, 1, 10, 'Luis Otavio', 41.93, 41.93, 341.73, 'Pix', 0, '17/11/2023', 341.73),
(39, 24, 1, 13, 'Kawane Ferreira Ribeiro', 41.93, 41.93, 41.93, 'Crédito', 8.07, '22/11/2023', 50);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `agendamento`
--
ALTER TABLE `agendamento`
  ADD PRIMARY KEY (`indice`),
  ADD KEY `cliente_fk` (`cliente_fk`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices para tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`id_fornecedor`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id_func`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`codigo_prod`);

--
-- Índices para tabela `venda`
--
ALTER TABLE `venda`
  ADD PRIMARY KEY (`codigo_venda`),
  ADD KEY `produto_fk` (`produto_fk`),
  ADD KEY `cliente_fk` (`cliente_fk`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `agendamento`
--
ALTER TABLE `agendamento`
  MODIFY `indice` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` bigint(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `id_fornecedor` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_func` bigint(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10033;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `codigo_prod` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT de tabela `venda`
--
ALTER TABLE `venda`
  MODIFY `codigo_venda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `agendamento`
--
ALTER TABLE `agendamento`
  ADD CONSTRAINT `agendamento_ibfk_1` FOREIGN KEY (`cliente_fk`) REFERENCES `cliente` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
