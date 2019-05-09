package com.example.factory;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WorkshopTest {
    @Test
    public void shouldSendAlertsToAnyRegisteredAlertable(){
        Workshop workshop = new Workshop();
        Alertable alertable = mock(Alertable.class);
        workshop.register(alertable);
        Alert alert = new Alert("Some Alert Message", Severity.INFO);
        workshop.sendAlert(alert);
        verify(alertable).alert(alert);
    }

    @Test
    public void shouldSendAlertsToMultipleRegisteredAlertables(){
        Workshop workshop = new Workshop();
        Alertable alertable1 = mock(Alertable.class);
        Alertable alertable2 = mock(Alertable.class);
        workshop.register(alertable1);
        workshop.register(alertable2);
        Alert alert = new Alert("Some Alert Message", Severity.INFO);
        workshop.sendAlert(alert);
        verify(alertable1).alert(alert);
        verify(alertable2).alert(alert);
    }
}
