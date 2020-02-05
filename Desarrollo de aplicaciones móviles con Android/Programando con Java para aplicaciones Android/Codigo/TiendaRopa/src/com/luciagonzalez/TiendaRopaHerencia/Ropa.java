package com.luciagonzalez.TiendaRopaHerencia;

public class Ropa {

	private int id;
	private double precio;
	private String color;
	private String talla;
	
	// Método constructor
	public Ropa(int id, double precio, String talla, String color) {
		this.id = id;
		this.precio = precio;
		this.talla = talla;
		this.color = color;
		
	}
	
	// Imprimir datos de la ropa:
	
	public void mostrarDatos (String NombreClase) {
		System.out.println(NombreClase);
		System.out.println("Id: " + id);
		System.out.println("Precio: " + precio);
		System.out.println("Color: " + color);
		System.out.println("Talla: " + talla);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}

}
