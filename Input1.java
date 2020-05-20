<<<<<<< HEAD
<<<<<<< HEAD
class Interactive
{
	public static void main(String[] args) 
	{
		byte[] name = new byte[100];
		int nbytes=0;
		try
		{
			System.out.println("Enter your name: ");
			nbytes = System.in.read(name);
		}	catch(Exception E)
		{
			E.printStackTrace();
		}
		System.out.print("Hello" + "\t");
		System.out.write(name, 0, nbytes);
		System.out.println();
	}
}
//Enter ctrl+Z when it asks for name Ans: ERROR
//Enter ctrl+Z after entering some name Ans: No Error but in place of ctrl+z it will show a special character
//Enter more than 100 characters Ans: Displays Hello followed by first 100 characters
=======
class Interactive
{
	public static void main(String[] args) 
	{
		byte[] name = new byte[100];
		int nbytes=0;
		try
		{
			System.out.println("Enter your name: ");
			nbytes = System.in.read(name);
		}	catch(Exception E)
		{
			E.printStackTrace();
		}
		System.out.print("Hello" + "\t");
		System.out.write(name, 0, nbytes);
		System.out.println();
	}
}
//Enter ctrl+Z when it asks for name Ans: ERROR
//Enter ctrl+Z after entering some name Ans: No Error but in place of ctrl+z it will show a special character
//Enter more than 100 characters Ans: Displays Hello followed by first 100 characters
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
class Interactive
{
	public static void main(String[] args) 
	{
		byte[] name = new byte[100];
		int nbytes=0;
		try
		{
			System.out.println("Enter your name: ");
			nbytes = System.in.read(name);
		}	catch(Exception E)
		{
			E.printStackTrace();
		}
		System.out.print("Hello" + "\t");
		System.out.write(name, 0, nbytes);
		System.out.println();
	}
}
//Enter ctrl+Z when it asks for name Ans: ERROR
//Enter ctrl+Z after entering some name Ans: No Error but in place of ctrl+z it will show a special character
//Enter more than 100 characters Ans: Displays Hello followed by first 100 characters
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
//Enter some string along the command line Ans: Nothing happens yet it asks to enter the name