package com.example.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlarmTest {

    @Test
    public void onReceivingCriticalAlertTheAlarmShouldGetTriggered(){
        Alarm alarm = new Alarm();
        alarm.alert(new Alert("Critical", Severity.CRITICAL));
        assertTrue(alarm.isTriggered());
    }

    @Test
    public void onReceivingNonCriticalAlertTheAlarmShouldNotBeTriggered(){
        Alarm alarm = new Alarm();
        alarm.alert(new Alert("Non-Critical", Severity.INFO));
        assertFalse(alarm.isTriggered());
    }
}