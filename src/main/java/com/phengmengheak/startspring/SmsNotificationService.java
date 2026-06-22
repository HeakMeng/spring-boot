package com.phengmengheak.startspring;

import org.springframework.stereotype.Service;

@Service()
public class SmsNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("SMS notification: "+message);
    }
}
