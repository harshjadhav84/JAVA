class Logical2 
{
	public static void main(String[] args) 
	{
		int a = 6;
		int b = 12;
		System.out.println(++a <= b-- || --b>=a++);
		System.out.println(--b>a++ || !(--a <= b--));
		System.out.println(a-- > b++ || !(b++ > ++a));
		System.out.println(!(++a <= --b || b>=a));
		System.out.println(a);
		System.out.println(b);
	}
}
