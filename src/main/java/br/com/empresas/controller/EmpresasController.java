package br.com.empresas.controller;

import br.com.empresas.model.Empresas;
import com.atom.Atom;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Geovane
 * Gerado automaticaente por AdonaiSoft - Utilitário
 */

@RestController
public class EmpresasController {



    String sql ="" ;


    public Empresas save(Empresas obj, Connection con) throws SQLException, IllegalAccessException {

        int scalar = 0;

        con.setAutoCommit(false);

        if(obj.isAdd()){
            scalar = Atom.insertedOne(obj,con);

        }
        else if(obj.isEdit()){
            Atom.editingOne(obj,con);
        }
        else if(obj.isDel()){
            Atom.deleted(con, "empresas", "",obj.getId());
        }
        con.commit();
        con.close();
        return obj;
    }
    public Object getById(int id,Connection con) throws SQLException {

        Object object = new Object();

        String sql = "select * from empresas where id = " + id;

        object =  Atom.getOne(Empresas.class,con,sql);

        return object;
    }
}
