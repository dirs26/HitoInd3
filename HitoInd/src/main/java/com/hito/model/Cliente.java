package com.hito.model;

public class Cliente {

	
	public String nombre;
	public String plan;
	public String peso;
	public String categoria;
	public int horas;
	public int competicion;
	public float precio;
	
	public Cliente( String nombre, String plan, String peso, String categoria, int horas, int competicion,
			float precio) {
		super();
		this.nombre = nombre;
		this.plan = plan;
		this.peso = peso;
		this.categoria = categoria;
		this.horas = horas;
		this.competicion = competicion;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getCompeticion() {
		return competicion;
	}

	public void setCompeticion(int competicion) {
		this.competicion = competicion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}