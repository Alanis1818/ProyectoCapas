package com.eductecno.modelo.dto;

import java.util.Date;

public class OrdenDto {
	private String codigo_orden;
	private Date fecha_de_emision;
	private String rut_cliente;
	private String rut_empleado;
	
	public String getCodigo_orden() {
		return codigo_orden;
	}
	public void setCodigo_orden(String codigo_orden) {
		this.codigo_orden = codigo_orden;
	}
	public Date getFecha_de_emision() {
		return fecha_de_emision;
	}
	public void setFecha_de_emision(Date fecha_de_emision) {
		this.fecha_de_emision = fecha_de_emision;
	}
	public String getRut_cliente() {
		return rut_cliente;
	}
	public void setRut_cliente(String rut_cliente) {
		this.rut_cliente = rut_cliente;
	}
	public String getRut_empleado() {
		return rut_empleado;
	}
	public void setRut_empleado(String rut_empleado) {
		this.rut_empleado = rut_empleado;
	}
	

}
