import java.util.Scanner;
class  While6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter starting number");
		int start = sc.nextInt();

		System.out.println("Enter the ending number");
		int end = sc.nextInt();
		while(start <= end)
		{
			if(start %3 ==0 && start % 5 ==0){
				System.out.println(start);
			}
			start++;
		}
	}
}
