package day24;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		ArrayList<Book> al = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		BookService service = new BookService();
		Book Bk = new Book();
		
		while(true) {
			System.out.println("Enter your choice \n 1 for add Book \n 2 for show Books n 3 for get Book by Id");
			int key = sc.nextInt();
			
			if(key == 1) {
				
				al.add(service.addBook());
				
			}else if(key == 2) {
				
				service.getBooks(al);
				
			}else if(key == 3) {
				
				System.out.println("Enter the Book Id");
				int Bookid = sc.nextInt();
				System.out.println(service.getBookbyId(Bookid, al));
				
			}
		}
		
		
		
	}

}
