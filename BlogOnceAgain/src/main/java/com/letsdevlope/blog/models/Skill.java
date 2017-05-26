package com.letsdevlope.blog.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="skills")
public class Skill {
	
	@Id
	@GeneratedValue
	private Integer id;
	@ManyToOne
	private User user;
	private String skillName;
	private Date skillCreated;
	private Date skillUpdated;
	public Integer getId() {
		return id;
	}
	public User getUser() {
		return user;
	}
	public String getSkillName() {
		return skillName;
	}
	public Date getSkillCreated() {
		return skillCreated;
	}
	public Date getSkillUpdated() {
		return skillUpdated;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public void setSkillCreated(Date skillCreated) {
		this.skillCreated = skillCreated;
	}
	public void setSkillUpdated(Date skillUpdated) {
		this.skillUpdated = skillUpdated;
	}
	/**
	 * @param user
	 * @param skillName
	 * @param skillCreated
	 * @param skillUpdated
	 */
	public Skill(User user, String skillName, Date skillCreated, Date skillUpdated) {
		this.user = user;
		this.skillName = skillName;
		this.skillCreated = skillCreated;
		this.skillUpdated = skillUpdated;
	}
	/**
	 * 
	 */
	public Skill() {
	}
	
	


}
