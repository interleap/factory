package com.example.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WorkshopTest {
    @Test
    public void shouldSendAlertsToAnyRegisteredManager(){
        Workshop workshop = new Workshop();
        Manager manager = mock(Manager.class);
        workshop.addManager(manager);
        workshop.sendAlert("Some Alert Message");
        verify(manager).alert("Some Alert Message");
    }
}
