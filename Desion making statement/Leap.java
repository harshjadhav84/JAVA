import java.util.Scanner;
class Leap 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int yr = sc.nextInt();

		if (yr % 4 ==0)
		{
			System.out.println("therfg year is leap year");
		}

		else if (yr %4 == 0 && yr % 100!=0)
		{
			System.out.println("the year is leap");
		}
		else {
			System.out.println("year is not leap");
		}
	}
}
