CREATE TABLE public.cnaessec
(
    id integer NOT NULL,
    cnae text,
    idempresa integer
);

CREATE TABLE public.empresas
(
    id integer NOT NULL,
    cnpj text,
    tipo integer,
    fantasia text,
    situacao text,
    datasituacao text,
    motivosituacao text,
    nomecidadeexterior text,
    pais text,
    inicioatividade text,
    cnaeprincipal text,
    tipologradouro text,
    logradouro text,
    numero text,
    complemento text,
    bairro text,
    cep text,
    uf text,
    municipio integer,
    telefoneprincipal text,
    telefonesecundario text,
    email text,
    situacaoespecial text,
    datasituacaoespecial text
);

CREATE TABLE public.municipios
(
    id integer NOT NULL,
    municipio character varying(80),
    PRIMARY KEY (id)
);