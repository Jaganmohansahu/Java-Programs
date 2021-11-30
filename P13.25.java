//Demo of varags methods to find the biggest number
class Vargs
{
	static int max(int...x)
	{
		int max = x[0];

		for(int i=1; i<x.length; i++)

			if(max < x[i])	
				max = x[i];
			return max;
	}
	public static void main(String[] args)
	{
		int arr1[] = {20, 10, 5, 35, 40};
		int result = max(arr1);
		System.out.println("Maximum = "+result);

		int arr2[] = {1, 2, 3};
		result = max(arr2);
		System.out.println("Maximum = "+result);

		result = max(10, 30);
		System.out.println("Maximum = "+result);	
	}
}