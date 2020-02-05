package com.luciagonzalez.netflix;


public class NetflixApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array de 5 elementos de cada subclase:
		Pelicula peliculas [] = new Pelicula [5]; // Array de 5 peliculas
		Serie series [] = new Serie [5]; // Array de 5 series
		
		// Creación de objetos con distintos constructores:
		peliculas[0] = new Pelicula();
		peliculas[1] = new Pelicula("Titanic","Drama");
		peliculas[2] = new Pelicula("El diario de Noah", "Drama");
		peliculas[3] = new Pelicula("Bandersnatch","Ciencia Ficción","Charlie Brooker", 185.3, 2018);
		peliculas[4] = new Pelicula("Memento","Suspense","Cristopher Nolan", 155.9, 2000);
		
		series[0] = new Serie();
		series[1] = new Serie("Game of Thrones", "Ciencia Ficción");
		series[2] = new Serie("Lost", "Ciencia Ficción");
		series[3] = new Serie("Black Mirror","Charlie Brooker","Ciencia Ficción", 60.43, 5);
		series[4] = new Serie("Merlí", "Héctor Lozano", "Comedia", 45.9, 3);
		
		// Establecer peliculas como visto:
		series[0].marcarVisto();
		series[4].marcarVisto();
		peliculas[3].marcarVisto();
		
		// Variables para máximos de temporadas y series solicitados en el ejercicio:
		int temporadas = 0;
		String serie_temp_max = " ";
		
		int año_max = 0;
		String pelicula_año_max = " ";
		
		// Cabecera de series:
		System.out.println("");
		System.out.println("El listado de series vistas es:");
		
		// Datos de series:
		for (int i = 0; i < 5; i++) {
			series[i].esVisto();
			series[i].tiempoVisto();
			if (series[i].getnTemporadas() > temporadas) {
				temporadas = series[i].getnTemporadas();
				serie_temp_max = series[i].getTitulo();
			}
			
		}
		
		// Cabecera de peliculas:
		System.out.println("");
		System.out.println("El listado de peliculas vistas es:");
		
		// Datos de peliculas:
		for (int i = 0; i < 5; i++) {
			peliculas[i].esVisto();
			peliculas[i].tiempoVisto();

			if (peliculas[i].getAño() > año_max) {
				año_max = peliculas[i].getAño();
				pelicula_año_max = peliculas[i].getTitulo();
			}
		}
		
		// Mostrar resultados máximos:
		System.out.println("");
		System.out.println("La serie con más temporadas es " + serie_temp_max + " con " + temporadas + " temporadas");
		
		System.out.println("");
		System.out.println("La pelicula más reciente es " + pelicula_año_max + " del año " + año_max);
	}

}
