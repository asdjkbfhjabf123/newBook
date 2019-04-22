package com.geekzila.newbook;

import java.awt.print.Book;
import java.util.List;

import com.geekzila.newbook.service.BookService;
import com.geekzila.newbook.service.impl.BookServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();

		List<Book> books = bookService.findAll();

		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			System.out.println("The book name is " + book.getName());
		}

		Book raja = bookService.get("Raja");
		System.out.println("Name: " + raja.getname());

	}
}
