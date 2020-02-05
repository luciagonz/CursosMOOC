package com.luciagonzalez.NetflixApp;

import com.luciagonzalez.NetflixApp.Producto;
import com.luciagonzalez.NetflixApp.iVisualizable;

public class Pelicula extends Producto implements iVisualizable {
	
	private int año;
	
	// Se define valor default como variable, por si se quiere modificar en algún momento desde fuera
	private int año_default = 2000;
	
	
	
	
	// CONSTRUCTOR 1: Valores por defecto en todos los campos.	
	public Pelicula() {
		super();
		this.año = año_default;
		// TODO Auto-generated constructor stub
	}


	// CONSTRUCTOR 2: Valores por defecto en todos los campos, excepto titulo y creador. Visto en falso.
	public Pelicula(String titulo, String genero) {
		super(titulo, genero);
		this.año = año_default;
		// TODO Auto-generated constructor stub
	}



	// CONSTRUCTOR 3: Constructor de todos los atributos (Excepto visto, que es falso siempre):
	public Pelicula(String titulo, String genero, String creador, double duracion, int año) {
		// Asigna valores a los atributos de la clase padre:
		super(titulo, genero, creador, duracion);
		
		// Asigna valores a los atributos propios de esta clase:
		this.año = año;
		
		
	}

	// Método toString:
	@Override
	public String toString() {
		return "Pelicula [titulo=" + super.getTitulo() + ", genero=" + super.getGenero() + 
				", creador=" + super.getCreador() + ", duracion=" + super.getDuracion()
				+ ", visto=" + super.isVisto() + "]" + "año=" + año + "]";
	}


	// Getters y Setters
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	

	// Interfaces
	
	@Override
	public void marcarVisto() {
		super.setVisto(true);
		System.out.println("La pelicula " + super.getTitulo() + " se ha marcado como vista");
		
	}
	



}
