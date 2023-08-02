package org.example.controller;


import org.example.dto.ResponseDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/book")
public class BookProducerController {
    private final RabbitTemplate rabbitTemplate;

    public BookProducerController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value("${spring.rabbitmq.template.exchange}")
    private String exchange;

    @Value("${spring.rabbitmq.template.routing-key}")
    private String routingkey;

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody ResponseDto responseDto){
        rabbitTemplate.convertAndSend(exchange,routingkey,responseDto);
        return ResponseEntity.status(HttpStatus.OK).body("Message is successful");
    }

}
