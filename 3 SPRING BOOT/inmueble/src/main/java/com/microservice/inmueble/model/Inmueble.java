package com.microservice.inmueble.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Esta clase Representa la entidad inmueble
 * @version 1.0.0 2023-01-29
 * @author Jaime David Mastrodomenico Lopez <jdmlmastro9506@gmail.com>
 * @since 1.0.0
 */
@Data
@Entity
@Table(name = "inmueble")
public class Inmueble implements Serializable {
    /**
     * Variable usada para manejar el tema del identificador de la tupla (consecutivo)
     */
    private static final long serialVersionUID = 1L;
    /**
     * Identificador del inmueble
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    /**
    * Representa el nombre del inmueble
    */
    @Column(name = "name", nullable = false, length = 150)
    private String name;

    /**
     * Representa la direccion del inmueble
     */
    @Column(name = "direction", nullable = false, length = 500)
    private String direction;

    /**
     * Representa la url de la imgen del inmueble
     */
    @Column(name = "photo", nullable = true, length = 1200)
    private String photo;

    /**
     * Representa el precio del inmueble
     */
    @Column(name = "price", nullable = false)
    private Double price;

    /**
     * Representa la fecha de creación del registro
     */
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}