class  Ternary2
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 6;
		int c = 7;
		int res = a>b ? (a>b ? a : b) : (b>c ? b:c);
		System.out.println(res);
	}
}
