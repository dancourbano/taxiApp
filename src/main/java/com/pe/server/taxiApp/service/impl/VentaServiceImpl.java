package com.pe.server.taxiApp.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pe.server.taxiApp.models.Producto;
import com.pe.server.taxiApp.models.Venta;
import com.pe.server.taxiApp.repository.VentaRepository;
import com.pe.server.taxiApp.service.VentaService;



@Service
public class VentaServiceImpl implements VentaService {

	@Autowired
	private VentaRepository ventaDAO;
	
	

	@Override
	public Venta update(Venta venta) {
		venta.getDetalleVenta().forEach(x -> x.setVenta(venta));
		ventaDAO.save(venta);
		return venta;
	}

	@Override
	public void delete(Long id) {
		ventaDAO.delete(id);
	}

	@Override
	public Venta getById(Long id) {
		return ventaDAO.findOne(id);
	}

	@Override
	public List<Venta> getAll() {
		return (List<Venta>)ventaDAO.findAll();
	}
	
	@Override
	public Venta save(Venta venta) {
		 
		venta.getDetalleVenta().forEach(x -> x.setVenta(venta));
		ventaDAO.save(venta);
		
		
		
		//venta.getLstExamen().forEach(e -> ceDAO.registrar(consultaDTO.getConsulta().getIdConsulta(), e.getIdExamen()));
		
		return venta;
	}

}
