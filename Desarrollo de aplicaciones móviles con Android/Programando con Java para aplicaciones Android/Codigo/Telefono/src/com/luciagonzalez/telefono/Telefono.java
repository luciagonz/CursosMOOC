package com.luciagonzalez.telefono;

public class Telefono {
	

	
	// Atributos
	private int id; // No se podrá modificar desde fuera
	public String marca; // Sí se podrá modificar desde fuera
	public String modelo; // Sí se podrá modificar desde fuera
	public double precio; // Sí se podrá modificar desde fuera
	
	/////////////// COMPORTAMIENTOS - MÉTODOS //////////////////
	
	// Método constructor de objeto, con atributos mínimos:
	
	// Sobrecarga del método constructor para tener dos formas diferentes
	// de crear un objeto:
	
	
	// Datos de instanciación por defecto:
	public Telefono () {

		this.id = 0;
		this.marca = "Motorola";
		this.modelo = "Moto-E";
		this.precio = 1;
	}

	// Datos de instanciación manual con parámetros específicos:

	public Telefono (int id, String marca, double precio) {
		this.id = id;
		this.marca = marca;
		this.precio = precio;
	}
	
	
	// Método para mostrar datos del teléfono
	public void mostrarDatos() {
		// El método tendrá el siguiente comportamiento
		System.out.println("Datos del teléfono");
		System.out.println("Id: " + id);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Precio: " +  precio);
		System.out.println("");
		
		
	}
//
//	public void marca(String marca) {
//		// TODO Auto-generated method stub
//		this.marca = marca;
//	}
//
//	public void precio(int precio) {
//		// TODO Auto-generated method stub
//		this.precio = precio;
//		
//	}
//
//	public void id(int id) {
//		// TODO Auto-generated method stub
//		this.id = id;
//	}
//
//	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		
		if (precio > 0) 
		{
		this.precio = precio;
		}
		
		else 
		{
			System.out.println("El precio debe de ser positivo");
		}
	}


}
