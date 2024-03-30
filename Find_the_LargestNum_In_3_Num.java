package InterviewPractice;

import java.util.Scanner;


public class Find_the_LargestNum_In_3_Num {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is the largest number: "+a);
		}
		else if (b>a && b>c) {
			System.out.println("b is the largest number : "+b);
		}
		else
		{
			System.out.println("c is the largest number : "+c);
		}
	}

}
