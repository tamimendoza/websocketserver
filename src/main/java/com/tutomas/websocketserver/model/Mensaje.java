package com.tutomas.websocketserver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mensajes")
public record Mensaje(@Id Long id, String nombre, String contenido) {
}
