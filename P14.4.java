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
		b.addActionListener(new MyClass());
	}
	public static void main(String[] args) {
		// create a frame by creating But class object
		But obj = new But();
		obj.setSize(400, 300);
		obj.setVisible(true);
	}
}
// MyClass should implement the methods of ActionListener
class MyClass implements ActionListener
{
	// this method is executed when button is clicked
	public void actionPerformed(ActionEvent ae)
	{
		System.exit(0);
	}
}