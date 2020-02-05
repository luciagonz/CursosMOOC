package com.luciagonzalez.TiendaRopaInterface;

public class Telefono {
	
	private int id;
	private double precio;
	private String marca;
	private String modelo;
	
	
	public Telefono(int id, double precio, String marca, String modelo) {
		this.id = id;
		this.precio = precio;
		this.marca = marca;
		this.modelo = modelo;
	}

	
	// Getters y setters
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
	

}
