package com.example.factory;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WorkshopTest {
    @Test
    public void shouldSendAlertsToAnyRegisteredManager(){
        Workshop workshop = new Workshop();
        Manager manager = mock(Manager.class);
        workshop.addManager(manager);
        Alert alert = new Alert("Some Alert Message", Severity.INFO);
        workshop.sendAlert(alert);
        verify(manager).alert(alert);
    }

    @Test
    public void shouldStopMachineIfACriticalAlertIsTriggered(){
        Workshop workshop = new Workshop();
        Machine machine = new Machine();

        workshop.addMachine(machine);
        machine.start();
        Alert alert = new Alert("Critical Alert", Severity.CRITICAL);
        workshop.sendAlert(alert);
        assertFalse(machine.isStarted());
    }

    @Test
    public void shouldNotStopMachineIfANonCriticalAlertIsTriggered(){
        Workshop workshop = new Workshop();
        Machine machine = new Machine();

        workshop.addMachine(machine);
        machine.start();
        Alert alert = new Alert("Non Critical Alert", Severity.INFO);
        workshop.sendAlert(alert);
        assertTrue(machine.isStarted());
    }
}
