package org.example.service;

public class EmailNotification implements SendNotification{
    @Override
    public String sendOtp(String identifier) {
        return "Email sent successfully to "+ identifier;
    }
}
