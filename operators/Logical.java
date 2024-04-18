class  logical
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 14;
		System.out.println(a<b && b>=a);
		System.out.println(b<a && a>=b);
		System.out.println(a>=b && !(b>=a));
	}
}
