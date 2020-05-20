<<<<<<< HEAD
<<<<<<< HEAD
import java.io.*;
class CharTest
{
	public static void main(String[] args) 	throws IOException
	{
			char ch;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while(true)
			{
				System.out.println("Enter a character: ");
				ch = (char)br.read();

				System.out.print("You entered: ");
				if(Character.isDigit(ch))
					System.out.println("a digit");
				else if(Character.isUpperCase(ch))
					System.out.println("an upper case letter");
				else if(Character.isLowerCase(ch))
					System.out.println("a lower case letter");
				else if(Character.isSpaceChar(ch))
					System.out.println("a spacebar character");
				else if(Character.isWhitespace(ch))
					{System.out.println("a whitespace character");
				return;
			}
				else System.out.println("Sorry I don't know that");
					br.skip(2);
	}
}
=======
import java.io.*;
class CharTest
{
	public static void main(String[] args) 	throws IOException
	{
			char ch;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while(true)
			{
				System.out.println("Enter a character: ");
				ch = (char)br.read();

				System.out.print("You entered: ");
				if(Character.isDigit(ch))
					System.out.println("a digit");
				else if(Character.isUpperCase(ch))
					System.out.println("an upper case letter");
				else if(Character.isLowerCase(ch))
					System.out.println("a lower case letter");
				else if(Character.isSpaceChar(ch))
					System.out.println("a spacebar character");
				else if(Character.isWhitespace(ch))
					{System.out.println("a whitespace character");
				return;
			}
				else System.out.println("Sorry I don't know that");
					br.skip(2);
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
import java.io.*;
class CharTest
{
	public static void main(String[] args) 	throws IOException
	{
			char ch;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while(true)
			{
				System.out.println("Enter a character: ");
				ch = (char)br.read();

				System.out.print("You entered: ");
				if(Character.isDigit(ch))
					System.out.println("a digit");
				else if(Character.isUpperCase(ch))
					System.out.println("an upper case letter");
				else if(Character.isLowerCase(ch))
					System.out.println("a lower case letter");
				else if(Character.isSpaceChar(ch))
					System.out.println("a spacebar character");
				else if(Character.isWhitespace(ch))
					{System.out.println("a whitespace character");
				return;
			}
				else System.out.println("Sorry I don't know that");
					br.skip(2);
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}