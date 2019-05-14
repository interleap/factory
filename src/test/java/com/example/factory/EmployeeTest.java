package com.example.factory;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void shouldBeAbleToAssignJob(){
        final Employee employee = new Employee();
        final Job job = new Job("123");

        employee.assignJob(job);

        assertTrue(employee.getJobs().contains(job));
    }

    @Test
    public void shouldBeAbleToCompleteJob(){
        final Employee employee = new Employee();
        final Job job = new Job("123");

        employee.assignJob(job);
        employee.completeJob(job);

        assertEquals(0,employee.getJobs().size());
    }
}
