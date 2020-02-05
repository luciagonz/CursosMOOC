package com.luciagonzalez.TiendaRopaInterface;

public class TiendaRopaInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playera playera = new Playera(1, 299.5, "CH", "gris", "Polo");
		PlayeraPersonalizada playeraPers = new PlayeraPersonalizada(4,500,"M", "negro", "@danifdz");
		Jeans jeans = new Jeans(2, 299.22, "L", "Azul", "Skinny", 'F');
		Calcetin calcetin = new Calcetin (3, 39, "M", "Rojo");
		Smartphone smartphone = new Smartphone(5, 7999, "Motorola", "MotoGP", "Vodafone");
		
		
		
		playera.mostrarDatos("Playera gris");
		jeans.mostrarDatos("Jeans Skinny");
		calcetin.mostrarDatos("Calcetin Rojo");
		playeraPers.mostrarDatos("Playera personalizada");
		
		playera.hacerDevolucion();
		jeans.hacerDevolucion();
		calcetin.hacerDevolucion();
		smartphone.hacerDevolucion();
		
		

	}

}
