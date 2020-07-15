package com.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.auth.model.entity.Usuario;
import com.demo.auth.model.service.UsuarioServices;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Autowired
	UsuarioServices usuarioServices;
	
	@GetMapping("/helloWord")
	public String helloword() {
		return "hello word";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Usuario>> findAllUsers(){
		
		List<Usuario> body = this.usuarioServices.findAllUsuarios();
		
		if (body.isEmpty()) {
			return new ResponseEntity<List<Usuario>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Usuario>>(body, HttpStatus.OK);
	}
	
	@Secured({"ADMIN","USER"})
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Usuario>> findIdUser( @PathVariable("id") long id){
		
		Optional<Usuario> body = this.usuarioServices.findIdUser(id);
		
		if (body == null) {
			return new ResponseEntity<Optional<Usuario>> (HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Optional<Usuario>> (body, HttpStatus.OK);
		
	}
	
	@Secured("ADMIN")
	@PostMapping()
	public ResponseEntity<Usuario> saveUser(@RequestBody Usuario usuario){
		
		Usuario body = this.usuarioServices.saveUser(usuario);
		
		return new ResponseEntity<Usuario>(body,HttpStatus.OK);
	}
	
	@Secured("ADMIN")
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") long id){
		return new ResponseEntity<String>("borra do correctamente ..", HttpStatus.OK);
	}
	
	@Secured("ADMIN")
	@PutMapping(value = "/{id}")
	public ResponseEntity<String> updateUser(@PathVariable("id") long id, @RequestBody Usuario usuario){
		return new ResponseEntity<String>("Actualizado correctamente", HttpStatus.OK);
	}
	
	

}
