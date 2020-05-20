<<<<<<< HEAD
<<<<<<< HEAD
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyMulti
{
	int value1();
	String value2();
	String value3();
}
@MyMulti(value1=10, value2="Srinu", value3="Ameerpet, Hyderabad")
class Myclass
{
	void myMethod()
	{
		System.out.println("Hello");
	}
}
class Demo1
{
	public static void main(String args[])	throws Exception
	{
		Class obj = Class.forName("Myclass");
		Annotation[] annot = obj.getAnnotations();

		for(Annotation x: annot)
		{
			if(x instanceof MyMulti)
			{
				MyMulti a = (MyMulti)x;

				System.out.println("Value1 = "+a.value1());
				System.out.println("Value2 = "+a.value2());
				System.out.println("Value3 = "+a.value3());
			}
		}
	}
=======
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyMulti
{
	int value1();
	String value2();
	String value3();
}
@MyMulti(value1=10, value2="Srinu", value3="Ameerpet, Hyderabad")
class Myclass
{
	void myMethod()
	{
		System.out.println("Hello");
	}
}
class Demo1
{
	public static void main(String args[])	throws Exception
	{
		Class obj = Class.forName("Myclass");
		Annotation[] annot = obj.getAnnotations();

		for(Annotation x: annot)
		{
			if(x instanceof MyMulti)
			{
				MyMulti a = (MyMulti)x;

				System.out.println("Value1 = "+a.value1());
				System.out.println("Value2 = "+a.value2());
				System.out.println("Value3 = "+a.value3());
			}
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyMulti
{
	int value1();
	String value2();
	String value3();
}
@MyMulti(value1=10, value2="Srinu", value3="Ameerpet, Hyderabad")
class Myclass
{
	void myMethod()
	{
		System.out.println("Hello");
	}
}
class Demo1
{
	public static void main(String args[])	throws Exception
	{
		Class obj = Class.forName("Myclass");
		Annotation[] annot = obj.getAnnotations();

		for(Annotation x: annot)
		{
			if(x instanceof MyMulti)
			{
				MyMulti a = (MyMulti)x;

				System.out.println("Value1 = "+a.value1());
				System.out.println("Value2 = "+a.value2());
				System.out.println("Value3 = "+a.value3());
			}
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}