<<<<<<< HEAD
<<<<<<< HEAD
//A generic class - to store any type of object
class MyClass<T>
{
	T obj;

	MyClass(T obj)
	{
		this.obj = obj;
	}

	T getobj()
	{
		return obj;
	}
}
class gen1
{
	public static void main(String[] args) 
	{
		Integer i = 12;

		MyClass<Integer> obj = new MyClass<>(i);
		System.out.println("You stored: "+obj.getobj());	

		Float f = 12.123f;
		MyClass<FLOAT> obj1 = new MyClass<>(f);
		System.out.println("You stored: "+obj1.getobj());

		Myclass<String> obj2 = new MyClass<>("Jagan");
		System.out.println("You stored: "+obj2.getobj());
	}
=======
//A generic class - to store any type of object
class MyClass<T>
{
	T obj;

	MyClass(T obj)
	{
		this.obj = obj;
	}

	T getobj()
	{
		return obj;
	}
}
class gen1
{
	public static void main(String[] args) 
	{
		Integer i = 12;

		MyClass<Integer> obj = new MyClass<>(i);
		System.out.println("You stored: "+obj.getobj());	

		Float f = 12.123f;
		MyClass<FLOAT> obj1 = new MyClass<>(f);
		System.out.println("You stored: "+obj1.getobj());

		Myclass<String> obj2 = new MyClass<>("Jagan");
		System.out.println("You stored: "+obj2.getobj());
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//A generic class - to store any type of object
class MyClass<T>
{
	T obj;

	MyClass(T obj)
	{
		this.obj = obj;
	}

	T getobj()
	{
		return obj;
	}
}
class gen1
{
	public static void main(String[] args) 
	{
		Integer i = 12;

		MyClass<Integer> obj = new MyClass<>(i);
		System.out.println("You stored: "+obj.getobj());	

		Float f = 12.123f;
		MyClass<FLOAT> obj1 = new MyClass<>(f);
		System.out.println("You stored: "+obj1.getobj());

		Myclass<String> obj2 = new MyClass<>("Jagan");
		System.out.println("You stored: "+obj2.getobj());
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}