package com.microservice.inmueble.controller;

import com.microservice.inmueble.model.Inmueble;
import com.microservice.inmueble.service.InmuebleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para los inmuebles
 * @version 1.0.0 2023-01-29
 * @author Jaime David Mastrodomenico Lopez <jdmlmastro9506@gmail.com>
 * @since 1.0.0
 */
@Slf4j
@RestController
@RequestMapping("api/inmueble")
public class InmuebleController {


    /**
     * Servicio para el manejo de los inmuebles
     */
    @Autowired
    private InmuebleService inmuebleService;

    /**
     * Este método crea un inmueble nuevo
     * @param inmueble inmueble a crear
     * @return
     * @author Jaime David Mastrodomenico Lopez <jdmlmastro9506@gmail.com>
     * @since 1.0.0
     */
    @PostMapping(path = "/save")
    public ResponseEntity<?> saveInmueble(@RequestBody Inmueble inmueble){
        return new ResponseEntity<>(inmuebleService.saveInmueble(inmueble), HttpStatus.CREATED);
    }

    /**
     * Este método elimina un inmueble
     * @param id identificación del inmueble
     * @return
     * @author Jaime David Mastrodomenico Lopez <jdmlmastro9506@gmail.com>
     * @since 1.0.0
     */
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<?> deleteInmueble(@PathVariable(value = "id") int id){
        inmuebleService.deleteInmueble(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Este método obtiene todos los inmuebles
     * @return lista de inmuebles
     * @author Jaime David Mastrodomenico Lopez <jdmlmastro9506@gmail.com>
     * @since 1.0.0
     */
    @GetMapping(path = "/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(inmuebleService.findAll());
    }


}
