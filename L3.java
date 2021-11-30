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
		If it is static then we can directly call by class name. */ 