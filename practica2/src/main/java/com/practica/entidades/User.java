package com.practica.entidades;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;



public class User {
	@Id
	 public ObjectId _id;
	private String nombre;
	private String servicio;
	private String ciudad;
	private String fecha;
	private String totalFactura;
	
	
	
    public User() {
    	
    }


	public User(ObjectId _id,String nombre, String servicio, String ciudad, String fecha, String totalFactura) {
		super();
		this._id =_id;
		this.nombre = nombre;
		this.servicio = servicio;
		this.ciudad = ciudad;
		this.fecha = fecha;
		this.totalFactura = totalFactura;
	}


	


	public String get_id() { return _id.toHexString(); }
	  public void set_id(ObjectId _id) { this._id = _id; }


	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getServicio() {
		return servicio;
	}


	public void setServicio(String servicio) {
		this.servicio = servicio;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getTotalFactura() {
		return totalFactura;
	}


	public void setTotalFactura(String totalFactura) {
		this.totalFactura = totalFactura;
	}
	
}
