package com.exampleProducts.and.Categories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exampleProducts.and.Categories.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
//	ListDojo> findAll();
//	List<Ninja> findByLicenseIsNull();


}
