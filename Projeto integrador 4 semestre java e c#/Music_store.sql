create database Test_Music;
use Test_Music;

CREATE TABLE nivel_acesso (
    cod_Niv INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nivel_acesso VARCHAR(10),
    data_hora DATETIME NOT NULL DEFAULT NOW()
);
insert into nivel_acesso(nivel_acesso,data_hora) values ('Usuario',now());
insert into nivel_acesso(nivel_acesso,data_hora) values ('Admin',now());
insert into nivel_acesso(nivel_acesso,data_hora) values ('Contador',now());


CREATE TABLE funcionario (
    cod_func INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR(40) NOT NULL,
    cpf varchar(20) NOT NULL,
    rg varchar(20) NOT NULL,
    dtnasc varchar(10) NOT NULL,
	logradouro VARCHAR(100) NOT NULL,
    numero INT NOT NULL,
    cep varchar(30) NOT NULL,
    complemento VARCHAR(10) NULL,
	telefone varchar(15) NOT NULL,
    celular varchar(15) NOT NULL,
	data_hora DATETIME NOT NULL DEFAULT NOW()

    
);

insert into funcionario values (null,'davi',1234567,12345,'1996/03/18','rua 9','5','3232',null,5,3232,NOW());
insert into funcionario values (null,'gabriel',1234567,12345,'1996/03/18','rua 10','5','3232',null,5,3232,NOW());
select * from produtos;
CREATE TABLE usuario (
    cod_user INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    usuario CHAR(40) NOT NULL,
    senha VARCHAR(40) NOT NULL,
    cod_niv INT,
    cod_func INT,

    FOREIGN KEY (cod_niv)
        REFERENCES nivel_acesso (cod_niv)
                       ON DELETE CASCADE,

    FOREIGN KEY (cod_func)
        REFERENCES funcionario (cod_func)
        ON DELETE CASCADE,
	data_hora DATETIME NOT NULL DEFAULT NOW()

);
insert into usuario values (null,'adm','123',2,1,now());
insert into usuario values (null, 'user','123',1,1,now() );
insert into usuario values (null, 'cont','123',3,1,now() );

CREATE TABLE cliente (
    cod_cli INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome_cli VARCHAR(40) NOT NULL,
    cpf varchar(15) NOT NULL,
    rg varchar(15) NOT NULL,
    dtnasc varchar(10) NOT NULL,
	logradouro VARCHAR(100) NOT NULL,
    numero INT NOT NULL,
    cep varchar(20) NOT NULL,
    complemento VARCHAR(10) NULL,
	telefone varchar(15) NOT NULL,
    celular varchar(15) NOT NULL,
	data_hora DATETIME NOT NULL DEFAULT NOW()

    
);
insert into cliente values (null,'Balcão',1234567,12345,'1997/07/25','rua 10',5,3232,null,5,3232,NOW());
insert into cliente values (null,'Rafael',1234567,12345,'1997/07/25','rua 10',5,3232,null,5,3232,NOW());
SELECT 
    *
FROM
    cliente;

CREATE TABLE contador (
    cod_cont INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR(40) NOT NULL,
    cnpj varchar(30),
    ie varchar(30),
	logradouro VARCHAR(100) NOT NULL,
    numero INT NOT NULL,
    cep varchar(15) NOT NULL,
    complemento VARCHAR(10) NULL,
	telefone varchar(15) NOT NULL,
    celular varchar(15) NOT NULL,
	data_hora DATETIME NOT NULL DEFAULT NOW()

);
insert into contador values (null,'Gabriel',1234567,4545,'rua 10','5','3232','Mansã0','5','3232',NOW());
select * from contador;

CREATE TABLE contas (
    cod_conta INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    conta VARCHAR(30),
    valor float NOT NULL,
    dtvenc varchar(10) NOT NULL,
    cod_cont INT,
    cod_func INT,

    FOREIGN KEY (cod_cont)
        REFERENCES contador (cod_cont)
        ON DELETE CASCADE,
    FOREIGN KEY (cod_func)
        REFERENCES funcionario (cod_func)
        ON DELETE CASCADE,
			data_hora DATETIME NOT NULL DEFAULT NOW()

);
insert into contas values(null,'hue',12.5,'2015/06/07',1,1,NOW());
SELECT 
    *
