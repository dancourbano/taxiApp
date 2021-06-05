package com.pe.server.taxiApp.repository;

import com.pe.server.taxiApp.models.Cuenta;
import org.springframework.data.repository.CrudRepository;

public interface CuentaRepository  extends CrudRepository<Cuenta, Integer> {
    Cuenta findByUsuario(String usauario);
}