package com.example.employee.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "emp_name")
	private String empName;
	
	@Column(name = "ad_id")
	private String adId;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "base_location")
	private String baseLocation;
	
	@Column(name = "project_name")
	private String projectName;
	
	@Column(name = "team_name")
	private String teamName;
	
	@Column(name = "gcp_certification")
	private String gcpCertification;
	
	public Employee() {
		
	}
	
	public Employee(String empName, String adId, String emailId, String baseLocation, String projectName, String teamName, String gcpCertification) {
		super();
		this.empName = empName;
		this.adId = adId;
		this.emailId = emailId;
		this.baseLocation = baseLocation;
		this.projectName = projectName;
		this.teamName = teamName;
		this.gcpCertification = gcpCertification;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAdId() {
		return adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getBaseLocation() {
		return baseLocation;
	}
	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getGcpCertification() {
		return gcpCertification;
	}
	public void setGcpCertification(String gcpCertification) {
		this.gcpCertification = gcpCertification;
	}
}
