package com.marcelo.hellospock.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping("/offer/${offerType}")
    public String newOffer(@PathVariable String offerType){
        return "Hello!";
    }



}
