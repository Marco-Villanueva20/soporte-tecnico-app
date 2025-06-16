package com.cibertec.controller;
import com.cibertec.service.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.model.Auth;
import com.cibertec.model.Usuario;
import com.cibertec.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioServiceImpl usuarioService;

	@PostMapping("/auth/login")
	public ResponseEntity<?> login(@RequestBody Auth authRequest) {
		return usuarioService.login(authRequest);
	}
	@PostMapping("/auth/registrar")
	public ResponseEntity<?> registrar(@RequestBody Usuario usuario) {
		return usuarioService.registrar(usuario);
	}
}
