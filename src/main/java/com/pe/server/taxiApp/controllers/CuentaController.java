package com.pe.server.taxiApp.controllers;

import com.pe.server.taxiApp.config.TAXIAPPUrl;
import com.pe.server.taxiApp.config.TAXIAPPView;
import com.pe.server.taxiApp.models.Cuenta;
import com.pe.server.taxiApp.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping(TAXIAPPUrl.VEHICULO_ROOT)
public class CuentaController {
    @Autowired
    CuentaService cuentaService;
    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    @RequestMapping(method = RequestMethod.GET)
    public String initForm() {
        return TAXIAPPView.CUENTA;
    }
    @RequestMapping(value = TAXIAPPUrl.LIST_ALL_CONDUCTOR)
    public ResponseEntity<List<Cuenta>> listAll() throws Exception {
        List<Cuenta> cuenta=cuentaService.findAllCuenta();


        if(cuenta.isEmpty()){
            return new ResponseEntity<List<Cuenta>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Cuenta>>(cuenta, HttpStatus.OK);
    }
}
