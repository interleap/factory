package com.example.factory;

import java.util.ArrayList;
import java.util.List;

public class Workshop {
    private List<Alertable> alertReceivers;
    private Employee employee;

    public Workshop() {
        alertReceivers = new ArrayList<>();
    }

    public void register(Alertable receiver) {
        alertReceivers.add(receiver);
    }

    public void sendAlert(Alert alert) {
        alertReceivers.forEach(receiver -> receiver.alert(alert));
    }

    public void add(Employee employee) {
        this.employee = employee;
    }

    public void make(String jobId) {
        employee.assign(jobId);
    }
}
