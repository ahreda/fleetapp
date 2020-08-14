package com.spring.fleetapp.controllers;

import com.spring.fleetapp.models.JobTitle;
import com.spring.fleetapp.services.JobTitleService;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobTtileController {

    JobTitleService jobTitleService;

    public JobTtileController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/JobTitles")
    public String jobTitles(Model model){

        List<JobTitle> jobTitles = jobTitleService.getJobTitles();
        model.addAttribute("jobTitles",jobTitles);

        return "jobTitle";

    }

    @PostMapping("/JobTitles/addNew")
    public String addJobTitle(JobTitle jobTitle){

        jobTitleService.save(jobTitle);

        return "redirect:/JobTitles";

    }


}
