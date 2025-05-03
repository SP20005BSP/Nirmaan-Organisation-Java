package day4;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		Scanner get=new Scanner(System.in);
		System.out.println("enter the 1st number:");
		int num1=get.nextInt();
		System.out.println("enter the 2nd number:");
		int num2=get.nextInt();
		System.out.println("press 1 for add");
		System.out.println("press 2 for sub");
		System.out.println("press 3 for mul");
		System.out.println("press 4 for mod");
		int key=get.nextInt();
		switch(key) {
		case 1:{
			System.out.println("add"+(num1+num2));
		}
		case 2:{
			System.out.println("sub"+(num1-num2));
		}
		
		case 3:{
			System.out.println("mul"+(num1*num2));
		}
		case 4:{
			System.out.println("mod"+(num1%num2));
		}
		default:
			System.out.println("retry");
		}
				
		
	}

}
