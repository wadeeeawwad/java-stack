package com.exampleProducts.and.Categories.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Size;

//import org.apache.logging.log4j.message.Message;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "events")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 3, message = "name must be more than2 characters!")
	private String name;

	@FutureOrPresent
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	

	@Size(min=4,message="City must be more than 3 characters!")
	private String city;
	@Size(min = 2, message = "State must be 2 characters!")
	private String state;

	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User hostess;
	
	
	


	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "events_users", joinColumns = @JoinColumn(name = "event_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<Event> users_attending_event;
	
	
    
	@OneToMany(mappedBy="eventat", fetch = FetchType.LAZY)
	private List<Message> comment;
	
	
	
    
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public User getHostess() {
		return hostess;
	}

	public void setHostess(User hostess) {
		this.hostess = hostess;
	}

	public List<Event> getAttending_events() {
		return users_attending_event;
	}

	public void setAttending_events(List<Event> attending_events) {
		this.users_attending_event = attending_events;
	}

	public List<Message> getMessages() {
		return comment;
	}

	public void setMessages(List<Message> messages) {
		this.comment = messages;
	}

	// other getters and setters removed for brevity
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	public List<Event> getUsers_attending_event() {
		return users_attending_event;
	}

	public void setUsers_attending_event(List<Event> users_attending_event) {
		this.users_attending_event = users_attending_event;
	}

	public List<Message> getComment() {
		return comment;
	}

	public void setComment(List<Message> comment) {
		this.comment = comment;
	}

}
