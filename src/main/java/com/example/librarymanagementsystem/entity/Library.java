package com.example.librarymanagementsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "books")
public class Library {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	@Column(name="S.No")
	private Integer id;
	
	@Column(name="book_id")
	private Integer bookID;
	
	@Column(name="category")
	private String category;
	
	@Column(name="book_name")
	private String bookName;
	
	@Column(name="author_name")
	private String authorName;
	
	@Column(name="status")
	private String status;
	
	public Library() {
		
	}
	

	public Library(Integer bookID, String category, String bookName, String authorName, String status) {
		super();
		this.bookID = bookID;
		this.category = category;
		this.bookName = bookName;
		this.authorName = authorName;
		this.status = status;
	}


	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getBookID() {
		return bookID;
	}


	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}


	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