FROM
		contas;


/*alter table vendas MODIFY column data_hora REMOVE DEFAULT*/

CREATE TABLE fornecedor (
    cod_forn INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome_fant CHAR(40) NOT NULL,
    cnpj varchar(30) NOT NULL,
    inscricao_est varchar(30) NOT NULL,
	logradouro VARCHAR(100) NOT NULL,
    numero INT NOT NULL,
    cep varchar(30) NOT NULL,
    complemento VARCHAR(10) NULL,
    telefone varchar(30) NOT NULL,
    celular varchar(30) NOT NULL,
	data_hora DATETIME NOT NULL DEFAULT NOW()

);
insert into fornecedor values (null,'Carlos','1234567','454','rua 10',5,'3232',null,'5','3232',NOW());

Create TABLE produtos (
    cod_prod INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    codigo_barras bigint not null,
    tipo CHAR(50) NOT NULL,
    nome CHAR(50) NOT NULL,
    unidade float NOT NULL,
    valor float,
    valor_custo float,
    quantidade int NOT NULL,
	data_hora DATETIME NOT NULL DEFAULT NOW()

);

insert into produtos values (null,1234,'cordas','violao',1,150.50,100,10,NOW());
SELECT 
    *
FROM
    produtos;
    SELECT * FROM produtos WHERE codigo_barras = 1234;
/*
alter table vendas MODIFY column data_hora datetime NOT NULL default now();

DESCRIBE vendas*/

CREATE TABLE vendas(
    cod_venda INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    valtotal FLOAT NOT NULL,
    data_hora DATETIME NOT NULL DEFAULT NOW(),
    cod_func INT,
    cod_cli INT,
    FOREIGN KEY (cod_func)
        REFERENCES funcionario (cod_func)
        ON DELETE CASCADE,
    FOREIGN KEY (cod_cli)
        REFERENCES cliente (cod_cli)
        ON DELETE CASCADE
);
select * from vendas;

insert into vendas values (null,12.5,now(),1,1);

CREATE TABLE itens_venda (
    cod_item INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    quantidade DECIMAL(15 , 2 ) NOT NULL,
    cod_prod INT,
    cod_venda INT,

    FOREIGN KEY (cod_prod)
        REFERENCES produtos (cod_prod)
        ON DELETE CASCADE,
    FOREIGN KEY (cod_venda)
        REFERENCES vendas (cod_venda)
        ON DELETE CASCADE,
	data_hora DATETIME NOT NULL DEFAULT NOW()

);
insert into itens_venda values (null,10,1,1,NOW());
SELECT 
    *
FROM
    itens_venda;


CREATE TABLE compra (
    cod_comp INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    valor_tot FLOAT NOT NULL,
	data_hora DATETIME NOT NULL DEFAULT NOW(),
    cod_forn INT,
    cod_func INT,
    FOREIGN KEY (cod_forn)
        REFERENCES fornecedor (cod_forn)
        ON DELETE CASCADE,
    FOREIGN KEY (cod_func)
        REFERENCES funcionario (cod_func)
        ON DELETE CASCADE
	
	

);
insert into compra values (null,15.4,now(),1,1);


CREATE TABLE item_compra (
    cod_item INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    quantidade FLOAT NOT NULL,
    situacao BIT NOT NULL, /*0 - a entregar, 1 - entregue */
    cod_comp INT,
    cod_prod INT NOT NULL,

    FOREIGN KEY (cod_comp)
        REFERENCES compra (cod_comp)
        ON DELETE CASCADE,
    FOREIGN KEY (cod_prod)
        REFERENCES produtos (cod_prod)
        ON DELETE CASCADE,
	data_hora DATETIME NOT NULL DEFAULT NOW()

);
insert into item_compra values (null, 10,0,1,1,NOW());

