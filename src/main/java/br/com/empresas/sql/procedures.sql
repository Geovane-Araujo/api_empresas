create or replace procedure pr_atualizavalores()
language plpgsql
as $$
    declare
        totalempresas bigint;
        totalempresas_ativas bigint;
        totalempresas_inativas bigint;
begin

    delete from totais;

    totalempresas = (select count(id) from empresas);
    totalempresas_ativas = (select count(id) from empresas where situacao = '02');
    totalempresas_inativas = (select count(id) from empresas where situacao <> '02');

    insert into totais(totalempresas,totalativas,totalinativas)
    values(totalempresas,totalempresas_ativas,totalempresas_inativas);

end;$$

-- para tirar as empreasas inativas
create or replace procedure pr_insereInativos()
language plpgsql
as $$

begin

insert into empresas_inativas

end;$$