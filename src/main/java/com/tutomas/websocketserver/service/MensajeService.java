package com.tutomas.websocketserver.service;

import com.tutomas.websocketserver.dto.MensajeDto;
import com.tutomas.websocketserver.model.Mensaje;
import com.tutomas.websocketserver.repository.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MensajeService {

    @Autowired
    private MensajeRepository mensajeRepository;

    public MensajeDto guardar(MensajeDto mensaje) {
        mensajeRepository.save(new Mensaje(new Random().nextLong(), mensaje.nombre(), mensaje.contenido()));
        return new MensajeDto(mensaje.nombre(), mensaje.contenido());
    }

}
