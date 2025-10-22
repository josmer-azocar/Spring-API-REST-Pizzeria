package com.azocar.josmer_pizzeria.service.exception;

public class EmailApiException extends RuntimeException{
    public EmailApiException() {
        super("Error sending Email...");
    }
}
