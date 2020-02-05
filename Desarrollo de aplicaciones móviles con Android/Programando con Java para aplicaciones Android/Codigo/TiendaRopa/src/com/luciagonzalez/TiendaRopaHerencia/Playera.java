package com.luciagonzalez.TiendaRopaHerencia;

public class Playera extends Ropa {
	

	private String corte;

	public Playera(int id, double precio, String talla, String color, String corte) {
		super(id, precio, talla, color); // Establece variables de la clase padre ROPA
		this.corte = corte; // Establece corte, propio de la clase Playera
	}
	
	

	@Override
	public void mostrarDatos(String NombreClase) {
		// TODO Auto-generated method stub
		super.mostrarDatos(NombreClase);
		System.out.println("Corte: " + corte);
	}




	public String getCorte() {
		return corte;
	}

	public void setCorte(String corte) {
		this.corte = corte;
		
	}
	
}
