package com.luciagonzalez.TiendaRopaHerencia;

public class TiendaRopaHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playera playera = new Playera(1, 299.5, "CH", "gris", "Polo");
		Jeans jeans = new Jeans(2, 299.22, "L", "Azul", "Skinny", 'F');
		Calcetin calcetin = new Calcetin (3, 39, "M", "Rojo");
		
		playera.mostrarDatos("Playera gris");
		jeans.mostrarDatos("Jeans Skinny");
		calcetin.mostrarDatos("Calcetin Rojo");
		

	}

}
