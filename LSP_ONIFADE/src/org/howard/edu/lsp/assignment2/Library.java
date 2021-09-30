package org.howard.edu.lsp.assignment2;

public class Library {
	string address;
	ArrayList<Book> list;
}
	// Add the missing implementation (methods and data definitions) to this class 

	// Constructor – look it up
	public Library(String title) {
		this.address = title;
		this.list = new ArrayList<Book>();
		// Implement the constructor
	}
	
	public static void printOpenHours() {
		system.out.println("Libraries are open from 8am to 7pm");
	}
	
	public void printAddress() {
		System.out.println(this.address);
	}
	
	public void borrowBook(String title) {
		for(Book book:this.list) {
			if(title.equals.(book.getTitle())) {
				if(book.isBorrowed()) {
					System.out.println("Sorry, this book has already been borrowed");
					return;
				}
				else {
					book.borrowed();
					System.out.println("You have successfully borrowed" + book.getTitle());
					return;
				}
			}
		}
		System.out.println("Sorry this book is not in this library's catalog.");
	}
	
	public void printAvailableBooks() {
		if(this.list.isEmpty()) {
			System.out.println("The book isnt available in this library's catalog");
		}
		for(Book book:this.list) {
			System.out.println(book.getTitle());
		}
	}
	
	public void returnBook(String title) {
		for(Book book:this.list) {
			if(title.equals(book.getTitle())) {
				book.returned();
				System.out.println("You have succesfully returned " + book.getTitle());
			}
		}
	}

	public static void main(String[] args) { 
	// Create two libraries 
	Library firstLibrary = new Library("10 Main St."); 
	Library secondLibrary = new Library("228 Liberty St."); 

	// Add four books to the first library 
	firstLibrary.addBook(new Book("The Da Vinci Code")); 
	firstLibrary.addBook(new Book("Le Petit Prince")); 
	firstLibrary.addBook(new Book("A Tale of Two Cities")); 
	firstLibrary.addBook(new Book("The Lord of the Rings")); 

	// Print opening hours and the addresses 
	System.out.println("Library hours:");
	firstLibrary.printOpenHours(); 
	System.out.println();
	
	System.out.println("Library addresses:"); 
	firstLibrary.printAddress(); 
	
	System.out.println("Library hours:");
	secondLibrary.printOpeningHours(); 
	System.out.println(); 
	
	System.out.println("Library addresses:"); 
	secondLibrary.printAddress(); 

	// Try to borrow The Lords of the Rings from both libraries System.out.println("Borrowing The Lord of the Rings:"); firstLibrary.borrowBook("The Lord of the Rings"); 
	firstLibrary.borrowBook("The Lord of the Rings"); secondLibrary.borrowBook("The Lord of the Rings"); 
	System.out.println(); 

	// Print the titles of all available books from both libraries System.out.println("Books available in the first library:"); firstLibrary.printAvailableBooks(); 
	System.out.println(); 
	System.out.println("Books available in the second library:"); secondLibrary.printAvailableBooks(); 
	System.out.println(); 

	// Return The Lords of the Rings to the first library 
	System.out.println("Returning The Lord of the Rings:"); firstLibrary.returnBook("The Lord of the Rings"); 
	System.out.println(); 


}

	private void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}
