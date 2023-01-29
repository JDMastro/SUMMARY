package com.microservice.inmueble.service;

import com.microservice.inmueble.model.Inmueble;
import com.microservice.inmueble.repository.InmuebleRepository;
import com.microservice.inmueble.service.interfaces.IInmuebleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Clase tipo Servicio para el manejo de los inmuebles
 * @version 1.0.0 2023-01-29
 * @author Jaime David Mastrodomenico Lopez <jdmlmastro9506@gmail.com>
 * @since 1.0.0
 */
@Service
public class InmuebleService implements IInmuebleService {

    @Autowired
    private InmuebleRepository inmuebleRepository;

    @Override
    @Transactional
    public Inmueble saveInmueble(Inmueble inmueble) {
        inmueble.setCreatedAt(LocalDateTime.now());
        return inmuebleRepository.save(inmueble);
    }

    @Override
    @Transactional
    public void deleteInmueble(int id) {
        inmuebleRepository.deleteById(id);
    }

    @Override
    public List<Inmueble> findAll() {
        return inmuebleRepository.findAll();
    }
}
