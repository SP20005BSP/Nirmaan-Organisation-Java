

public class palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word :");
		String a=sc.next();
		String b=a.trim();
		String c ="";
		for(int i = b.length()-1;i>=0;i--) {
			c=c+b.charAt(i);
		}
		System.out.println(c);
		if(b.equals(c)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

}
