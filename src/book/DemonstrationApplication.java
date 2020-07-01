package book;

public class DemonstrationApplication {
	public static void main(String[] args) {
		
		Author jkr = new Author("JK", "Rowling", "07-31-1965");
		Book bookOne = new Book(
				"Harry Potter and the Sorcerer's Stone",
				jkr,
				"B017V41MVQ",
				11.99);
		Book bookTwo = new Book(
				"Harry Potter and the Chamber of Secrets",
				jkr,
				"B017V4IPPO",
				13.00);
		System.out.println(bookOne);
		System.out.println(bookTwo);
		if(bookOne.equals(bookTwo)) {
			System.out.println("They are the same book.");
		} else {
			System.out.println("They are not the same book.");
		}
	}
}
