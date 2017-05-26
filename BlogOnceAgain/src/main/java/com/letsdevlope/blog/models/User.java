package com.letsdevlope.blog.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	private Integer userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userGender;
	@Temporal(TemporalType.DATE)
	private Date userDateofbirth;
	private String userPhonenumber;
	@Temporal(TemporalType.TIMESTAMP)
	private Date userCreated;
	@Temporal(TemporalType.TIMESTAMP)
	private Date userUpdated;
	private Byte userIsdeleted;
	private String userRole;
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
	private List<Skill> skills = new ArrayList<>();
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
	private List<Comment> comments = new ArrayList<Comment>();
	public Integer getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public String getUserGender() {
		return userGender;
	}
	public Date getUserDateofbirth() {
		return userDateofbirth;
	}
	public String getUserPhonenumber() {
		return userPhonenumber;
	}
	public Date getUserCreated() {
		return userCreated;
	}
	public Date getUserUpdated() {
		return userUpdated;
	}
	public Byte getUserIsdeleted() {
		return userIsdeleted;
	}
	public String getUserRole() {
		return userRole;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public void setUserDateofbirth(Date userDateofbirth) {
		this.userDateofbirth = userDateofbirth;
	}
	public void setUserPhonenumber(String userPhonenumber) {
		this.userPhonenumber = userPhonenumber;
	}
	public void setUserCreated(Date userCreated) {
		this.userCreated = userCreated;
	}
	public void setUserUpdated(Date userUpdated) {
		this.userUpdated = userUpdated;
	}
	public void setUserIsdeleted(Byte userIsdeleted) {
		this.userIsdeleted = userIsdeleted;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	/**
	 * @param userName
	 * @param userEmail
	 * @param userPassword
	 * @param userGender
	 * @param userDateofbirth
	 * @param userPhonenumber
	 * @param userCreated
	 * @param userUpdated
	 * @param userIsdeleted
	 * @param userRole
	 * @param skills
	 * @param comments
	 */
	public User(String userName, String userEmail, String userPassword, String userGender, Date userDateofbirth,
			String userPhonenumber, Date userCreated, Date userUpdated, Byte userIsdeleted, String userRole,
			List<Skill> skills, List<Comment> comments) {
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.userDateofbirth = userDateofbirth;
		this.userPhonenumber = userPhonenumber;
		this.userCreated = userCreated;
		this.userUpdated = userUpdated;
		this.userIsdeleted = userIsdeleted;
		this.userRole = userRole;
		this.skills = skills;
		this.comments = comments;
	}
	/**
	 * 
	 */
	public User() {
	}

}
