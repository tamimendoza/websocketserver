package com.tutomas.websocketserver.repository;

import com.tutomas.websocketserver.model.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MensajeRepository extends MongoRepository<Mensaje, Long> {
}
