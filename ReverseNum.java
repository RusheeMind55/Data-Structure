package InterviewPractice;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a Number :");
		
	int	num=sc.nextInt();
	
	
	/*			int rev=0;
	
					while(num !=0) {
					rev=rev*10 + num%10 ; 			// 0+1234%10=4  nxt 40+3=43
					num=num/10;      			    // 1234/10=123
	}
	System.out.println("Revrse Number"+rev); 		*/
	
	
	
	//using stringBuffer
	
	StringBuffer sb=new StringBuffer(String.valueOf(num));
	StringBuffer rev=sb.reverse();
	System.out.println("Revrse Number"+rev); 
	}

}
