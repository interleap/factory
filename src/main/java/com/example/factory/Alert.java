package com.example.factory;

public class Alert {
    private String message;
    private Severity severity;

    public Alert(String message, Severity severity) {
        this.message = message;
        this.severity = severity;
    }

    public Severity getSeverity() {
        return severity;
    }

    boolean isCritical() {
        return getSeverity()== Severity.CRITICAL;
    }
}
