package com.pe.server.taxiApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.server.taxiApp.models.Producto;
import com.pe.server.taxiApp.repository.ProductoRepository;
import com.pe.server.taxiApp.service.ProductoService;
@Service
public class ProductoServiceImpl implements ProductoService{
	 @Autowired
	    private ProductoRepository productoRepo;



	    @Override
	    public Producto getById(Long id) {
	        return productoRepo.findOne(id);
	    }

	     

	    @Override
	    public Producto save(Producto Producto) {
	        return productoRepo.save(Producto);
	    }

	    @Override
	    public Producto update(Producto Producto) {
	         
	        return productoRepo.save(Producto);
	    }

	    @Override
	    public void delete(Long id) {
	    	productoRepo.delete(id);
	    }

	    @Override
	    public List<Producto> getAll() {
	        return (List<Producto>) productoRepo.findAll();
	    }
}
