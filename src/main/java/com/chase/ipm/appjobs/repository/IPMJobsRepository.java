package com.chase.ipm.appjobs.repository;

import com.chase.ipm.appjobs.entity.IPMJobDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPMJobsRepository extends CrudRepository<IPMJobDetails, Integer> {
    List<IPMJobDetails> findByName(String name);
}
