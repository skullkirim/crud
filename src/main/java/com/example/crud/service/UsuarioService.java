package com.example.crud.service;

import com.example.crud.model.Usuario;
import com.example.crud.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
public UsuarioService(UsuarioRepository usuarioRepository) {
this.usuarioRepository = usuarioRepository;
}
public List<Usuario> listarUsuarios() {
    return usuarioRepository.findAll();
    }
    public Usuario guardarUsuario(Usuario usuario) {
    return usuarioRepository.save(usuario);
    }
    public void eliminarUsuario(Long id) {
    usuarioRepository.deleteById(id);
    }
}