create TABLE caixa(
	cod_caixa int primary key AUTO_INCREMENT,
	valor decimal(10,2) not null,
	data_hora DATETIME NOT NULL DEFAULT NOW(),
	cod_venda INT,
	cod_comp int,
	 FOREIGN KEY (cod_comp)
        REFERENCES compra (cod_comp)
        ON DELETE CASCADE,
        
        FOREIGN KEY (cod_venda)
        REFERENCES vendas (cod_venda)
        ON DELETE CASCADE,
	status bit not null ,/*0- a vista, 1 -a prazo */
    parcela int null
	
);
select * from caixa;

-- V I S Ã O   C O M   O C U L T A M E N T O   D E   D A D O S 
CREATE VIEW escondeSenha AS
    SELECT 
        funcionario.nome, usuario.usuario
    FROM
        funcionario
            INNER JOIN
        usuario ON (funcionario.cod_func = usuario.cod_func);

SELECT 
    *
FROM
    escondeSenha;


-- V I S A O   C O M   J U N Ç Ã O   D E   T A B E L A S - FAZER UMA JUNÇÃO PARA MOSTRAR POS DADOS DA
-- COMPRA DO CLIENTE: NOME, DADOS DA COMPRA E O VALOR TOTAL DA COMPRA -ARRUMAR O BANCO DE DADOS


CREATE VIEW statusCompra2 AS
    SELECT 
        vendas.cod_venda,
        vendas.valtotal,
        vendas.data_hora,
        funcionario.nome,
        cliente.nome_cli
    FROM
        vendas
            INNER JOIN
        funcionario ON vendas.cod_func = funcionario.cod_func
            INNER JOIN
        cliente ON vendas.cod_cli = cliente.cod_cli;

SELECT 
    *
FROM
    statuscompra2;


	
-- FUNÇÃO QUE AVISA QUANTOS DIAS FALTAM P A R A   V E N C E R    A   C O N T A    D E S E J A D A
DELIMITER //
create function vencConta (cod_conta1 INT)
	returns int(3)
    reads sql data
    begin
		declare resul int(3);
        
			select datediff(dtvenc,curdate()) into resul from contas where contas.cod_conta =  cod_conta1;
            
		return resul + 1; -- verificar se o procedimento com soma de mais um é correta
	end  //
DELIMITER ;

SELECT VENCCONTA(1);








-- G A T I L H O   A T U A L I Z A   I T E M_C O M P R A
Delimiter //
create trigger insere_produtos after update
on item_compra 
for each row
	begin
		declare qtd int;
		if new.situacao = 1 then
        select produtos.quantidade into qtd from produtos where cod_prod = new.cod_prod;
			update produtos set quantidade = qtd + new.quantidade where cod_prod = new.cod_prod;
        end if;
	end //
Delimiter ;







-- G A T I L H O   C R I A   U S U A R I O   P A R A    F U N C
Delimiter //
create trigger cria_usuario after insert
on funcionario
for each row
	begin
		declare nome1 varchar(40);
		select funcionario.nome into nome1 from funcionario where cod_func = new.cod_func;
        insert into usuario (usuario,senha,cod_func,cod_Niv) values (new.nome,'123',new.cod_func,'1');
        
    end //
Delimiter ;






SELECT 
    *
FROM
    usuario;
--  I N S E R T   T E S T    F U N C I O N A R I O    P A R A G A T I L H O   I N S E R E   U S U A R I O
SELECT 
    *
FROM
    usuario;

-- I N S E R T   T E S T  C O M P R A S



UPDATE item_compra 
SET 
    situacao = 1
WHERE
    cod_item = 1;



-- TRANSAÇÃO PARA INSERT CLIENTE
BEGIN;
	-- insert into cliente values (null,'Rafael',1234567,12345,'1997/07/25','rua 10',5,3232,null,5,3232);
	


COMMIT;

