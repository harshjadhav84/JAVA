import java.util.Scanner;
class Method2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number");
		int a = sc.nextInt();
		System.out.println("Eneter your second number");
		int b = sc.nextInt();
		System.out.println("addition of two numbers is" + add(a,b));
		System.out.println("Subtraction of two numbers is" + sub(a,b));
		System.out.println("Multiplication of two numbesr is" + mult(a,b));
	}
	public static int add(int num1,int num2){
		return num1 + num2;
	}
	public static int sub(int num1, int num2){
		return num1 - num2;
	}
	public static int mult(int num1, int num2){
		return num1 * num2;
	}
}
