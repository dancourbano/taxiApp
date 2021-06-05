package com.pe.server.taxiApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pe.server.taxiApp.models.Cliente;
import com.pe.server.taxiApp.models.Paciente;
@Service
public interface PacienteService {
	Paciente findById(Integer id);

	Paciente findByNombreAndApellido(String nombre, String Apellido);

	Paciente savePaciente(Paciente cuenta);

    void updatePaciente(Paciente cuenta);

    void deletePacienteById(Integer idCuenta);

    public List<Paciente> findAllPaciente();
}
