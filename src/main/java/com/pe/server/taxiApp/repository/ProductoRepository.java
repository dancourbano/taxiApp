package com.pe.server.taxiApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pe.server.taxiApp.models.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
