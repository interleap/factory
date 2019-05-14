package com.example.factory;

public class Alarm{

    private boolean triggered;

    public boolean isTriggered() {
        return triggered;
    }

    private void trigger() {
        triggered = true;
    }

    private void turnOff() {
        triggered = false;
    }

}
