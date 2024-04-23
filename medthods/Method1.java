class Method1 
{
	public static void main(String[] args) 
	{
		System.out.println("from main()");
		m1();
		test();
		System.out.println("end main()");
	}
	public static void m1(){
		System.out.println("m1()");
		test();
	}
	public static void test(){
		System.out.println("test()");
	}
}
