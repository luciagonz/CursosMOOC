package com.luciagonzalez.HolaMundo;

public class HolaMundo {

	public static void main(String[] args) {
		//	EJEMPLO 1: ESCRIBIR UN TEXTO EN LA CONSOLA
		System.out.println("Hola Mundo ;)"); 
		
		////////////// TIPOS DE VARIABLES //////////////
		//	EJEMPLO 2: EJERCICIO CON ENTEROS
		//		Definición de variables de números enteros correspondientes a lo necesario según el 
		//		tipo de dato que vamos a asignar (en android es muy importante optimizar la memoria)
		short i = 0; // 2 bytes
		byte j = 0; // 1 byte
		int k = 0; // 4 bytes
		long l = 0; // 8 bytes
		
		byte edad = 22;
		short year = 2000;
		int id = 4587654;
		long hora = 992228888;
	
		//		EJEMPLO 3: EJERCICIO CON DECIMALES
		float estatura = 1.80f; // Importante: se tiene que poner la letra f para indicar que es de coma flotante
		double resultado = 932.456908722; // No es necesario indicar la d en la variable
	
		//		EJEMPLO 4: EJERCICIO CON CARACTERES
		char genero = 'F'; // Sólo permite almacenar una letra
		
		//		EJEMPLO 5: EJERCICIO CON BOOLEANOS
		boolean status = true;
		
		//		EJEMPLO 6: EJERCICIO CON ARRAYS DE UNA DIMENSIÓN
		int[] miArregloInt = null; // Declaración del array
		int[] miArregloInt2 = new int[5]; // Declarar y definir con Indices 0.1,2,3,4
		miArregloInt2[2] = 5; // Asiganción de un valor a una posición del arreglo
		System.out.println(miArregloInt2[2]); // Imprimir valor por pantalla
		miArregloInt2[0] = 0;
		miArregloInt2[1] = 1;
		miArregloInt2[3] = 3;
		miArregloInt2[4] = 4;
		
		//		EJEMPLO 7: EJERCICIO CON ARRAYS DE DOS DIMENSIÓN		
		double[][] miArregloDouble2D = new double[3][3]; // Declarar matriz
		miArregloDouble2D[2][1] = 3.4; // Asiganción de un valor a una posición del arreglo
		System.out.println(miArregloDouble2D[2][1]);
		
		//////////////TIPOS DE OPERADORES //////////////
		// Operador aritmético
		int fechaNacimiento = year - edad;
		System.out.println("Año de nacimiento operador aritmético: " + fechaNacimiento);
		// Operador de asignación
		year -= edad;
		System.out.println("Año de nacimiento operador asignación: " + year);
		
		// Operador incremento prefijo/postfijo

		i++; // i = i + 1 (4). Incrementa y luego asigna el valor a la variable
		System.out.println(i);
		++i; // i = i + 1 (4). Asigna el valor a la variable y luego incrementa.
		System.out.println(i);
		
		System.out.println("Impresión valor prefijo: " + (++i));
		System.out.println("Impresión valor postfijo: " + (i++)); // primero hace el print, luego aumenta
		System.out.println("Si lo volvemos a imprimir, ya sale correcto: " + i);
		
		// Operadores comparativos
		int a = 4;
		int b = 5;
		
		System.out.println("Son a y b iguales: " + (a == b));
		System.out.println("Son a y b diferetes: " + (a != b));
		System.out.println("Es a menor que b: " + (a < b));
		System.out.println("Es a mayor que b: " + (a > b));
		
		// Operadores booleanos
		boolean x = true;
		boolean y = false;
		
		System.out.println("Son ambos verdaderos: " + (x && y));
		System.out.println("Alguno de los dos es verdadero: " + (x||y));
		System.out.println("Contrario a la variable x: " + !x);
		
		
	}
	

}
