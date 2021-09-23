package by.academy.lesson22.composition;

import java.util.List;

class Library {

	private final List<Book> books;

	Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getTotalBooksInLibrary() {
		return books;
	}

}