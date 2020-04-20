package edu.pucmm.springboot.app.oauth.models.entity;

import java.io.Serializable;

public class Role implements Serializable {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String nombre;
	private static final long serialVersionUID = 7562307445407780060L;

}
