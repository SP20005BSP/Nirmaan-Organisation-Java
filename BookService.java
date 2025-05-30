package day24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BookService {
	
	Scanner sc = new Scanner(System.in);

	// add Book
	public Book addBook() {

		System.out.println("Enter the Book ID ");
		int Bookid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Book Name ");
		String Bookname = sc.nextLine();
		System.out.println("Enter the Authour Name ");
		String Authourname = sc.nextLine();
		System.out.println("Enter the Book price");
		double Bookprice = sc.nextDouble();

		return new Book(Bookid, Bookname, Authourname, Bookprice);

	}
	
	// read Books
		public void getBooks(ArrayList<Book> Books) {
			System.out.println(Books);

		}

		// read Book by Id
		public Book getBookbyId(int id, ArrayList<Book>Books) {

			for (Book Bk : Books) {
				if (Bk.getBook_id() == id) {
					return Bk;
				}
			}

			return null;

		}

}
