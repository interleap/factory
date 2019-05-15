package com.example.factory;

import java.util.ArrayList;
import java.util.List;

public class Workshop {

    private List<NotificationReceiver> receivers;
    private List<Employee> employees;
    private int next = 0;

    public Workshop() {
        receivers = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public void sendAlert(Alert alert) {
        this.receivers.forEach(r -> r.alert(alert));
    }

    public void subscribe(NotificationReceiver notificationReceiver) {
        this.receivers.add(notificationReceiver);
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void process(Job job) {
        employees.get(next).assignJob(job);
        next = (next + 1) % employees.size();
    }
}
