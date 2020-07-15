package com.demo.auth.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;

	@Column(name = "username", unique = true, length = 20)
	private String username;

	@Column(name = "password", length = 80)
	private String password;

	@Column(name = "activo")
	private boolean activo;
	
	@Column(name = "nombre", length = 20)
	private String nombre;
	
	@Column(name = "apellido_paterno", length = 20)
	private String apellido_paterno;
	
	@Column(name = "apellido_materno", length = 20)
	private String apellido_materno;
	
	@Column(name = "email", length = 50)
	private String email;
	

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "usuarios_roles",joinColumns = @JoinColumn(name="usuario_id"), 
	inverseJoinColumns =@JoinColumn(name="role_id") ,
	uniqueConstraints = {@UniqueConstraint(columnNames = {"usuario_id","role_id"})})
	private List<Rol> roles;

	public Usuario() {
	}

	public Usuario(long idUsuario, String username, String password, boolean activo, String nombre,
			String apellido_paterno, String apellido_materno, String email, List<Rol> roles) {
		super();
		this.idUsuario = idUsuario;
		this.username = username;
		this.password = password;
		this.activo = activo;
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.email = email;
		this.roles = roles;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
