package com.example.factory;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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

    @Test
    public void shouldAssignJobToEmployee() {
        final Workshop workshop = new Workshop();
        final Employee employee = new Employee();

        workshop.addEmployee(employee);

        final Job job = new Job("job_id_1");
        workshop.process(job);

        assertTrue(employee.hasJob(job));
    }

    @Test
    public void aJobAssignedToAParticularEmployeeShouldNotBeAssignedToOtherEmployees(){
        final Workshop workshop = new Workshop();
        final Employee employee1 = new Employee();
        final Employee employee2 = new Employee();

        workshop.addEmployee(employee1);
        workshop.addEmployee(employee2);

        final Job job = new Job("job_id_1");
        workshop.process(job);

        assertFalse(employee2.hasJob(job));
    }

    @Test
    public void shouldAssignJobsInRoundRobinFormat(){
        final Workshop workshop = new Workshop();
        final Employee employee1 = new Employee();
        final Employee employee2 = new Employee();

        workshop.addEmployee(employee1);
        workshop.addEmployee(employee2);

        final Job job1 = new Job("job_id_1");
        final Job job2 = new Job("job_id_2");
        final Job job3 = new Job("job_id_3");
        workshop.process(job1);
        workshop.process(job2);
        workshop.process(job3);

        assertTrue(employee2.hasJob(job2));
        assertTrue(employee1.hasJob(job3));
    }


}
