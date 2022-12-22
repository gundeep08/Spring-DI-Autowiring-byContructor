package com.collections.di.books;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("book")
public class BookByConstructor implements Book {
	
	@Value("3")
	private long id;
	@Value("11003")
	private String isbn;
	@Value("book")
	private String title;
	@Value("33.90")
	private float price;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String getBookDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("Autowiring byConstructor: book = Book - Id:").append(id).append(", ISBN: ").append(isbn).append(", Title: ").append(title).append(", Price: ").append(price);
		return sb.toString();
	}

}
