package com.chase.ipm.appjobs.dto;

import jakarta.persistence.*;
import lombok.*;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class IPMJobDetailsDTO {

    private Long id;

    private String name;

    private String parentFolderName;

    private String jobCommand;

    private String jobSchedule;

    private String executedUser;
    private String logsPath;


    private String etlJobDetails;


    private String sourceFileName;


    private String sourceContact;


    private String downstreamDetails;


    private String adContacts;


    private String l2Contacts;


    private String serverDetails;


    private String failureScenario1;

    private String fixDetails01;
}