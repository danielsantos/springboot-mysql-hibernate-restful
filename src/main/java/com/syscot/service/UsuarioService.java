package com.syscot.service;

import com.syscot.model.Usuario;
import com.syscot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public List<Usuario> listarTodos() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario listarPorId(String id) {
        return usuarioRepository.findOne(Integer.valueOf(id));
    }

    public void inserir(Usuario employee) {
        usuarioRepository.save(employee);
    }

    public void atualizar(Usuario employee) {
        usuarioRepository.save(employee);
    }

    public void excluir(String id) {
        usuarioRepository.delete(Integer.valueOf(id));
    }

}
