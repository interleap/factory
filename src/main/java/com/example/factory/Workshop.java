package com.example.factory;

import java.util.ArrayList;
import java.util.List;

public class Workshop {

    private List<NotificationReceiver> receivers;

    public Workshop() {
        receivers = new ArrayList<>();
    }

    public void sendAlert(Alert alert) {

        this.receivers.forEach(r -> r.alert(alert));
    }

    public void subscribe(NotificationReceiver notificationReceiver) {
        this.receivers.add(notificationReceiver);
    }
}
