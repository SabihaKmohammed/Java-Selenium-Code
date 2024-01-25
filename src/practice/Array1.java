package practice;

public class Array1 {

	public static void main(String[] args) {
		int n=2156;
		int num;
		int reverse=0;
		
		while(n>0)
		{
			num=n%10;
			reverse=reverse*10+num;
			n=n/10;
		}
		System.out.println(reverse);
		
		
		
		
        

		}

}
