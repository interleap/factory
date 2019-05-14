package com.example.factory;

public class Job {
    private final String jobID;

    public Job(String jobID){

        this.jobID = jobID;
    }

    public String getJobID() {
        return jobID;
    }
}