/*
-- 	TRANSAÇÃO PARA VENDAS 
/*BEGIN;
insert into vendas values (null,12.5,now(),1,1); 
insert into itens_venda values (null,10,1,1);

COMMIT;


SELECT 
    cod_cli
FROM
    cliente
ORDER BY cod_cli DESC
LIMIT 1;

SELECT 
    cliente.cod_cli,
    cliente.nome_cli,
    cliente.cpf,
    cliente.rg,
    cliente.dtnasc,
    telefone.telefone,
    telefone.celular,
    endereco.logradouro,
    endereco.numero,
    endereco.cep,
    endereco.complemento
FROM
    cliente
        INNER JOIN
    telefone ON   cliente.cod_cli = telefone.cod_cliente
        INNER JOIN
    endereco ON  cliente.cod_cli = endereco.cod_cliente ;

select * from funcionario;
select * from telefone;
select * from endereco;

SELECT 
    funcionario.cod_func,
    funcionario.nome,
    funcionario.cpf,
    funcionario.rg,
    funcionario.dtnasc,
    telefone.telefone,
    telefone.celular,
    endereco.logradouro,
    endereco.numero,
    endereco.cep,
    endereco.complemento
FROM
    funcionario
        INNER JOIN
    telefone ON   funcionario.cod_func = telefone.cod_funcionario
        INNER JOIN
    endereco ON  funcionario.cod_func = endereco.cod_funcionario ;
    
    
select * from contador;
select * from telefone;
select * from endereco;
SELECT 
    contador.cod_cont,
    contador.nome,
    contador.cnpj,
    contador.ie,
    telefone.telefone,
    telefone.celular,
    endereco.logradouro,
    endereco.numero,
    endereco.cep,
    endereco.complemento
FROM
    contador
        INNER JOIN
    telefone ON   contador.cod_cont = telefone.cod_contador
        INNER JOIN
    endereco ON  contador.cod_cont = endereco.cod_contador ;
    
    select * from Fornecedor;
select * from telefone;
select * from endereco;
SELECT 
    fornecedor.cod_forn,
    fornecedor.nome_fant,
    fornecedor.cnpj,
    fornecedor.inscricao_est,
    telefone.telefone,
    telefone.celular,
    endereco.logradouro,
    endereco.numero,
    endereco.cep,
    endereco.complemento
FROM
    fornecedor
        INNER JOIN
    telefone ON   fornecedor.cod_forn = telefone.cod_fornecedor
        INNER JOIN
    endereco ON  fornecedor.cod_forn = endereco.cod_fornecedor ;
    
    select * from usuario;
SELECT 
    usuario.cod_user,
    usuario.usuario,
    usuario.senha,
    nivel_acesso.nivel_acesso,
    funcionario.nome
    
FROM
    usuario
        INNER JOIN
    nivel_acesso ON   usuario.cod_user = nivel_acesso.cod_niv
        INNER JOIN
    funcionario ON  usuario.cod_func = funcionario.cod_func ;
    
    select * from contas;
    
    
    
    
    
    SELECT 
    contas.conta,
    contas.valor,
    contas.dtvenc,
    contador.nome,
    funcionario.nome
    
FROM
    contas
        INNER JOIN
    contador ON   contador.cod_cont = contas.cod_conta
        INNER JOIN
    funcionario ON  contas.cod_conta = funcionario.cod_func ;
    
    
    
    
SELECT
    cliente.cod_cli,
    cliente.nome_cli,
    cliente.cpf,
    cliente.rg,
    cliente.dtnasc,
    telefone.telefone,
    telefone.celular,
    endereco.logradouro,
    endereco.numero,
    endereco.cep,
    endereco.complemento
FROM
    cliente
        INNER JOIN
    telefone ON   telefone.cod_cliente = cliente.cod_cli
        INNER JOIN
    endereco ON  endereco.cod_cliente = cliente.cod_cli where cliente.cod_cli = telefone;
		
    select * from cliente;
    select * from telefone;
    
    
    select cod_cli from cliente order by cod_cli desc limit 1
       */
       
    select * from itens_venda
    select * from contador;
    select * from contas;
    select * from funcionario;
    
    select contas.conta,contas.valor,contas.dtvenc,funcionario.nome,contador.nome from contas inner join funcionario inner join contador 
    where contas.cod_func = funcionario.cod_func and contas.cod_cont = contador.cod_cont;
    
    
    
    UPDATE contas SET conta='ADSAD', valor='111', dtvenc='11/10/20015' WHERE cod_conta = 3;
