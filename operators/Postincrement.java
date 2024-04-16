class Postincrement 
{
	public static void main(String[] args) 
	{
		int a = 6;
		int b = 13;
		int c = 9;
		int k = ++a - b-- + ++c + a++ - b-- + c-- + a-- -b-- ;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(k);
	}
}
