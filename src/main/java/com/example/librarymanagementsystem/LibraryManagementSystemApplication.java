package com.example.librarymanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.librarymanagementsystem.entity.Library;
import com.example.librarymanagementsystem.repository.LibraryRepository;

@SpringBootApplication
public class LibraryManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSystemApplication.class, args);
	}
	
	@Autowired
	private LibraryRepository libraryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Library book1= new Library(1234, "Science-fiction", "The Blazing World", "Margaret Cavendish", "Available");
//		libraryRepository.save(book1);
		
	}

}
