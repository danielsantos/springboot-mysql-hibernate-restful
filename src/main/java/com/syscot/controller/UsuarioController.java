package com.syscot.controller;

import com.syscot.model.Usuario;
import com.syscot.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService service;


    @RequestMapping("/usuarios")
    public Iterable<Usuario> listarTodos() {
        return service.listarTodos();
    }

    @RequestMapping("/usuarios/{id}")
    public Usuario listarPorId(@PathVariable String id) {
        return service.listarPorId(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/usuarios")
    public void inserir(@RequestBody Usuario usuario) {
        service.inserir(usuario);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/usuarios/{id}")
    public void atualizar(@RequestBody Usuario usuario, @PathVariable String id) {
        service.atualizar(usuario);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/usuarios/{id}")
    public void excluir(@PathVariable String id) {
        service.excluir(id);
    }
	
}