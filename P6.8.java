//To display a colour name depending on colour value
class Demo
{
	public static void main(String[] args) 
	{
		char color = 'g';

		switch(color)
		{
			case 'r' : System.out.println("RED");
			case 'g' : System.out.println("GREEN");
			case 'b' : System.out.println("BLUE");
			case 'w' : System.out.println("WHITE");
			default : System.out.println("No Color");
		}	
	}
}