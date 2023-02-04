import java.util.Scanner;

public class ReverseNumber {
	
	
	private static int reveseDigits(int a) {
		int rev=0;
		while(a>0)
		{
			int d=a%10;
			rev=rev*10+d;
			a=a/10;
			
		}
		return rev;
	}
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println(reveseDigits(a));



}
}
