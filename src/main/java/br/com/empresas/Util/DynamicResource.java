package br.com.empresas.Util;

import br.com.empresas.empresasConnections.EmpresaConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Hashtable;

@RestController
@RequestMapping(value = "/api/v1")
@CrossOrigin(origins ="*")
public class DynamicResource {


    @Autowired
    DynamicController objController;

    @Autowired
    EmpresaConnection connection;

    @PostMapping("/dynamic")
    public ResponseEntity<?> getAll(@RequestHeader(value = "Authorization")String token, @RequestBody Dynamic dynamic)  {

        Hashtable retorno = new Hashtable();
        try {

            retorno.put("obj", objController.dynamiDataTable(dynamic));
            retorno.put("ret", "success");
            retorno.put("motivo", "OK");
        }
        catch (SQLException e ) {
            retorno.put("ret", "unsuccess");
            retorno.put("motivo",e.getMessage());
        }
        return ResponseEntity.ok().body(retorno);
    }
}
