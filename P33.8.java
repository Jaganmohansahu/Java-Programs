<<<<<<< HEAD
<<<<<<< HEAD
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MySingle
{
	int value();
}
class Myclass
{
	@MySingle(value = 100)
	public void myMethod()
	{
		System.out.println("Hello");
	}
}
public class Demo
{
	public static void main(String[] args) throws Exception
	{
		Myclass obj = new Myclass();

		Method m = obj.getClass().getMethod("myMethod");

		MySingle anno = m.getAnnotation(MySingle.class);

		System.out.println("Value = "+anno.value());
	}
=======
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MySingle
{
	int value();
}
class Myclass
{
	@MySingle(value = 100)
	public void myMethod()
	{
		System.out.println("Hello");
	}
}
public class Demo
{
	public static void main(String[] args) throws Exception
	{
		Myclass obj = new Myclass();

		Method m = obj.getClass().getMethod("myMethod");

		MySingle anno = m.getAnnotation(MySingle.class);

		System.out.println("Value = "+anno.value());
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MySingle
{
	int value();
}
class Myclass
{
	@MySingle(value = 100)
	public void myMethod()
	{
		System.out.println("Hello");
	}
}
public class Demo
{
	public static void main(String[] args) throws Exception
	{
		Myclass obj = new Myclass();

		Method m = obj.getClass().getMethod("myMethod");

		MySingle anno = m.getAnnotation(MySingle.class);

		System.out.println("Value = "+anno.value());
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}