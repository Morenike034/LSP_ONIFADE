package org.howard.edu.lsp.assignment2;

public class Book {
	private String title; 
	private boolean borrowed; 

	// Creates a new Book 
	public Book(String bookTitle) {
		this.title = title;
		this.borrowed = false;
	} // Implement this method
	
	// Marks the book as rented 
	public void borrowed() {
		this.borrowed = true;
	} // Implement this method 
	
	// Marks the book as not rented 
	public void returned() {
		this.borrowed = false;
	} // Implement this method 
	
	// Returns true if the book is rented, false otherwise public 
	public boolean isBorrowed() {
		if(this.borrowed) {
			return true;
		}
		else {
			return false;
		}
	} // Implement this method 
	
	// Returns the title of the book public 
	public String getTitle() {
		return this.title;
	}  // Implement this method 
	
	public static void main(String[] arguments) {
		Book example = new Book("The Da Vinci Code");
		System.out.println("Title (The Da Vinci Code): " + example.getTitle());
		System.out.println("borrowed? (f): " + example.isBorrowed());
		example.borrowed();
		System.out.println("borrowed? (t): " + example.isBorrowed());
		example.returned();
		System.out.println("borrowed? (f): " + example.isBorrowed());
	}

}
