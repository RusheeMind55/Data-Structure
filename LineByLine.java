package InterviewPractice;

public class LineByLine {

	public static void main(String[] args) {

		//  Que. print all digit of number 268 on  diffrent lines ?
				
			int n=268;
				int m=n;
				while(n!=0) {
					int d=n%10;
					System.out.println(d);
					n=n/10;
				}
	}
}
