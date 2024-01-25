package practice;

public class Sum_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,1,7,4};
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
			
		}

		System.out.println("The Sum of Array "+sum);
	}

}
