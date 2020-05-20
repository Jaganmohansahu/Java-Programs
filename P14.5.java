<<<<<<< HEAD
<<<<<<< HEAD
// Creating a push button and proviing action to it
import java.awt.*; // for buton
import java.awt.event.*; // for actionListener
class But extends Frame
{
	But()
	{
		// create a push button b
		Button b = new Button("OK");
		// add push button to frame
		add(b);
		// add listener to button
		b.addActionListener(new ActionListener()
	{
		// this method is executed when button is clicked
		public void actionPerformed(ActionEvent ae)
		{
			System.exit(0);
		}
	});
}
public static void main(String[] args) {
		// create a frame by creating But class object
		But obj = new But();
		obj.setSize(400, 300);
		obj.setVisible(true);
	}
}
=======
// Creating a push button and proviing action to it
import java.awt.*; // for buton
import java.awt.event.*; // for actionListener
class But extends Frame
{
	But()
	{
		// create a push button b
		Button b = new Button("OK");
		// add push button to frame
		add(b);
		// add listener to button
		b.addActionListener(new ActionListener()
	{
		// this method is executed when button is clicked
		public void actionPerformed(ActionEvent ae)
		{
			System.exit(0);
		}
	});
}
public static void main(String[] args) {
		// create a frame by creating But class object
		But obj = new But();
		obj.setSize(400, 300);
		obj.setVisible(true);
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
// Creating a push button and proviing action to it
import java.awt.*; // for buton
import java.awt.event.*; // for actionListener
class But extends Frame
{
	But()
	{
		// create a push button b
		Button b = new Button("OK");
		// add push button to frame
		add(b);
		// add listener to button
		b.addActionListener(new ActionListener()
	{
		// this method is executed when button is clicked
		public void actionPerformed(ActionEvent ae)
		{
			System.exit(0);
		}
	});
}
public static void main(String[] args) {
		// create a frame by creating But class object
		But obj = new But();
		obj.setSize(400, 300);
		obj.setVisible(true);
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
