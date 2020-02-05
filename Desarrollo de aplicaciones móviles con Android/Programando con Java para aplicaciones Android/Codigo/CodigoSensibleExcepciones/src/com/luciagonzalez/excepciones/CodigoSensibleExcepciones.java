package com.luciagonzalez.excepciones;

public class CodigoSensibleExcepciones {

	public static void main(String[] args) {
		
		try {
		// Definir un vector de números
		int [] numeros = {5,3,8};
		
		// Como en esto nos pasamos de la cantidad de elementos de la matriz,
		// omitimos el error con un código de excepción (para hacer que no se ejecute, pero que el 
		// programa no se interrumpa
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println(numeros[3]);
		}
		
		// En caso de que haya un exceso de números de la matriz, sale el error:
		catch (ArrayIndexOutOfBoundsException arrayE) {
		System.out.println("Error: Se ha excedido los límites del vector de números");
		}
		
		catch (Exception e) {
			
		// Este tipo de forma de enseñar el error no es adecuada para mostrar al usuario, porque
		// muestra la ruta entera (da información del programa y además es dificil de entender)
		System.out.println("Ocurrió el siguiente error: ");
		e.printStackTrace(); // Ocurre toda la lista de errores que han ocurrido
		
		}
		
		finally {
		System.out.println("Programa finalizado");
		}
		

	}
}

