package com.spring.fleetapp.services;

import com.spring.fleetapp.models.JobTitle;
import com.spring.fleetapp.repositories.JobTitleRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleService {

    JobTitleRepositories jobTitleRepositories;

    public JobTitleService(JobTitleRepositories jobTitleRepositories) {
        this.jobTitleRepositories = jobTitleRepositories;
    }

    public List<JobTitle> getJobTitles(){

        return jobTitleRepositories.findAll();
    }

    public void save(JobTitle jobTitle){
        jobTitleRepositories.save(jobTitle);
    }

}
