package com.example.factory;

public class Alert {
    private String message;
    private Severity type;

    public Alert(String message, Severity type) {
        this.message = message;
        this.type = type;
    }
}
