package com.chase.ipm.appjobs.controller;

import com.chase.ipm.appjobs.entity.IPMJobDetails;
import com.chase.ipm.appjobs.service.IPMJobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ipmJobs")
public class IPMJobsController {

    @Autowired
    private IPMJobsService ipmJobsService;

    @RequestMapping(value = "/byName")
    public List<IPMJobDetails> getJobsByName(@RequestParam(name = "jobName") String jobName) {
        return ipmJobsService.getJobDetailsByName(jobName);
    }

}
