package com.microservice.inmueble.repository;


import com.microservice.inmueble.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio para la entidad Inmueble
 *
 * @version 1.0.0 2023-01-29
 * @author Jaime David Mastrodomenico Lopez <jdmlmastro9506@gmail.com>
 * @since 1.0.0
 */
public interface InmuebleRepository extends JpaRepository<Inmueble, Integer> {
}
