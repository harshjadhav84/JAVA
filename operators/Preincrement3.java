class Preincrement3 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 3;
		int c = ++a + ++b - ++a - --b - --a + ++b - ++a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
