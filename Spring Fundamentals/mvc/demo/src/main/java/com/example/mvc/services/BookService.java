package com.example.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mvc.models.Book;
import com.example.mvc.repositories.BookRepository;

@Service
public class BookService {
	// adding the book repository as a dependency
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	// returns all the books
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}

	// creates a book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}

	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
//		bookRepository.findById(id);
		Book book1=this.findBook(id);
		book1.setDescription(desc);
		book1.setLanguage(lang);
		book1.setNumberOfPages(numOfPages);
		book1.setTitle(title);
		return book1;

	

	}
	public void delete (Long id) {
		bookRepository.deleteById(id);
		
	}

	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}

	
}