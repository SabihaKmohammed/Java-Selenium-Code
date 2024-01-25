package practice;

public class Enhaced_forLoop {

	public static void main(String[] args) {
	
		int [] evenNum= {2,4,6,8};
		int sum=0;
		System.out.println("the List of array is ");
		
		//for(int i=0; i<evenNum.length; i++)
			for(int x:evenNum)
		{
			//System.out.println(evenNum[i]);
				System.out.println(x);
		}
		
	}

}
