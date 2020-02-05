package com.gonzalezlucia.arrayList;

import java.util.ArrayList;

public class AndroidArrayList {

	public static void main (String [] args) {
		// Definir ArrayList
		ArrayList <String> androids = new ArrayList <String> ();
		
		// Agregar elementos al ArrayList
		androids.add("Cupcake");
		androids.add("Donut");
		androids.add("Eclair");
		androids.add("Froyo");
		androids.add("Gingerbread");
		androids.add("Honeycomb");
		androids.add("Ice Cream Sandwich");
		androids.add("Jilly Bean");
		androids.add("Kit Kat");
		androids.add("Lollipop");
		
		// Ver tamaño y elementos
		System.out.println("Tamaño: " + androids.size());
		System.out.println("Versiones de android: " + androids);
		
		// Eliminar elemento
		androids.remove(3);
		
		// Ver tamaño y elementos después de borrar
		System.out.println("Tamaño: " + androids.size());
		System.out.println("Versiones de android: " + androids);
		
		
	}
	
}
