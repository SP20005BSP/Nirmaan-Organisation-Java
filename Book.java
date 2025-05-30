package day24;

public class Book {
	private int Book_id;
	private String Book_name;
	private String Authour_name ;
	private double Book_price;
	
	public int getBook_id() {
		return Book_id;
	}
		public void setBook_id(int book_id) {
		Book_id = book_id;
	}
	public String getBook_name() {
		return Book_name;
	}
	public void setBook_name(String book_name) {
		Book_name = book_name;
	}
	public String getAuthour_name() {
		return Authour_name;
	}
	public void setAuthour_name(String authour_name) {
		Authour_name = authour_name;
	}
	public double getBook_price() {
		return Book_price;
	}
	public void setBook_price(double book_price) {
		Book_price = book_price;
	}
	public Book(int book_id, String book_name, String authour_name, double book_price) {
		super();
		Book_id = book_id;
		Book_name = book_name;
		Authour_name = authour_name;
		Book_price = book_price;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [Book_id=" + Book_id + ", Book_name=" + Book_name + ", Authour_name=" + Authour_name
				+ ", Book_price=" + Book_price + "]";
	}
}
