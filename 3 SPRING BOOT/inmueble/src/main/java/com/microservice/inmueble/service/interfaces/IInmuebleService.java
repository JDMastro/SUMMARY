package com.microservice.inmueble.service.interfaces;

import com.microservice.inmueble.model.Inmueble;

import java.util.List;

public interface IInmuebleService {
    /**
     * Esta función sirve para guardar un inmueble
     * @param inmueble Representa el inmueble que se va a guardar
     * @author Jaime David Mastrodomenico Lopez <jdmlmastro9506@gmail.com>
     * @return El inmueble que se guardó en el sistema
     * @since 1.0.0
     */
    Inmueble saveInmueble(Inmueble inmueble);

    /**
     * Esta función sirve para eliminar un inmueble
     * @param id Representa la identificación del inmueble
     * @author Jaime David Mastrodomenico Lopez <jdmlmastro9506@gmail.com>
     * @since 1.0.0
     */
    void deleteInmueble(int id);

    /**
     * Esta función sirve para obtener un inmueble
     * @return una lista de inmueble
     * @author Jaime David Mastrodomenico Lopez <jdmlmastro9506@gmail.com>
     * @since 1.0.0
     */
    List<Inmueble> findAll();

}
