package com.example.factory;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private List<String> jobIds = new ArrayList<>();

    public boolean isAssigned(String jobId) {
        return jobIds.contains(jobId);
    }

    public void assign(String jobId) {
        jobIds.add(jobId);
    }
}
