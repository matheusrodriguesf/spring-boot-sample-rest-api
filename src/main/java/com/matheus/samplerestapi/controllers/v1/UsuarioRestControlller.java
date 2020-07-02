package com.matheus.samplerestapi.controllers.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.matheus.samplerestapi.base.ApiVersions;
import com.matheus.samplerestapi.models.entity.Usuario;
import com.matheus.samplerestapi.repositories.UsuarioRepository;

@RestController
@RequestMapping(ApiVersions.V1 + "/usuarios")
public class UsuarioRestControlller {

    @Autowired
    private UsuarioRepository repository;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> criarUsuario(@RequestBody Usuario usuario) {
        repository.save(usuario);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Usuario> recuperarUsuarios() {
        return repository.findAll();
    }
}