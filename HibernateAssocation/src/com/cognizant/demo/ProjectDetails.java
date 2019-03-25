package com.cognizant.demo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Project_details")
public class ProjectDetails {
	@Id
	@Column(name="project_id")
	private int projectId;
	
	@OneToOne(cascade=CascadeType.ALL,targetEntity=SkillSet.class)
	@JoinColumn(name="SkillSet_id")
	private SkillSet skillSet;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public SkillSet getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(SkillSet skillSet) {
		this.skillSet = skillSet;
	}
	@Override
	public String toString() {
		return "ProjectDetails [projectId=" + projectId + ", skillSet=" + skillSet + "]";
	}
	
	
	
	

}
