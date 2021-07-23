package br.com.empresas.resources;


import br.com.empresas.controller.EmpresasController;
import br.com.empresas.model.Filters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Hashtable;

@RestController
@RequestMapping(value = "/api/v1")
@CrossOrigin(origins ="*")
public class EmpresasResource {

    @Autowired
    EmpresasController empresasController;

    @PostMapping("/empresas")
    public ResponseEntity<?> get(@RequestBody Filters filter) {

        Hashtable retorno = new Hashtable();
        try {
            retorno.put("obj", empresasController.totais(filter));
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