import java.util.Scanner;
class Ladder2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your age:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();


		if (num >= 21 && num <=35)
		{
			System.out.println("Your match is found");
		}

		else if (num >=36 && num<=50)
		{
			System.out.println("Hard.... but still you can have hopes");
		}

		else if (num > 51)
		{
			System.out.println("better luck next time");
		}

		else {
			System.out.println("first grow and then come");
		}
	}
}
