package com.example.factory;

public class Machine implements Alertable{

    private boolean started;

    public void start() {
        started = true;
    }


    public boolean isStarted() {
        return started;
    }

    public void alert(Alert alert) {
        if(alert.isCritical())
            started = false;
    }

}
