package com.tutomas.websocketserver.controller;

import com.tutomas.websocketserver.dto.MensajeDto;
import com.tutomas.websocketserver.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MensajeController {

    @Autowired
    private MensajeService mensajeService;

    @MessageMapping("/envio")
    @SendTo("/tema/mensajes")
    public MensajeDto envio(MensajeDto mensaje) {
        mensajeService.guardar(mensaje);
        return new MensajeDto(mensaje.nombre(), mensaje.contenido());
    }

}
