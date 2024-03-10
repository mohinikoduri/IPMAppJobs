package com.chase.ipm.appjobs.controller;

import com.chase.ipm.appjobs.dto.IPMJobDetailsDTO;
import com.chase.ipm.appjobs.entity.IPMJobDetails;
import com.chase.ipm.appjobs.service.IPMJobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ipmJobs")
public class IPMJobsController {

    @Autowired
    private IPMJobsService ipmJobsService;

    @GetMapping(value = "/byName")
    public List<IPMJobDetails> getJobsByName(@RequestParam(name = "jobName") String jobName) {
        return ipmJobsService.getJobDetailsByName(jobName);
    }

    @PostMapping(value = "/insert")
    public ResponseEntity insertJob(@RequestBody IPMJobDetailsDTO ipmJobDetailsDTO) {
        ipmJobsService.createIPMJob(ipmJobDetailsDTO);
        return new ResponseEntity(HttpStatus.OK);
    }



}