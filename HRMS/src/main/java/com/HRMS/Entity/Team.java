package com.HRMS.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Team {
	@Id
	private Integer teamcode;
	private String teamName;
	private String projectName;
	private Integer teamSize;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "teamcode_fk",referencedColumnName = "teamcode")
	private List<Employee> employess;
	public Integer getTeamcode() {
		return teamcode;
	}
	public void setTeamcode(Integer teamcode) {
		this.teamcode = teamcode;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Integer getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}
	public List<Employee> getEmployess() {
		return employess;
	}
	public void setEmployess(List<Employee> employess) {
		this.employess = employess;
	}
	

}
