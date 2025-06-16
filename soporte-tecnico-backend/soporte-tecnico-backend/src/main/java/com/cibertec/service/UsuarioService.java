package com.cibertec.service;

import org.springframework.http.ResponseEntity;

import com.cibertec.model.Auth;
import com.cibertec.model.Usuario;

public interface UsuarioService {
	//Auth
	public ResponseEntity<?> login(Auth authRequest);
	//crear un usuario
	public ResponseEntity<?> registrar(Usuario usuario);
	
	
	public ResponseEntity<?> actualizar(Usuario usuario);
	public ResponseEntity<?> eliminar(Long id);
	public ResponseEntity<?> listar();
	public ResponseEntity<?> buscarPorId(Long id);
	public ResponseEntity<?> buscarPorEmail(String email);
	
}
