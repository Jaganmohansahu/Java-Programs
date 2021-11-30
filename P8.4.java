//Displaying a 2D array as a matrix
class Matrix
{
	public static void main(String[] args) 
	{
			float x[][] = {{1.1f, 1.2f, 1.3f, 1.4f},
							{2.1f, 2.2f, 2.3f, 2.3f},
							{3.1f, 3.2f, 3.3f, 3.4f}};
			System.out.println("In matrix form: ");
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<4; j++)
				{
					System.out.println(x[i][j]);
				}
				System.out.println();
			}
			
	}
}