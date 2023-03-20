package com.example.democrudmongo.model;

import org.springframework.data.annotation.Id;

public class Libro {
	@Id
	private Long id;

	private String nombre;
	private String genero;
	private Long precio;
	

	public Libro() {
		
	}

	public Libro(Long id, String nombre, String genero, Long precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.precio = precio;
	}

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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

}
