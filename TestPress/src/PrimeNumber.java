import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=0;
		for(int i=2;i<=a-1;i++)
		{
			if(a%2==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	

}
