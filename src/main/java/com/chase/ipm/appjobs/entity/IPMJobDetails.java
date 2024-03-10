package com.chase.ipm.appjobs.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "IPM_JOB_DETAILS")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IPMJobDetails {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;

    @Column(name = "PARENT_FOLDER_NAME")
    private String parentFolderName;

    @Column(name = "JOB_COMMAND")
    private String jobCommand;

    @Column(name = "JOB_SCHEDULE")
    private String jobSchedule;

    @Column(name = "EXECUTED_USER")
    private String executedUser;

    @Column(name = "LOGS_PATH")
    private String logsPath;

    @Column(name = "ETL_JOB_DETAILS")
    private String etlJobDetails;

    @Column(name = "SOURCE_FIL_ENAME")
    private String sourceFileName;

    @Column(name = "SOURCE_CONTACT")
    private String sourceContact;

    @Column(name = "DOWN_STREAM_DETAILS")
    private String downstreamDetails;

    @Column(name = "AD_CONTACTS")
    private String adContacts;

    @Column(name = "L2_CONTACTS")
    private String l2Contacts;

    @Column(name = "SERVER_DETAILS")
    private String serverDetails;

    @Column(name = "FAILURE_SCENARIO_O1")
    private String failureScenario1;

    @Column(name = "FIX_DETAILS_01")
    private String fixDetails01;
}