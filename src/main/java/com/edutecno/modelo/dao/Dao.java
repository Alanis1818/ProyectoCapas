package com.edutecno.modelo.dao;

import java.util.List;





public interface Dao <ClaseMapear, TipoID> { //puede ser la clase que sea, le estoy dando parametros 
	
	public List<ClaseMapear> listar();
	public ClaseMapear buscarPorId(TipoID id);// buscar por primary key, retorna un cluente
	public int insert(ClaseMapear Objeto);// lo que voy a insertar en este caso es un clienteDto
	public int update(ClaseMapear Objeto);// Objeto es el cliente en vez de colocar ClienteDto coloco la clase mapear que es general
	public int delete(TipoID id);//si voy hacer un delete es por todo lo que lleva el id
	
	
	
}
