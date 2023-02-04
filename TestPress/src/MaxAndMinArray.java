
public class MaxAndMinArray {
	public static void main(String[] args) {
		int a[]= {54,546,548,60};
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(max+" "+min);
	}

}
