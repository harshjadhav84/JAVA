import java.util.Scanner;
class Characters 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character :");

		char ch = sc.next().charAt(0);

		if (ch >= 'a' && ch<='z')
		{
			System.out.println("Character is lowercase");
		}

		else  if (ch >= 'A' && ch <='Z')
		{
			System.out.println("Charscter is uppercase");

		}

		else if(ch >= '0' && ch<='9')
		{
			System.out.println("character is digit");
		}

		else{
			System.out.println("Charscter is spacial symbol");
		}

	}
}
