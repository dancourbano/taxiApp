package com.pe.server.taxiApp.service;

import com.pe.server.taxiApp.models.Cliente;
import com.pe.server.taxiApp.models.Cuenta;


import java.util.List;

public interface ClienteService extends ICRUD<Cliente>{
	public Cliente findByNombreAndApellido(String nombre,String apellido);
}
