package br.com.empresas.Util;

import br.com.empresas.empresasConnections.EmpresaConnection;
import com.atom.Atom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Geovane
 * Gerado automaticaente por AdonaiSoft - Utilitário
 */

@RestController
public class DynamicController {

    @Autowired
    EmpresaConnection connection;

    String sql ="" ;

    public Object dynamiDataTable(Dynamic table) throws SQLException {

        Hashtable retorno = new Hashtable();
        Connection con = connection.getNewConnections("konoha_inf");

        Map m = (Map)Atom.getOne(Map.class,con,"select sql,tablebase from dynamic where route = '" + table.getRoute() + "'");

        String sql = m.get("sql").toString();
        sql = sql + " where "+ m.get("tablebase")+  ".id > 0 "+ table.getFilters() + " order by " + table.getOrders();
        List<Map> dt = (List<Map>)Atom.getAll(Map.class,con,sql + " limit 20 offset("+ table.getPagging() +"-1)*20;");

        Map qtd = (Map)Atom.getOne(Map.class,con,"select count(id) as quantidade from " +m.get("tablebase") + " where id > 0 " + table.getFilters());

        retorno.put("rows",qtd.get("quantidade"));
        retorno.put("obj",dt);
        con.close();
        return retorno;
    }


    public Dynamic save(Dynamic obj, Connection con) throws SQLException, IllegalAccessException {

        int scalar = 0;

        con.setAutoCommit(false);

        if(obj.isAdd()){
            scalar = Atom.insertedOne(obj,con);

        }
        else if(obj.isEdit()){
            Atom.editingOne(obj,con);
        }
        else if(obj.isDel()){
            Atom.deleted(con, "dynamic", "",obj.getId());
        }
        con.commit();
        con.close();
        return obj;
    }
    public Object getById(int id,Connection con) throws SQLException {

        Object object = new Object();

        String sql = "select * from dynamic where id = " + id;

        object =  Atom.getOne(Dynamic.class,con,sql);

        return object;
    }
}
