package com.luciagonzalez.Practica1;

public class Practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// El programa diseñado generará una matriz de rango "myRange" y 
		// la rellena con números pares y calcula la suma de cada una de las filas
		// Definir la matriz:
		System.out.println("La matriz es la siguiente: \n");
		int myRange = 4; // CAMBIAR PARA REDEFINIR LA MATRIZ
		int [] sumRow = new int [myRange];
		int [][] myArray = new int [myRange] [myRange];
		int sumTotal = 0;
		int increment = 2;
		int arrayNumber = 0;
		
		// Rellenar la matriz:
		for (int i = 0; i < myRange; i++) {
			sumRow [i] = 0;
			for (int j = 0; j < myRange; j++) {
				arrayNumber = arrayNumber + increment; // Generar el siguiente número par
				myArray [i] [j] = arrayNumber; // Asignar número a la posición de la matriz
				System.out.print("\t" + myArray [i] [j]);	// Mostrar número
				sumRow [i] = sumRow[i] + arrayNumber; // Suma de la fila
			}	
			System.out.println("\t Suma: \t" + sumRow[i]); // Fila acabada; mostrar suma total
			sumTotal = sumTotal + sumRow[i]; // Sumar fila al recuento total
		}	
		System.out.println("\n La suma total de todos los números es: " + sumTotal); // Matriz acabada;

	}

}
