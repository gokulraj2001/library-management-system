package com.example.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.librarymanagementsystem.entity.Library;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
	
}
