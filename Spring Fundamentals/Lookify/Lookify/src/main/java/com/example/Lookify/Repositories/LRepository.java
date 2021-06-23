package com.example.Lookify.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Lookify.Models.LModels;

@Repository
public interface LRepository extends CrudRepository<LModels, Long>{
	List<LModels> findAll();
	  List<LModels> findByArtistContaining(String search);
	  List<LModels> findTop10ByOrderByRatingDesc();
	  List<LModels> findTop10ByOrderByRatingAsc();

}
