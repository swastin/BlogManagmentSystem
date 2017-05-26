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
@Table(name="tags")
public class Tag {
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Blog blog;
	private String tagName;
	@Temporal(TemporalType.TIMESTAMP)
	private Date tagCreated;
	@Temporal(TemporalType.TIMESTAMP)
	private Date tagUpdated;
	private Byte tagIsdeleted;
	public long getId() {
		return id;
	}
	public Blog getBlog() {
		return blog;
	}
	public String getTagName() {
		return tagName;
	}
	public Date getTagCreated() {
		return tagCreated;
	}
	public Date getTagUpdated() {
		return tagUpdated;
	}
	public Byte getTagIsdeleted() {
		return tagIsdeleted;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public void setTagCreated(Date tagCreated) {
		this.tagCreated = tagCreated;
	}
	public void setTagUpdated(Date tagUpdated) {
		this.tagUpdated = tagUpdated;
	}
	public void setTagIsdeleted(Byte tagIsdeleted) {
		this.tagIsdeleted = tagIsdeleted;
	}
	/**
	 * @param blog
	 * @param tagName
	 * @param tagCreated
	 * @param tagUpdated
	 * @param tagIsdeleted
	 */
	public Tag(Blog blog, String tagName, Date tagCreated, Date tagUpdated, Byte tagIsdeleted) {
		this.blog = blog;
		this.tagName = tagName;
		this.tagCreated = tagCreated;
		this.tagUpdated = tagUpdated;
		this.tagIsdeleted = tagIsdeleted;
	}
	/**
	 * 
	 */
	public Tag() {
	}
	

}
