package abc;

public class Java 
{
	public static void  add (int a,int b,int c)
	{
		int d=a;
		int e=c;
		int f=d+e;
		System.out.println(f);
		System.out.println("It is a three argument method");
	}
	
	public static void add(int a, int b)
	{
		System.out.println("It is a two argument method");
	}
	
	public void add (String z)
	{
		System.out.println("It is one argument method");
	}
	public void add(boolean y)
	{
		System.out.println("It is boolean argument");
	}
	
	public static void main(String[] args)
	{
		Java.add(10, 20, 30);
		Java.add(20, 30);
		
		Java m = new Java();
		m.add(false);
		m.add("Khushbu");
		
	}
	
	
	

}
