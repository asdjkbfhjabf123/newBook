package com.geekzila.newbook.service;

import java.awt.print.Book;
import java.util.List;

public interface BookService {

	public void add(Book book);

	public List<Book> findAll();

	public Book get(String name);

	public void delete(String name);

}
