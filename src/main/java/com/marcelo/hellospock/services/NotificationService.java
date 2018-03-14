package com.marcelo.hellospock.services;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public String notifyMessage(String utilityType){
        return String.format("You have a %s offer!", utilityType);
    }

}
