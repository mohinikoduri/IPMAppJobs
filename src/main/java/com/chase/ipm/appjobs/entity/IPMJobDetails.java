package com.chase.ipm.appjobs.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "IPMJobDetails")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IPMJobDetails {

    @Id
    @GeneratedValue
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

}
