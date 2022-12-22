package com.collections.di.books;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookWhitman")
public class BookByType implements Book {
	
	@Value("2")
	private long id;
	@Value("11002")
	private String isbn;
	@Value("bookWhitman")
	private String title;
	@Value("25.10")
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
		sb.append("Autowiring byType: book = Book - Id:").append(id).append(", ISBN: ").append(isbn).append(", Title: ").append(title).append(", Price: ").append(price);
		return sb.toString();
	}

}
