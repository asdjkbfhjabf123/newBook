package com.geekzila.newbook.service.impl;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import com.geekzila.newbook.service.BookService;

public class BookServiceImpl implements BookService{
	
	public List<Book> books = new ArrayList<Book>();
	
	public BookServiceImpl() {
		books.add(new Book("Rakesh"));
		books.add(new Book("Ariv"));
	}

	public void add(Book book) {
		// TODO Auto-generated method stub
		books.add(book);
	}

	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return books;
	}

	public Book get(String name) {
		// TODO Auto-generated method stub
		
		for(Book book : books) {
			if(book.getName().equals(name)) {
				return book;
			}
		}
		return null;
	}

	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}

}
