class Preincrement2 
{
	public static void main(String[] args) 
	{
		int a = 12;
		int b = 7;
		int c = --a - ++b + --a - --b + ++b + ++a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
