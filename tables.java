package day4;

import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		Scanner get=new Scanner(System.in);
		System.out.println("enter the number");
		int value=get.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(value +"X"+i+"="+(value*i));
		}
			
		

	}

}
