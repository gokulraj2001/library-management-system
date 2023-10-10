package com.example.librarymanagementsystem.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.example.librarymanagementsystem.entity.Library;
import com.example.librarymanagementsystem.service.LibraryService;

@Controller
public class LibraryController {
	
	private LibraryService libraryService;

	public LibraryController(LibraryService libraryService) {
		super();
		this.libraryService = libraryService;
	}
	
	//handler method 
	@GetMapping("/books")
	public String listLibrary(Model model) {
		model.addAttribute("books", libraryService.getAllBooks());
		return "books";
	}
	
	@GetMapping("/books/new")
	public String createBookForm(Model model) {
		
//		create an object to hold book form data
		Library library = new Library();
		model.addAttribute("library", library);
		return "create_book";
		
	}
	
	@PostMapping("/books/new")
	public String saveBook(@ModelAttribute("library") Library library) {
		libraryService.saveBook(library);
		return "redirect:/books";
	}
	
	@GetMapping("/books/edit/{id}")
	public String editStudentForm(@PathVariable Integer id, Model model) {
		model.addAttribute("library", libraryService.getLibraryById(id));
		return "edit_book";
	}
	
	@PostMapping("/books/edit/{id}")
	public String updateBook(@PathVariable Integer id,
			@ModelAttribute("library") Library library,
			Model model) {
		 Library existingLibrary= libraryService.getLibraryById(id);
		 existingLibrary.setId(id);
		 existingLibrary.setBookID(library.getBookID());
		 existingLibrary.setCategory(library.getCategory());
		 existingLibrary.setBookName(library.getBookName());
		 existingLibrary.setAuthorName(library.getAuthorName());
		 existingLibrary.setStatus(library.getStatus());
		 
		 libraryService.updateLibrary(existingLibrary);
		 return "redirect:/books";
	}
	
	@GetMapping("/books/{id}")
	public String deleteLibrary(@PathVariable Integer id) {
		libraryService.deleteLibraryById(id);
		return "redirect:/books";
	}
}