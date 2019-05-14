package com.example.factory;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WorkshopTest {

    @Test
    public void shouldRaiseAlertToAllAlertables(){
        Workshop workshop = new Workshop();
        final NotificationReceiver notificationReceiver = mock(NotificationReceiver.class);
        workshop.subscribe(notificationReceiver);
        final Alert alert = new Alert("message", Severity.INFO);
        workshop.sendAlert(alert);
        verify(notificationReceiver).alert(alert);
    }
}
