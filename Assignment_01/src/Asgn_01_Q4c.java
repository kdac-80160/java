
public class Asgn_01_Q4c {

	public static void main(String[] args) {
		int n = 10;
		for(int i =1; i<=n; i++)
		{
			for(int j = n; j>i; j--)
			System.out.print(" ");
			
			for(int k = 1; k<=1+(i-1)*2; k++)
				System.out.print("*");
			
			System.out.println();
		}

	}

}
