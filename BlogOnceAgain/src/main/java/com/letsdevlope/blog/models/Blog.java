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
@Table(name="blogs")
public class Blog {
	
	
	@Id
	@GeneratedValue
	private Integer blogId;
	private String blogTitle;
	private String blogContent;
	private String blogProgLang;
	private String blogTags;
	private Integer blogStatus;
	@Temporal(TemporalType.TIMESTAMP)
	private Date blogCreated;
	@Temporal(TemporalType.TIMESTAMP)
	private Date blogUpdated;
	private String blogAuthorName;
	private Integer blogAuthorId;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "blog")
	private List<Tag> tags = new ArrayList<>();
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "blog")
	private List<Comment> comments = new ArrayList<>();
	public Integer getBlogId() {
		return blogId;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public String getBlogContent() {
		return blogContent;
	}
	public String getBlogProgLang() {
		return blogProgLang;
	}
	public String getBlogTags() {
		return blogTags;
	}
	public Integer getBlogStatus() {
		return blogStatus;
	}
	public Date getBlogCreated() {
		return blogCreated;
	}
	public Date getBlogUpdated() {
		return blogUpdated;
	}
	public String getBlogAuthorName() {
		return blogAuthorName;
	}
	public Integer getBlogAuthorId() {
		return blogAuthorId;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}
	public void setBlogProgLang(String blogProgLang) {
		this.blogProgLang = blogProgLang;
	}
	public void setBlogTags(String blogTags) {
		this.blogTags = blogTags;
	}
	public void setBlogStatus(Integer blogStatus) {
		this.blogStatus = blogStatus;
	}
	public void setBlogCreated(Date blogCreated) {
		this.blogCreated = blogCreated;
	}
	public void setBlogUpdated(Date blogUpdated) {
		this.blogUpdated = blogUpdated;
	}
	public void setBlogAuthorName(String blogAuthorName) {
		this.blogAuthorName = blogAuthorName;
	}
	public void setBlogAuthorId(Integer blogAuthorId) {
		this.blogAuthorId = blogAuthorId;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public Blog(String blogTitle, String blogContent, String blogProgLang, String blogTags, Integer blogStatus,
			Date blogCreated, Date blogUpdated, String blogAuthorName, Integer blogAuthorId, List<Tag> tags,
			List<Comment> comments) {
		this.blogTitle = blogTitle;
		this.blogContent = blogContent;
		this.blogProgLang = blogProgLang;
		this.blogTags = blogTags;
		this.blogStatus = blogStatus;
		this.blogCreated = blogCreated;
		this.blogUpdated = blogUpdated;
		this.blogAuthorName = blogAuthorName;
		this.blogAuthorId = blogAuthorId;
		this.tags = tags;
		this.comments = comments;
	}
	public Blog() {}
	
	
	

}
