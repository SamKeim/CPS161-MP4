package book;

import java.time.LocalDate;

public class Author {

	String firstName;
	String lastName;
	LocalDate birthday;
	
	public Author(Author copy) {
		this.firstName = copy.firstName;
		this.lastName = copy.lastName;
		this.birthday = LocalDate.of(
				copy.birthday.getYear(), 
				copy.birthday.getMonth(), 
				copy.birthday.getDayOfMonth());
	}
	
	/**
	 * 
	 * @param first and last name
	 * @param birthday in MM-DD-YYYY format
	 */
	public Author(String firstName, String lastName, String birthday) {
		this.firstName = firstName;
		this.lastName = lastName;
		try {
			String[] array = birthday.split("-");
			this.birthday = LocalDate.of(
					Integer.parseInt(array[2]),
					Integer.parseInt(array[0]),
					Integer.parseInt(array[1]));
		} catch (Exception e) {
			System.out.println("Invalid Date. Please try again.");
			this.birthday = null;
		}	
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public boolean equals(Object o) {
		if(o == this) return true;
		if(!(o instanceof Author)) return false;
		Author compare = (Author) o;
		
		boolean validFirstName = this.firstName.equals(compare.getFirstName());
		boolean validLastName = this.lastName.equals(compare.getLastName());
		boolean validBirthday = this.birthday.equals(compare.getBirthday());
		
		return validFirstName && validLastName && validBirthday;
	}
	
	@Override
	public String toString() {
		return String.format(
				"%s %s(birthday: %s)",
				this.firstName,
				this.lastName,
				this.birthday);
	}
}
