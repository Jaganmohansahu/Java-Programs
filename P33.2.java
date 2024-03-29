//create a color enumeration with color name as constants
enum Color
{
	RED, GREEN, BLUE, WHITE, BLACK;
}
class ColorTest
{
	Color c;

	ColorTest(Color c)
	{
		this.c = c;
	}

	void display()
	{
		switch(c)
		{
			case RED: System.out.println("Red color");	break;
			case GREEN: System.out.println("Green color");	break;
			case BLUE: System.out.println("White color");	break;
			default: System.out.println("Not a good color");
		}
	}
	public static void main(String[] args) 
	{
		ColorTest ct = new ColorTest(Color.GREEN);
		ct.display();	
	}
}