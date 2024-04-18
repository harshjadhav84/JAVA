class Postincrement3
{
	public static void main(String[] args) 
	{
		int a = -5;
		int b = 7;
		int c = 4;
		int k = a++ - --b + c-- + ++a + b++ - c++  -b++ + a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(k);
		
	}
}
