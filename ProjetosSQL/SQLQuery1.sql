create database FastCredit
use FastCredit
create table Cliente(
	ClientesId int primary key identity(1,1),
	Nome varchar(50),
	Data_de_aniversário varchar(50),
	CPF bigint,
	CEP int,
	Telefone varchar(50),
	Email varchar(50)
)
insert into Cliente values('Matheo', '26/09/2000', 12345678901, 52087641, '(11) 98645-1167', 'matheozl@gmail.com')
insert into Cliente values('Miguel', '23/10/2008', 09876543210, 09889123, '(11) 95568-1276', 'miguelzl@gmail.com')
insert into Cliente values('Lucas', '02/01/1999', 12344321566, 77189234, '(11) 97534-2259', 'lucaszl@gmail.com')
insert into Cliente values('Maria', '15/08/1974', 11334567812, 01298361, '(11) 93445-2157', 'mariazl@gmail.com')
insert into Cliente values('Emerson Sheik', '04/07/2012', 88811213456, 56829573, '(11) 98135-1369', 'emersonzl@gmail.com')
insert into Cliente values('Cássio', '16/12/2012', 98765456791, 03918212, '(11) 95665-3164', 'cassiozl@gmail.com')

select * from Cliente

create table Fornecedor(
	FornecedorId int primary key identity(1,1),
	Nome_da_Firma varchar(50),
	CEP int,
	Ramo_de_atividade varchar(50),
	CNPJ bigint,
	Telefone varchar(50),
	Status_Fornecedor varchar(50),
	Email varchar(50)
)

insert into Fornecedor values('MercPad', 83715384, 'Indústria', 09281624216, '(19) 98645-1167', 'Ativo', 'merpcad@gmail.com')
insert into Fornecedor values('McBack', 52087641, 'Indústria', 12345678901, '(11) 98645-1167', 'Ativo', 'mcback@gmail.com')
insert into Fornecedor values('UpLogis', 22135547, 'Comércio', 66152749162, '(18) 98645-1167', 'Ativo', 'uplogis@gmail.com')
insert into Fornecedor values('AmBev', 26172910, 'Indústria', 45142368102, '(12) 98645-1167', 'Ativo', 'ambev@gmail.com')
insert into Fornecedor values('Nubank', 63728162, 'Serviços', 65279182536, '(13) 98645-1167', 'Inativo', 'nubank@gmail.com')
insert into Fornecedor values('Droga Elba', 43176532, 'Comércio', 09087654123, '(53) 98645-1167', 'Ativo', 'drogaelba@gmail.com')

select * from Fornecedor