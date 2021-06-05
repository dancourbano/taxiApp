package com.pe.server.taxiApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pe.server.taxiApp.models.Cliente;
import com.pe.server.taxiApp.models.Cuenta;
import com.pe.server.taxiApp.models.Paciente;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Integer> {
	 Paciente findByNombresAndApellidos(String nombres,String Apellidos);
}
