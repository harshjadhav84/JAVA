import java.util.Scanner;
class Input2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Enter your Salary:");
		double sal = sc.nextDouble();
		System.out.println("Enter your  ID :");
		int id = sc.nextInt();
		System.out.println("Enter your Marital Status");
		boolean st = sc.nextBoolean();
		System.out.println("Enter your mobile number :");
		long mno = sc.nextLong();
		System.out.println("Enter youe age :");
		int age = sc.nextInt();
		System.out.println("Enter your name initial :");
		char init = sc.next().charAt(0);

		System.out.println(name);
		System.out.println(sal);
		System.out.println(id);
		System.out.println(st);
		System.out.println(mno);
		System.out.println(age);
		System.out.println(init);

		


	}
}
