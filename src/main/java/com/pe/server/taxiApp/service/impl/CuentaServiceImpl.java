package com.pe.server.taxiApp.service.impl;

import com.pe.server.taxiApp.models.Cuenta;
import com.pe.server.taxiApp.repository.CuentaRepository;
import com.pe.server.taxiApp.service.CuentaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Transactional;


        import java.util.List;

/**
 * Created by DANIEL on 30/11/2016.
 */
@Service("CuentaService")
@Transactional
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaRepository cuentaRepo;



    @Override
    public Cuenta findById(Integer id) {
        return cuentaRepo.findOne(id);
    }

    @Override
    public Cuenta findByUsuario(String usuario) {
        return cuentaRepo.findByUsuario(usuario);
    }

    @Override
    public Cuenta saveCuenta(Cuenta cuenta) {
        return cuentaRepo.save(cuenta);
    }

    @Override
    public void updateCuenta(Cuenta cuenta) {
        cuentaRepo.save(cuenta);
    }

    @Override
    public void deleteCuentaById(Integer idCuenta) {
        cuentaRepo.delete(idCuenta);
    }

    @Override
    public List<Cuenta> findAllCuenta() {
        return (List<Cuenta>) cuentaRepo.findAll();
    }
}
