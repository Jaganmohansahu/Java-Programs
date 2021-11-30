class Test
{
	public static void main(String[] args) throws Exception
	{
		java.io.DataInputStream dis = new java.io.DataInputStream(System.in);

		System.out.println("Enter the character(Y/N)");
		char ch = (char) dis.read();
		if(ch=='Y' || ch=='y')
			System.out.println("True");
		else
			System.out.println("False");
	}
}