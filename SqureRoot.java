package InterviewPractice;
import java.util.Scanner;
public class SqureRoot {

	public static void main(String[] args) {
		
		int n;
		
	
		
		System.out.println("enter the number:");
		Scanner squre=new Scanner(System.in);
		n=squre.nextInt();
		
		double m=Math.sqrt(n);
		System.out.println("squre root of "+n+"is "+""+m);
	}

}
