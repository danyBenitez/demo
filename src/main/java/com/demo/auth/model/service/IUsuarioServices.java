package com.demo.auth.model.service;

import java.util.List;
import java.util.Optional;

import com.demo.auth.model.entity.Usuario;

public interface IUsuarioServices {

	public Usuario findByUsername(String username);
	
	public List<Usuario> findAllUsuarios();
	
	public Optional<Usuario>  findIdUser(Long idusuario);
	
	public Usuario saveUser(Usuario usuario);
}
