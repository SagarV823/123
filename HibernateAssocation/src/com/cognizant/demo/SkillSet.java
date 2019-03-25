package com.cognizant.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SkillSet")
public class SkillSet {
	@Id
	@Column(name="skillset_id")
	private int skillSetId;
	
	@OneToMany(cascade=CascadeType.ALL,targetEntity=Skills.class)
	private List<Skills> skills;
	public int getSkillSetId() {
		return skillSetId;
	}
	public void setSkillSetId(int skillSetId) {
		this.skillSetId = skillSetId;
	}
	public List<Skills> getSkills() {
		return skills;
	}
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "SkillSet [skillSetId=" + skillSetId + ", skills=" + skills + "]";
	}
	
	
	
	

}
