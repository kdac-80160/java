
public class Asgn_01_Q4b {

	public static void main(String[] args) 
	{
		int n = 10;
		for(int i =1; i<=n; i++)
		{
			for(int j = n; j>i; j--)
			System.out.print(" ");
			
			for(int k = 1; k<=1+(i-1)*2; k++)
				System.out.print("*");
			
			System.out.println();
		}
		for(int i =1; i<n; i++)
		{
			for(int j = 1; j<=i; j++)
			System.out.print(" ");
			
			for(int k = 1; k<=1+(n-1-i)*2; k++)
				System.out.print("*");
			
			System.out.println();
		}
	}

}