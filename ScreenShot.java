<<<<<<< HEAD
<<<<<<< HEAD
//Java program to take Screenshots
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;

class Snap
{
	public static void main(String[] args) throws Exception
	{
		Robot awt_robot = new Robot();
		BufferedImage Entire_Screen = awt_robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(Entire_Screen, "PNG", new File("Entire_Screen.png"));
	}
}
=======
//Java program to take Screenshots
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;

class Snap
{
	public static void main(String[] args) throws Exception
	{
		Robot awt_robot = new Robot();
		BufferedImage Entire_Screen = awt_robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(Entire_Screen, "PNG", new File("Entire_Screen.png"));
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Java program to take Screenshots
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;

class Snap
{
	public static void main(String[] args) throws Exception
	{
		Robot awt_robot = new Robot();
		BufferedImage Entire_Screen = awt_robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(Entire_Screen, "PNG", new File("Entire_Screen.png"));
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
