package com.exampleProducts.and.Categories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exampleProducts.and.Categories.models.Event;
import com.exampleProducts.and.Categories.models.User;
import com.exampleProducts.and.Categories.repositories.EventRepository;
import com.exampleProducts.and.Categories.repositories.UserRepository;
import com.exampleProducts.and.Categories.repositories.MessageReository;

@Service

public class EventService {
	private final EventRepository eventRepository;
	private final UserRepository userRepository;
	private final MessageReository messageRepo;




	public EventService(EventRepository eventRepository, UserRepository userRepository, MessageReository messageRepo) {
		super();
		this.eventRepository = eventRepository;
		this.userRepository = userRepository;
		this.messageRepo = messageRepo;
	}

	public User findUserById(Long userId) {
		Optional<User> u = userRepository.findById(userId);
		if (u.isPresent()) {
			return u.get();
		} else {
			return null;
		}
	}

	public List<Event> eventInState(String state) {
		return eventRepository.findByState(state);

	}

	public List<Event> eventNotInState(String state) {
		return eventRepository.findByStateIsNot(state);

	}

	public Optional<Event> findById(Long event_id) {
		return eventRepository.findById(event_id);

	}

	public Event findEventById(Long event_id) {
		Optional<Event> optionalevent = eventRepository.findById(event_id);
		if (optionalevent.isPresent()) {
			return optionalevent.get();

		} else
			return null;

	}

	public Event createevent(Event event) {
		return eventRepository.save(event);

	}

}
