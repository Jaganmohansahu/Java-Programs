<<<<<<< HEAD
<<<<<<< HEAD
//Calculating tax by taking name and salary from param tags
import java.awt.*;
import java.applet.*;
public class Tax extends Applet 
{
	String name, str;
	float sal, tax;

	public void init()
	{
		name = getParameter("t1");

		str = getParameter("t2");
		sal = Float.parseFloat(str);

		calculateTax(sal);
	}

	public void calculateTax(float sal)
	{
		if(sal <= 100000)
			tax = 0.0f;
		else if(sal <= 200000)
			tax = sal*0.1f;
		else tax = sal*0.2f;
	}

	public void paint(Graphics g)
	{
		g.drawString("Hello"+name, 20, 100);
		g.drawString("Your salary: "+sal, 20, 120);
		g.drawString("Pay the tax: "+tax, 20, 140);
	}
=======
//Calculating tax by taking name and salary from param tags
import java.awt.*;
import java.applet.*;
public class Tax extends Applet 
{
	String name, str;
	float sal, tax;

	public void init()
	{
		name = getParameter("t1");

		str = getParameter("t2");
		sal = Float.parseFloat(str);

		calculateTax(sal);
	}

	public void calculateTax(float sal)
	{
		if(sal <= 100000)
			tax = 0.0f;
		else if(sal <= 200000)
			tax = sal*0.1f;
		else tax = sal*0.2f;
	}

	public void paint(Graphics g)
	{
		g.drawString("Hello"+name, 20, 100);
		g.drawString("Your salary: "+sal, 20, 120);
		g.drawString("Pay the tax: "+tax, 20, 140);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Calculating tax by taking name and salary from param tags
import java.awt.*;
import java.applet.*;
public class Tax extends Applet 
{
	String name, str;
	float sal, tax;

	public void init()
	{
		name = getParameter("t1");

		str = getParameter("t2");
		sal = Float.parseFloat(str);

		calculateTax(sal);
	}

	public void calculateTax(float sal)
	{
		if(sal <= 100000)
			tax = 0.0f;
		else if(sal <= 200000)
			tax = sal*0.1f;
		else tax = sal*0.2f;
	}

	public void paint(Graphics g)
	{
		g.drawString("Hello"+name, 20, 100);
		g.drawString("Your salary: "+sal, 20, 120);
		g.drawString("Pay the tax: "+tax, 20, 140);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}