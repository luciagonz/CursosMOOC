package com.luciagonzalez.TiendaRopaInterface;

public class Jeans extends Ropa implements iDevolucion {
	

	private String corte;
	private char genero;
	
	
	public Jeans(int id, double precio, String talla, String color, String corte, char genero) {
		super(id, precio, talla, color);
		this.corte = corte;
		this.genero = genero;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void mostrarDatos(String NombreClase) {
		// TODO Auto-generated method stub
		super.mostrarDatos(NombreClase);
		System.out.println("Corte: " + corte);
		System.out.println("Género: " + genero);
	}


	public String getCorte() {
		return corte;
	}

	public void setCorte(String corte) {
		this.corte = corte;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}



	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Devolución de unos Jeans");
	}


}
