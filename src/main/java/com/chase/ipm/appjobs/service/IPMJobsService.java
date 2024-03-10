package com.chase.ipm.appjobs.service;

import com.chase.ipm.appjobs.dto.IPMJobDetailsDTO;
import com.chase.ipm.appjobs.entity.IPMJobDetails;
import java.util.List;

import com.chase.ipm.appjobs.repository.IPMJobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IPMJobsService {

    @Autowired
    private IPMJobsRepository ipmJobsRepository;

    public List<IPMJobDetails> getJobDetailsByName(String name) {

        return ipmJobsRepository.findByName(name);
    }

    public void createIPMJob(IPMJobDetailsDTO ipmJobDetailsDTO) {

        ipmJobsRepository.save(convertDTOtoEntity(ipmJobDetailsDTO));
    }

    private IPMJobDetails convertDTOtoEntity(IPMJobDetailsDTO ipmJobDetailsDTO) {
        return IPMJobDetails.builder().name(ipmJobDetailsDTO.getName())
                .adContacts(ipmJobDetailsDTO.getAdContacts()).parentFolderName(ipmJobDetailsDTO.getParentFolderName()).build();
    }
}
