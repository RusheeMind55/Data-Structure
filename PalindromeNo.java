package InterviewPractice;

public class PalindromeNo {
//Que.cheack the palindrome are yes or no.?
//Que. write palindrome code in this numbere 876234 (Ans.432678)?
	public static void main(String[] args) {
		
		int n=24242;
		int m=n;
		int palindromNo=0;
		while(n!=0) {
			int d=n%10;
			palindromNo=palindromNo *10 +d;
			n=n/10;
			System.out.println("palindrom No is "+" "+palindromNo);
		}
		if(palindromNo==m) {
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");
		}
	}

}
