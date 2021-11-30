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
}