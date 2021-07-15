package br.com.empresas.controller;

import br.com.empresas.empresasConnections.EmpresaConnection;
import br.com.empresas.model.Empresas;
import com.pain_crud.Alias;
import com.pain_crud.PainCrud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Geovane
 * Gerado automaticaente por AdonaiSoft - Utilitário
 */
public class EmpresasController {

    EmpresaConnection connection = new EmpresaConnection();
    String sql ="" ;
    String descricao = "Cadastro.Empresas";
    String log ="" ;
    PainCrud pc = new PainCrud();



    public Empresas save(Empresas empresas) throws SQLException, IllegalAccessException {

        Connection con = null;
        PreparedStatement stmt = null;
        int scalar = 0;

        con = connection.getNewConnections("adonai_cnpj");

        con.setAutoCommit(false);

        if(empresas.isAdd()){
            scalar = pc.insertedOne(empresas,Empresas.class,con);

        }
        else if(empresas.isEdit()){
            pc.editingOne(empresas,Empresas.class,con,empresas.getId());
        }
        else if(empresas.isDel()){
            pc.deleted(con, empresas.getId(), Empresas.class.getAnnotation(Alias.class).value());
        }
        con.commit();
        con.close();
        return empresas;
    }
    public Object getById(int id) throws SQLException {

        Object object = new Object();
        Connection con = null;
        con = connection.getNewConnections("adonai_cnpj");

        String sql = "select * from "+Empresas.class.getAnnotation(Alias.class).value()+" where id = " + id;

        object =  pc.getOne(Empresas.class,con,sql);

        return object;
    }
}