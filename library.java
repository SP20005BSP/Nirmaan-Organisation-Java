package day6;

public class library {
	int book_id;
	String book_name;
	int book_price;
	String author_name;
	

	public static void main(String[] args) {
		
		library b1=new library();
		b1.book_id=111;
		b1.author_name="santa";
		b1.book_name="harry porter";
		b1.book_price=89;
		
		library b2=new library();
		b2.book_id=1154;
		b2.author_name="sanny";
		b2.book_name="java";
		b2.book_price=839;
		
		library b3=new library();
		b3.book_id=1141;
		b3.author_name="suresh";
		b3.book_name="python";
		b3.book_price=549;
		System.out.println(b1.book_id);
		System.out.println(b2.book_id);
        System.out.println(b3.author_name);
	}

}
