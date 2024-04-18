class Postincrement2 
{
	public static void main(String[] args) 
	{
		int a = 13;
		int b = 9;

		System.out.println(++a >= --b);
		System.out.println(b++ >= a--);
		System.out.println(--a < b++);
		System.out.println(--a > b++);
		System.out.println(++a != b--);
		System.out.println(a-- == --b);
		System.out.println(a);
		System.out.println(b);
		
	}
}
