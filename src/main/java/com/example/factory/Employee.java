package com.example.factory;

import java.util.ArrayList;
import java.util.Collection;

public class Employee {

    private Collection<Job> jobs;

    public Employee() {
        jobs = new ArrayList<>();
    }

    public void assignJob(Job job) {
        this.jobs.add(job);
    }

    public Collection<Job> getJobs() {
        return jobs;
    }

    public void completeJob(Job job) {
        this.jobs.remove(job);
    }
}
