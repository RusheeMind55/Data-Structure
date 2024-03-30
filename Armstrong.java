package InterviewPractice;

public class Armstrong {

	public static void main(String[] args) {

		int n=123;
		int m=n;
		int arm=0;
		
		while(n>0){
			int	rem=n%10;
				arm=(rem*rem*rem)+arm;
				n=n/10;
				System.out.println(arm);
			}
	}

}
