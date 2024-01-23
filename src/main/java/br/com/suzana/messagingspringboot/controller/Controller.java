package br.com.suzana.messagingspringboot.controller;

import br.com.suzana.messagingspringboot.producer.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class Controller {
    private final Producer producerService;

    public Controller(Producer producerService) {
        this.producerService = producerService;
    }

    @GetMapping("hello/{name}")
    public String helloProducer(@PathVariable("name") String name){
        producerService.sendMessage("Hello, " + name + "!");
        return "OK";
    }
}
