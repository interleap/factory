package com.example.factory;

public class Workshop {
    private Manager manager;

    public void addManager(Manager manager) {
        this.manager = manager;
    }

    public void sendAlert(Alert alert) {
        if(manager != null) manager.alert(alert);
    }

    public void addMachine(Machine machine) {

    }
}
