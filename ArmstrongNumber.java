package InterviewPractice;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=111;
		

		int m=n;
		int arm=0;
		int c=0;
		c=n;
		while(n>0){
		int	rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
			System.out.println(n);
		}
		if(c==arm) 
			System.out.println("Armstrong Number");
		
		else
			System.out.println("Not Armstrong Number");
	 
	}

}
