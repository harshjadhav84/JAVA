import java.util.Scanner;
class While5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number");
		int st = sc.nextInt();

		System.out.println("Enter ending number");
		int end = sc.nextInt();
		
        while (st <= end) {
            if (st % 2 == 0) {
                System.out.println(st);
            }
            st++;
        }

	}
}
