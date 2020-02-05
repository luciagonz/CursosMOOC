package com.luciagonzalez.NetflixApp;

import com.luciagonzalez.NetflixApp.Producto;
import com.luciagonzalez.NetflixApp.iVisualizable;

public class Serie extends Producto implements iVisualizable {
	
	private int nTemporadas;
	private int nTemporadasDefault = 1;

	
	
	// CONSTRUCTOR 1: Valores por defecto en todos los campos.	
	public Serie() {
		super();
		this.nTemporadas = nTemporadasDefault;
		super.setVisto(false); // Aprovecha el método por defecto, pero se asegura que visto = false
		// TODO Auto-generated constructor stub
	}


	// CONSTRUCTOR 2: Valores por defecto en todos los campos, excepto titulo y creador. Visto en falso.
	public Serie(String titulo, String genero) {
		super(titulo, genero);
		this.nTemporadas = nTemporadasDefault;
		super.setVisto(false);
		// TODO Auto-generated constructor stub
	}



	// CONSTRUCTOR 3: Constructor de todos los atributos (Excepto visto, que es falso siempre):
	public Serie(String titulo, String genero, String creador, double duracion, int nTemporadas) {
		// Asigna valores a los atributos de la clase padre:
		super(titulo, genero, creador, duracion);
		// Asigna valores a los atributos propios de esta clase:
		this.nTemporadas = nTemporadas;
		super.setVisto(false);
		
	}
	

	
	
	// Método toString:
	@Override
	public String toString() {
		return "Serie [titulo=" + super.getTitulo() + ", genero=" + super.getGenero() + 
				", creador=" + super.getCreador() + ", duracion=" + super.getDuracion()
				+ ", visto=" + super.isVisto() + "]" + " Número de temporadas =" + nTemporadas + "]";
		}

	
	// Getters y Setters:
	public int getnTemporadas() {
		return nTemporadas;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}
	
	

	// Interfaces
	
	@Override
	public void marcarVisto() {
		super.setVisto(true);
		System.out.println("La serie " + super.getTitulo() + " se ha marcado como vista");
		
	}


}
