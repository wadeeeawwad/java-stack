package com.exampleProducts.and.Categories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.exampleProducts.and.Categories.models.Event;

public interface EventRepository extends CrudRepository<Event, Long>{

	
	List<Event> findAll();
	List<Event> findByState(String state);
	List<Event> findByStateIsNot(String state);
	Event findEventById(Long event_id);
}