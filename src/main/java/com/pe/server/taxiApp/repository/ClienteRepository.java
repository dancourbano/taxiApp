package com.pe.server.taxiApp.repository;

import com.pe.server.taxiApp.models.Cliente;
import com.pe.server.taxiApp.models.Cuenta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static javafx.scene.input.KeyCode.T;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    Cliente findByNombreAndApellido(String nombre,String Apellido);


}
