package com.luciagonzalez.principal;

import com.luciagonzalez.telefono.Telefono;

public class Principal {
	
	public static void main(String[] args) {
		// Construcción del objeto por defecto
		Telefono miTelefono = new Telefono();
		// miTelefono.precio(400);
		miTelefono.mostrarDatos();
		
		// Construcción del objeto indicando parámetros
		Telefono miTelefono2 = new Telefono(1, "Nexus", 190);
//		miTelefono2.marca("Samsung");
//		
//		// Aunque se esté realizando una modificación, cuando se imprime
//		// no cambia, porque la variable es private
//		miTelefono.id(5); 

		// Cambio de marca posterior a la definición del objeto:
		miTelefono2.mostrarDatos();
		
		// Mostrar precio:
		System.out.println("Precio antiguo:" + miTelefono2.getPrecio());
		miTelefono2.setPrecio(5);
		System.out.println("Precio nuevo: " + miTelefono2.getPrecio());
	}

}
