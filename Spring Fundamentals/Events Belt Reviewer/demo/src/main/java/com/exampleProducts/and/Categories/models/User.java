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
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public List<Event> getAttending_event() {
		return attending_event;
	}

	public void setAttending_event(List<Event> attending_event) {
		this.attending_event = attending_event;
	}

	@Size(min = 3, message = "Name must be more than 2 characters!")
	private String first_name;

	@Size(min = 2, message = "Name must be more than 1 character!")
	private String last_name;

	@Email(message = "Email must be valid")
	private String email;

	@Size(min = 4, message = "City must be more than 3 characters!")
	private String city;

	@Size(min = 2, message = "State must be 2 characters!")
	private String state;

	@Size(min = 5, message = "Password must be greater than 5 characters")
	private String password;

	@Transient
	private String passwordConfirmation;

	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Message> messages;

	@OneToMany(mappedBy = "hostess", fetch = FetchType.LAZY)
	private List<Event> hosted_events;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "events_users", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "event_id"))
	private List<Event> attending_event;

	// other getters and setters removed for brevity
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	public User() {
	}

	public User(Long id, @Size(min = 3, message = "Name must be more than 2 characters!") String first_name,
			@Size(min = 2, message = "Name must be more than 1 character!") String last_name,
			@Email(message = "Email must be valid") String email,
			@Size(min = 4, message = "City must be more than 3 characters!") String city,
			@Size(min = 2, message = "State must be 2 characters!") String state,
			@Size(min = 5, message = "Password must be greater than 5 characters") String password,
			String passwordConfirmation, Date createdAt, Date updatedAt, List<Message> messages,
			List<Event> hosted_events, List<Event> attending_events) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.city = city;
		this.state = state;
		this.password = password;
		this.passwordConfirmation = passwordConfirmation;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.messages = messages;
		this.hosted_events = hosted_events;
		this.attending_event = attending_events;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
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

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public List<Event> getHosted_events() {
		return hosted_events;
	}

	public void setHosted_events(List<Event> hosted_events) {
		this.hosted_events = hosted_events;
	}

	public List<Event> getAttending_events() {
		return attending_event;
	}

	public void setAttending_events(List<Event> attending_events) {
		this.attending_event = attending_events;
	}

}