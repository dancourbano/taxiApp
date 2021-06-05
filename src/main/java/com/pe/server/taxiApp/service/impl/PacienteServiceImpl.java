package com.pe.server.taxiApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.server.taxiApp.models.Paciente;
import com.pe.server.taxiApp.repository.PacienteRepository;
import com.pe.server.taxiApp.service.PacienteService;
@Service
public class PacienteServiceImpl implements PacienteService{
	    @Autowired
	    private PacienteRepository PacienteRepo;



	    @Override
	    public Paciente findById(Integer id) {
	        return PacienteRepo.findOne(id);
	    }

	    @Override
	    public Paciente findByNombreAndApellido(String nombre,String apellido) {
	        return PacienteRepo.findByNombresAndApellidos(nombre,apellido);
	    }

	    @Override
	    public Paciente savePaciente(Paciente Paciente) {
	        return PacienteRepo.save(Paciente);
	    }

	    @Override
	    public void updatePaciente(Paciente Paciente) {
	        System.out.println(" Paciente.getId() "+Paciente.getIdPaciente());
	        PacienteRepo.save(Paciente);
	    }

	    @Override
	    public void deletePacienteById(Integer id) {
	        PacienteRepo.delete(id);
	    }

	    @Override
	    public List<Paciente> findAllPaciente() {
	        return (List<Paciente>) PacienteRepo.findAll();
	    }
}
