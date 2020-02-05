package com.luciagonzalez.NetflixApp;


public class Producto {
	
	

	// Variables de la superclase Producto (atributos compartidos entre Películas y Series):
	private String titulo;
	private String genero;
	private String creador;
	private double duracion;
	private boolean visto;
	
	
	// Se definen los datos default como variable, porque así se podria crear un método para 
	// modificarlos en caso que sea necesario.
	private String titulo_default = "default";
	private String genero_default = "Genero default";
	private String creador_default = "-";
	private double duracion_default = 0;
	private boolean visto_default = true;
	
	// CONSTRUCTOR 1: Valores por defecto en todos los campos.
	public Producto() {
		super();
		this.titulo = titulo_default;
		this.genero = genero_default;
		this.creador = creador_default;
		this.duracion = duracion_default;
		this.visto = visto_default;
	}
	
	// CONSTRUCTOR 2: Valores por defecto en todos los campos, excepto titulo y creador. Visto en falso.
	
	public Producto(String titulo, String genero) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador_default;
		this.duracion = duracion_default;
		this.visto = false;
	}
	
	// CONSTRUCTOR 3: Constructor de todos los atributos (Excepto visto, que es falso).
	public Producto(String titulo, String genero, String creador, double duracion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
		this.visto = false;
	}
	

	
	// MÉTODO toString:
	@Override
	public String toString() {
		return "Producto [titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", duracion=" + duracion
				+ ", visto=" + visto + "]";
	}


	// Getters y Setters
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}


	public double getDuracion() {
		return duracion;
	}


	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}


	public boolean isVisto() {
		return visto;
	}


	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	
	
	

}
