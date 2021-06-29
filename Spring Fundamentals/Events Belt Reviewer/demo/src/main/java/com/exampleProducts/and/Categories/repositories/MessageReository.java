package com.exampleProducts.and.Categories.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.exampleProducts.and.Categories.models.Message;

public interface MessageReository extends CrudRepository<Message, Long>{
	List<Message> findAll();

}
