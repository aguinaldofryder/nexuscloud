create table cliente (
	id_cliente serial primary key,
	nm_cliente varchar(100) not null,
	tp_pessoa int not null,
	dt_cadastro date not null,
	ds_documento varchar(14) not null
);

CREATE UNIQUE INDEX cliente_ds_documento_idx ON public.cliente (ds_documento) ;

create table endereco (
	id_endereco serial primary key,
	id_cliente int not null,
	ds_cep varchar(8) not null,
	nm_cidade varchar(60) not null,
	nm_logradouro varchar(60) not null,
	ds_numero varchar(10) not null,
	nm_bairro varchar(30) not null,
	ds_complemento varchar(100) null,
	tp_endereco int not null
);

ALTER TABLE endereco ADD CONSTRAINT endereco_cliente_fk FOREIGN KEY (id_cliente) REFERENCES public.cliente(id_cliente) ON DELETE CASCADE ON UPDATE CASCADE;

CREATE TABLE usuario (
	id_usuario serial primary key,
	nm_usuario varchar(100) not null,
	ds_login varchar(100) not null,
	ds_senha text not null
);