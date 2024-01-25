package practice;

public class Third{
	
	public static int x,y;

	public static void main(String[] args)
	{
		//int x;
		x=5;
		Second t=new Second();
		System.out.println(x);
		//comment\u000dx=23;
		System.out.println(Third.x);
		Third new1= new Third();
		new1.New();
		
		System.out.println(t.x +""+t.y);
		System.out.println("Hello"+t);
	}
	
	void New()
	{
		System.out.println(x);
	}
}
