<<<<<<< HEAD
<<<<<<< HEAD
//Jagged Array
import java.util.*;
class Test
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Eneter the row ");
		int row = sc.nextInt();

		int mat[][] = new int[row][];
		for(int i=0; i<mat.length; i++)
		{
			System.out.println("Enter the column size for row "+i);
			int col = sc.nextInt();
			mat[i] = new int[col];
		}
		display(mat);
		input(mat);
		display(mat);
	}
	public static void display(int mat[][])
	{
		System.out.println("The matrix: ");

		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat.length; j++)
			{
				System.out.println(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void input(int mat[][])
	{
		for(int i=0; i<mat.length; i++)
		{
			System.out.println("Enter the elements for row: "+i);
			for(int j=0; j<mat[i].length; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
	}
=======
//Jagged Array
import java.util.*;
class Test
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Eneter the row ");
		int row = sc.nextInt();

		int mat[][] = new int[row][];
		for(int i=0; i<mat.length; i++)
		{
			System.out.println("Enter the column size for row "+i);
			int col = sc.nextInt();
			mat[i] = new int[col];
		}
		display(mat);
		input(mat);
		display(mat);
	}
	public static void display(int mat[][])
	{
		System.out.println("The matrix: ");

		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat.length; j++)
			{
				System.out.println(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void input(int mat[][])
	{
		for(int i=0; i<mat.length; i++)
		{
			System.out.println("Enter the elements for row: "+i);
			for(int j=0; j<mat[i].length; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Jagged Array
import java.util.*;
class Test
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Eneter the row ");
		int row = sc.nextInt();

		int mat[][] = new int[row][];
		for(int i=0; i<mat.length; i++)
		{
			System.out.println("Enter the column size for row "+i);
			int col = sc.nextInt();
			mat[i] = new int[col];
		}
		display(mat);
		input(mat);
		display(mat);
	}
	public static void display(int mat[][])
	{
		System.out.println("The matrix: ");

		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat.length; j++)
			{
				System.out.println(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void input(int mat[][])
	{
		for(int i=0; i<mat.length; i++)
		{
			System.out.println("Enter the elements for row: "+i);
			for(int j=0; j<mat[i].length; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}