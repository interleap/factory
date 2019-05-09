package com.example.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void onStartingTheMachineShowStatusAsStarted(){
        Machine machine = new Machine();
        machine.start();
        assertTrue(machine.isStarted());
    }

    @Test
    public void onReceivingCriticalAlertTheMachineShouldStop(){
        Machine machine = new Machine();
        machine.start();
        machine.alert(new Alert("Critical", Severity.CRITICAL));
        assertFalse(machine.isStarted());
    }

    @Test
    public void onReceivingNonCriticalAlertTheMachineShouldNotStop(){
        Machine machine = new Machine();
        machine.start();
        machine.alert(new Alert("Non-Critical", Severity.INFO));
        assertTrue(machine.isStarted());
    }
}