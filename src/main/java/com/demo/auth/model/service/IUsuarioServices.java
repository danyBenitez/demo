package com.demo.auth.model.service;

import com.demo.auth.model.entity.Usuario;

public interface IUsuarioServices {

	public Usuario findByUsername(String username);
}
