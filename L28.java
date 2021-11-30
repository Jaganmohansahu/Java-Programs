class Test
{
	public static void main(String[] args) throws Exception
	{
		java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);

		java.io.BufferedReader br = new java.io.BufferedReader(isr);

		System.out.print("Enter name: ");
		String name = br.readLine();
		System.out.println("Name: "+name);

		System.out.print("Enter the Roll: ");
		int number = Integer.parseInt(br.readLine());
		System.out.println("Roll: "+number);
	}
}