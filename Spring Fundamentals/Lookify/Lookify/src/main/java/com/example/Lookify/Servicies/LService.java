package com.example.Lookify.Servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Lookify.Models.LModels;
import com.example.Lookify.Repositories.LRepository;

@Service
public class LService {

	private final LRepository lRepository;

	public LService(LRepository lRepository) {

		this.lRepository = lRepository;
	}

	public List<LModels> getalltitles() {

		return lRepository.findAll();
	}

	public LModels addsong(LModels LModelsobject) {
		return lRepository.save(LModelsobject);

	}

	public void deletesong(Long id) {

		lRepository.deleteById(id);
	}

//	public LModels getsongbyId(Long id) {
//
//		return lRepository.findById(id);
//	}

	public LModels getsongbyId(long id) {
		Optional<LModels> optionalsongtitle = lRepository.findById(id);
		if (optionalsongtitle.isPresent()) {
			return optionalsongtitle.get();

		} else
			return null;

	}

	public List<LModels> getsearchedartist(String searchArtist) {

		return lRepository.findByArtistContaining( searchArtist);
	}

//	public LModels displaysong(LModels objectsong) {
//		LModels display=getsongbyId(objectsong.getId());
//		display.setArtist(objectsong.getArtist());
//		display.setRating(objectsong.getRating());
//		display.setTitle(objectsong.getTitle());
//	    	
//	    	return lRepository.save(display);
// 
//
//}

}
