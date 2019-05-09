package com.example.factory;

import java.util.ArrayList;
import java.util.List;

public class Workshop {
    private Manager manager;
    private Machine machine;
    private List<Alertable> alertReceivers;

    public Workshop() {
        alertReceivers = new ArrayList<>();
    }

    public void register(Alertable receiver) {
        alertReceivers.add(receiver);
    }

    public void sendAlert(Alert alert) {
        alertReceivers.forEach(receiver -> receiver.alert(alert));
    }

}
