class DoWhile 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 10;
		do
		{
			if (a %2 ==0)
			{
				System.out.println("*");
			}
			else {
				System.out.println("@");
			}
			a++;
		}
		while (a<=b);

	}
}
