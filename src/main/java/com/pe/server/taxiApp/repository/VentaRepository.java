package com.pe.server.taxiApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.pe.server.taxiApp.domain.security.User;
import com.pe.server.taxiApp.models.Venta;
 

public interface VentaRepository extends CrudRepository<Venta,Long> {


}
