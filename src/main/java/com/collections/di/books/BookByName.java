package com.collections.di.books;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookFrost")
public class BookByName implements Book {
	
	@Value("1")
	private long id;
	@Value("11001")
	private String isbn;
	@Value("bookFrost")
	private String title;
	@Value("20.50")
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
		sb.append("Autowiring byName: book = Book - Id:").append(id).append(", ISBN: ").append(isbn).append(", Title: ").append(title).append(", Price: ").append(price);
		return sb.toString();
	}

}
