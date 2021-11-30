//3D ARRAY
class Test
{
	public static void main(String[] args) 
	{
		string arr[][][] = new String[2][3][2];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<[i][j].length; k++)
				{
					arr[i][j][k] = "Index: "+i+j+k;
					System.out.println(arr[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}	
	}
}