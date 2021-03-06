package br.com.empresas.resources;

import br.com.empresas.Util.UtilToken;
import br.com.empresas.controller.EmpresasController;
import br.com.empresas.empresasConnections.EmpresaConnection;
import br.com.empresas.model.Empresas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Hashtable;

@RestController
@RequestMapping(value = "/api/v1")
@CrossOrigin(origins ="*")
public class EmpresasResource {


    @Autowired
    EmpresasController objController;

    @Autowired
    EmpresaConnection connection;

    @PostMapping("/empresas")
    public ResponseEntity<?> save(@RequestHeader(value = "Authorization")String token, @RequestBody Empresas empresas) throws SQLException {

        Hashtable retorno = new Hashtable();
        Connection con = null;

        try {

            String decode = UtilToken.decode(token);
            con = connection.getNewConnections(decode);

            objController.save(empresas,con);
            retorno.put("ret", "success");
            retorno.put("motivo", "OK");
            retorno.put("obj", empresas);
        }
        catch (SQLException e ) {
            retorno.put("ret", "unsuccess");
            retorno.put("motivo",e.getMessage());
        } catch (IllegalAccessException ex) {
            retorno.put("ret", "unsuccess");
            retorno.put("motivo",ex.getMessage());
        }
        finally {
            con.close();
        }

        return ResponseEntity.ok().body(retorno);
    }

    @GetMapping("/empresas/{id}")
    public ResponseEntity<?> get(@RequestHeader(value = "Authorization")String token, @PathVariable(value="id") int id) throws SQLException {

        Hashtable retorno = new Hashtable();
        Connection con = null;

        try {

            String decode = UtilToken.decode(token);
            con = connection.getNewConnections(decode);

            if(id == -100){
                retorno.put("obj", new Empresas());
            }
            else{
                retorno.put("obj", objController.getById(id,con));
            }

            retorno.put("ret", "success");
            retorno.put("motivo", "OK");
        }
        catch (SQLException e ) {
            retorno.put("ret", "unsuccess");
            retorno.put("motivo",e.getMessage());
        }
        finally {
            con.close();
        }

        return ResponseEntity.ok().body(retorno);
    }
}
