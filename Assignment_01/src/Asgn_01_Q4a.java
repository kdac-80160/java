
public class Asgn_01_Q4a {

	public static void main(String[] args) 
	{
		int n = 7;
		int i,j,k;
		for(i = 0; i<n; i++)
		{
			for(j = n-1; j>i; j--)
			{
				System.out.print(" ");
			}
			for(k = 0; k<=i; k++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}

	}

}