package com.edutecno.modelo.dao;

import java.util.ArrayList;
import java.util.List;

import com.eductecno.modelo.dto.ClienteDto;

public class ClienteDao implements Dao<ClienteDto, String> {// String es el tipo del ID

	@Override
	public List<ClienteDto> listar() {
		// TODO Auto-generated method stub
		List<ClienteDto> clientes = new ArrayList<ClienteDto>();
		return null;
	}

	@Override
	public ClienteDto buscarPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(ClienteDto Objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ClienteDto Objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
// Crud