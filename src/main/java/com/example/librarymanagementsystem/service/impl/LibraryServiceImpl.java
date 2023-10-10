package com.example.librarymanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.librarymanagementsystem.entity.Library;
import com.example.librarymanagementsystem.repository.LibraryRepository;
import com.example.librarymanagementsystem.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {
	
	private LibraryRepository libraryRepository;
	
	public LibraryServiceImpl(LibraryRepository libraryRepository) {
		super();
		this.libraryRepository = libraryRepository;
	}

	@Override
	public List<Library> getAllBooks() {
		return libraryRepository.findAll();
	}

	@Override
	public Library saveBook(Library library) {
		return libraryRepository.save(library);
	}

	@Override
	public Library getLibraryById(Integer id) {
		return libraryRepository.findById(id).get();
	}

	@Override
	public Library updateLibrary(Library library) {
		return libraryRepository.save(library);
	}

	@Override
	public void deleteLibraryById(Integer id) {
		libraryRepository.deleteById(id);		
	}

}
