package com.pe.server.taxiApp.service;


import com.pe.server.taxiApp.models.Cuenta;

import java.util.List;

/**
 * Created by DANIEL on 30/11/2016.
 */
public interface CuentaService {
    Cuenta findById(Integer id);

    Cuenta findByUsuario(String usuario);

    Cuenta saveCuenta(Cuenta cuenta);

    void updateCuenta(Cuenta cuenta);

    void deleteCuentaById(Integer idCuenta);

    public List<Cuenta> findAllCuenta();
}
