package com.pe.server.taxiApp.controllers;

import com.pe.server.taxiApp.config.TAXIAPPUrl;
import com.pe.server.taxiApp.config.TAXIAPPView;
import com.pe.server.taxiApp.exception.ExceptionResponse;
import com.pe.server.taxiApp.exception.ModeloNotFoundException;
import com.pe.server.taxiApp.models.AjaxResponseBody;
import com.pe.server.taxiApp.models.Cliente;
import com.pe.server.taxiApp.models.Cuenta;
import com.pe.server.taxiApp.service.ClienteService;
import com.pe.server.taxiApp.service.CuentaService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
@Controller
@RequestMapping(TAXIAPPUrl.CLIENTE_ROOT)
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	@RequestMapping(method = RequestMethod.GET)
    public String initForm() {
        return TAXIAPPView.CLIENTE;
    }
	@GetMapping(value = "/listAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Cliente>> getAll() {
		List<Cliente> cliente = new ArrayList<>();
		cliente = clienteService.getAll();
		
		return new ResponseEntity<List<Cliente>>(cliente, HttpStatus.OK);
	}
	
	@RequestMapping(value = TAXIAPPUrl.GET_CLIENTE, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<Cliente> getById(@PathVariable Long id) throws Exception {
        System.out.println("Long.parseLong(String.valueOf(idCliente)) "+Long.parseLong(String.valueOf(id)));
        Cliente cliente=clienteService.getById(id);
        if(cliente==null) return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<Cliente>(cliente,HttpStatus.OK);
    }
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AjaxResponseBody> save(@Valid @RequestBody Cliente Cliente, BindingResult result) {
		Cliente clienteSave = new Cliente();
		clienteSave = clienteService.save(Cliente);
		AjaxResponseBody resultAjax = new AjaxResponseBody();
		try {

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idCliente}").buildAndExpand(clienteSave.getIdCliente()).toUri();
		 
        resultAjax.setMessage("Operacion Exitosa");        
        return new ResponseEntity<AjaxResponseBody>(resultAjax, HttpStatus.OK);
		}catch(Exception e){
            resultAjax.setErrorMessage(e.getMessage());         
            
            return new ResponseEntity<AjaxResponseBody>(resultAjax, HttpStatus.OK);
        }
		

	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AjaxResponseBody> update(@Valid @RequestBody Cliente Cliente) {
		clienteService.update(Cliente);
		AjaxResponseBody resultAjax = new AjaxResponseBody();
		resultAjax.setMessage("Operacion Exitosa");  
		return new ResponseEntity<AjaxResponseBody>(resultAjax, HttpStatus.OK);
	}
	
	@RequestMapping(value = TAXIAPPUrl.DELETE_CLIENTE, method = RequestMethod.GET)
	public ResponseEntity<AjaxResponseBody> delete(@PathVariable Long idCliente) {
		Cliente Cliente = clienteService.getById(idCliente);
		AjaxResponseBody resultAjax = new AjaxResponseBody();
		if (Cliente == null) {
			throw new ModeloNotFoundException("ID: " + idCliente);
		} else {
			clienteService.delete(idCliente);

		}
		resultAjax.setMessage("Se Eliminó con éxito");
        return ResponseEntity.status(HttpStatus.OK).body(resultAjax);
	}
}
