package com.letsdevlope.blog.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="comments")
public class Comment{
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Blog blog;
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	private String comments;
	@Temporal(TemporalType.TIMESTAMP)
	private Date commentCreated;
	@Temporal(TemporalType.TIMESTAMP)
	private Date commentUpdated;
	
	public long getId() {
		return id;
	}
	public Blog getBlog() {
		return blog;
	}
	public User getUser() {
		return user;
	}
	public String getComments() {
		return comments;
	}
	public Date getCommentCreated() {
		return commentCreated;
	}
	public Date getCommentUpdated() {
		return commentUpdated;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setComment(String comments) {
		this.comments = comments;
	}
	public void setCommentCreated(Date commentCreated) {
		this.commentCreated = commentCreated;
	}
	public void setCommentUpdated(Date commentUpdated) {
		this.commentUpdated = commentUpdated;
	}
}
