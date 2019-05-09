package com.example.factory;

public class Workshop {
    private Manager manager;
    private Machine machine;

    public void addManager(Manager manager) {
        this.manager = manager;
    }

    public void sendAlert(Alert alert) {
        if(manager != null) manager.alert(alert);
        if(machine != null) machine.alert(alert);
    }

    public void addMachine(Machine machine) {
        this.machine = machine;
    }

}
