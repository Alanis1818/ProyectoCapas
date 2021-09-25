package com.eductecno.modelo.dto;

import java.util.Date;

public class DetalleOrdenDto {
	private String codigo_orden;
	private String codigo_producto;
	private Integer cantidad;
	private Integer precio_unitario;
	public String getCodigo_orden() {
		return codigo_orden;
	}
	public void setCodigo_orden(String codigo_orden) {
		this.codigo_orden = codigo_orden;
	}
	public String getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(String codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getPrecio_unitario() {
		return precio_unitario;
	}
	public void setPrecio_unitario(Integer precio_unitario) {
		this.precio_unitario = precio_unitario;
	}


	
}
