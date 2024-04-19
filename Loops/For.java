import java.util.Scanner;
class For 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int start = sc.nextInt();
		System.out.println("Enter the ending number");
		int end = sc.nextInt();

		for (int i = start; i<=end; i++)
		{
			if (i%2==1)
			{
				System.out.println(i);
			}
		}

	}
}
