package com.kafka.kafkaProducer.controller;

import com.kafka.kafkaProducer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    private final ProducerService producer;

    @Autowired
    public ProducerController(ProducerService producer) {
        this.producer = producer;
    }

    @PostMapping("/message")
    public void publishMessage(@RequestBody String msg) {
        producer.pub(msg);
    }

}
