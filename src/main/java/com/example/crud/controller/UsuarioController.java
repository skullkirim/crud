package com.example.crud.controller;

import com.example.crud.model.Usuario;
import com.example.crud.service.UsuarioService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
    }
    @GetMapping
    public List<Usuario> listarUsuarios() {
    return usuarioService.listarUsuarios();
    }
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
    return usuarioService.guardarUsuario(usuario);
    }
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
    usuarioService.eliminarUsuario(id);
    }
}