<<<<<<< HEAD
<<<<<<< HEAD
//Area of circle using Factory method
import java.text.*;
class Circle
{
	public static void main(String[] args) 
	{
		final double PI = (double)22/7;
		double r = 15.5;
		double area = PI*r*r;
		System.out.println("Area = "+area);

		NumberFormat obj = NumberFormat.getNumberInstance();

		obj.setMaximumFractionDigits(2);
		obj.setMinimumFractionDigits(7);

		String str = obj.format(area);
		System.out.println("Formatted area = "+str);	
	}
=======
//Area of circle using Factory method
import java.text.*;
class Circle
{
	public static void main(String[] args) 
	{
		final double PI = (double)22/7;
		double r = 15.5;
		double area = PI*r*r;
		System.out.println("Area = "+area);

		NumberFormat obj = NumberFormat.getNumberInstance();

		obj.setMaximumFractionDigits(2);
		obj.setMinimumFractionDigits(7);

		String str = obj.format(area);
		System.out.println("Formatted area = "+str);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Area of circle using Factory method
import java.text.*;
class Circle
{
	public static void main(String[] args) 
	{
		final double PI = (double)22/7;
		double r = 15.5;
		double area = PI*r*r;
		System.out.println("Area = "+area);

		NumberFormat obj = NumberFormat.getNumberInstance();

		obj.setMaximumFractionDigits(2);
		obj.setMinimumFractionDigits(7);

		String str = obj.format(area);
		System.out.println("Formatted area = "+str);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}