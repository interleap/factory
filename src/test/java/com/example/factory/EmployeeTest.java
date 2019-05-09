package com.example.factory;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class EmployeeTest {


    @Test
    public void shouldKnowTheJobsAssignedToThem(){
        Employee employee = new Employee();
        employee.assign("jobId");
        assertTrue(employee.isAssigned("jobId"));
    }

    @Test
    public void shouldRememberMultipleJobsAssignedToThem(){
        Employee employee = new Employee();
        employee.assign("jobId");
        employee.assign("jobId2");
        assertTrue(employee.isAssigned("jobId"));
        assertTrue(employee.isAssigned("jobId2"));
    }


}