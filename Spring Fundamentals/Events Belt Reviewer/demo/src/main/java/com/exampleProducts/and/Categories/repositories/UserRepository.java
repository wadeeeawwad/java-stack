package com.exampleProducts.and.Categories.repositories;

import org.springframework.data.repository.CrudRepository;

import com.exampleProducts.and.Categories.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);
}
