package com.example.factory;

public class Alarm implements Alertable{

    private boolean triggered;

    public boolean isTriggered() {
        return triggered;
    }

    public void alert(Alert alert) {
        if(alert.isCritical()) {
            trigger();
        }
    }

    private void trigger() {
        triggered = true;
    }

}
