<<<<<<< HEAD
<<<<<<< HEAD
class Test
{
	void displayMessage(String msg)
	{
		System.out.println(msg);
	}
}

class Demo
{
	static Test obj = new Test();
}

class Myclass
{
	public static void main(String[] args) 
	{
		Demo obj1 = new Demo();
		obj1.obj.displayMessage("JAVA ");
		//(or)Demo.obj.displayMessage("SIMPLE");	//if static
	}
}
/* Note:- We have to create object in myclass because we cannot call the member of demo by class name
			because it is non-static.
=======
class Test
{
	void displayMessage(String msg)
	{
		System.out.println(msg);
	}
}

class Demo
{
	static Test obj = new Test();
}

class Myclass
{
	public static void main(String[] args) 
	{
		Demo obj1 = new Demo();
		obj1.obj.displayMessage("JAVA ");
		//(or)Demo.obj.displayMessage("SIMPLE");	//if static
	}
}
/* Note:- We have to create object in myclass because we cannot call the member of demo by class name
			because it is non-static.
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
class Test
{
	void displayMessage(String msg)
	{
		System.out.println(msg);
	}
}

class Demo
{
	static Test obj = new Test();
}

class Myclass
{
	public static void main(String[] args) 
	{
		Demo obj1 = new Demo();
		obj1.obj.displayMessage("JAVA ");
		//(or)Demo.obj.displayMessage("SIMPLE");	//if static
	}
}
/* Note:- We have to create object in myclass because we cannot call the member of demo by class name
			because it is non-static.
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
		If it is static then we can directly call by class name. */ 