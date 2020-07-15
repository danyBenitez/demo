package com.demo.auth.model.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.auth.model.dao.UsuarioDAOI;
import com.demo.auth.model.entity.Usuario;

@Service
public class UsuarioServices implements UserDetailsService, IUsuarioServices{
	
	private Logger LOG = LoggerFactory.getLogger(UsuarioServices.class);

	@Autowired
	private UsuarioDAOI usuarioDAO;
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = this.usuarioDAO.findByUsername(username);
		
		if (usuario == null) {
			LOG.error("Error usuario "+ username +" no existe en el sistema");
			throw new UsernameNotFoundException("Error usuario "+ username +" no existe en el sistema");
		}
		List<GrantedAuthority> authorities = usuario.getRoles()
				.stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> LOG.info("Rol "+ authority.getAuthority()))
				.collect(Collectors.toList());
		return new User(username, usuario.getPassword(), usuario.isActivo(), true, true, true, authorities);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findByUsername(String username) {
		return this.usuarioDAO.findByUsername(username);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAllUsuarios() {
		
		return (List<Usuario>) this.usuarioDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuario> findIdUser(Long idusuario) {
		return this.usuarioDAO.findById(idusuario);
	}

	@Override
	@Transactional(readOnly = false)
	public Usuario saveUser(Usuario usuario) {
		return this.usuarioDAO.save(usuario);
	}
	

}
