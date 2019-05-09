package com.example.factory;

public class Workshop {
    private Manager manager;

    public void addManager(Manager manager) {
        this.manager = manager;
    }

    public void sendAlert(String message) {
        if(manager != null) manager.alert(message);
    }
}
