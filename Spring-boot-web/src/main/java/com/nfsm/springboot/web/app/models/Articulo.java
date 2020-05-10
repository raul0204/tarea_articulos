package com.nfsm.springboot.web.app.models;

public class Articulo {

	private String Descripcion;
	private String Precio;
	private String Marca;
	private String Cantidad;
	private String Proveedor;
	
	public Articulo(String Descripcion, String Precio, String Marca, String Cantidad, String Proveedor) {
		super();
		this.Descripcion = Descripcion;
		this.Precio = Precio;
		this.Marca = Marca;
		this.Cantidad = Cantidad;
		this.Proveedor = Proveedor;
	}
	
	public Articulo() {
		
	}
	
	public String getDescripcion() {
		return Descripcion;
	}
	
	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}
	
	public String getPrecio() {
		return Precio;
	}
	
	public void setPrecio(String Precio) {
		this.Precio = Precio;
	}
	
	public String getMarca() {
		return Marca;
	}
	
	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	
	public String getCantidad() {
		return Cantidad;
	}
	
	public void setCantidad(String Cantidad) {
		this.Cantidad = Cantidad;
	}
	
	public String getProveedor() {
		return Proveedor;
	}
	
	public void setProveedor(String Proveedor) {
		this.Proveedor = Proveedor;
	}
	
}
