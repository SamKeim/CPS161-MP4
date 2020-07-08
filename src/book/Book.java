package book;

public class Book {

	String name;
	Author author;
	String isbn;
	double price;
	
	public Book(String name, Author author, String isbn, double price) {
		this.name = name;
		this.author = new Author(author);
		this.isbn = isbn;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setAuthor(String firstName, String lastName, String birthday) {
		this.author = new Author(firstName, lastName, birthday);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) return true;
		if(!(o instanceof Book)) return false;
		Book compare = (Book) o;
		
		boolean validName = this.name.equals(compare.getName());
		boolean validAuthor = this.author.equals(compare.getAuthor());
		boolean validIsbn = this.isbn.equals(compare.getIsbn());
		boolean validPrice = (this.price - compare.getPrice()) < 0.01;
		
		return validName && validIsbn && validPrice && validAuthor;
	}

	@Override
	public String toString() {
		return String.format(
				"Book[%s by %s isbn=%s, price=%.2f]",
				this.name,
				this.author.toString(),
				this.isbn,
				this.price
				);
	}
}
