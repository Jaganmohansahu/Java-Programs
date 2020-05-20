<<<<<<< HEAD
<<<<<<< HEAD
//Creating a Vector with Integer elements
import java.util.*;
class VectorDemo
{
	public static void main(String[] args) 
	{
		Vector<Integer> v= new Vector<>();

		int x[] = {22, 20, 10, 40, 15, 60};

		for(int i=0; i<x.length; i++)
		{
			v.add(x[i]);
		}	
		System.out.println("Vector elements: ");
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("Elements using ListIteretor: ");
		ListIterator lit = v.listIterator();

		System.out.println("In forward direction: ");
		while(lit.hasNext())
			System.out.print(lit.next()+"\t");

		System.out.println("\nIn backword direction: ");
		while(lit.hasPrevious())
			System.out.print(lit.previous()+"\t");
	}
=======
//Creating a Vector with Integer elements
import java.util.*;
class VectorDemo
{
	public static void main(String[] args) 
	{
		Vector<Integer> v= new Vector<>();

		int x[] = {22, 20, 10, 40, 15, 60};

		for(int i=0; i<x.length; i++)
		{
			v.add(x[i]);
		}	
		System.out.println("Vector elements: ");
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("Elements using ListIteretor: ");
		ListIterator lit = v.listIterator();

		System.out.println("In forward direction: ");
		while(lit.hasNext())
			System.out.print(lit.next()+"\t");

		System.out.println("\nIn backword direction: ");
		while(lit.hasPrevious())
			System.out.print(lit.previous()+"\t");
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Creating a Vector with Integer elements
import java.util.*;
class VectorDemo
{
	public static void main(String[] args) 
	{
		Vector<Integer> v= new Vector<>();

		int x[] = {22, 20, 10, 40, 15, 60};

		for(int i=0; i<x.length; i++)
		{
			v.add(x[i]);
		}	
		System.out.println("Vector elements: ");
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("Elements using ListIteretor: ");
		ListIterator lit = v.listIterator();

		System.out.println("In forward direction: ");
		while(lit.hasNext())
			System.out.print(lit.next()+"\t");

		System.out.println("\nIn backword direction: ");
		while(lit.hasPrevious())
			System.out.print(lit.previous()+"\t");
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}