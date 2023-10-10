package com.example.librarymanagementsystem.service;

import java.util.List;
import com.example.librarymanagementsystem.entity.Library;

public interface LibraryService {
	List<Library> getAllBooks();
	
	Library saveBook(Library library);
	
	Library getLibraryById(Integer id);
	Library updateLibrary(Library library);
	
	void deleteLibraryById(Integer id);
}
