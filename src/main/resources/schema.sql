DROP TABLE IF EXISTS IPM_JOB_DETAILS;

CREATE TABLE IPM_JOB_DETAILS
(
    ID int AUTO_INCREMENT NOT NULL,
    NAME varchar(255) PRIMARY_KEY,
    PARENT_FOLDER_NAME varchar(255),
    JOB_COMMAND varchar2(4000),
	JOB_SCHEDULE varchar(255),
	EXECUTED_USER varchar(255),
	LOGS_PATH varchar(255),
	ETL_JOB_DETAILS varchar(255),
	SOURCE_FILE_NAME varchar(255),
	SOURCE_CONTACT varchar(255),
	DOWN_STREAM_DETAILS varchar(255),
	AD_CONTACTS varchar(255),
	L2_CONTACTS varchar(255),
	SERVER_DETAILS varchar(255),
	FAILURE_SCENARIO_O1 VARCHAR2(4000),
	FIX_DETAILS_01 VARCHAR2(4000)
	--PRIMARY KEY (ID)
);


