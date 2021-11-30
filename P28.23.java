//To catch some of the keys of the KEYBOARD
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class KeyBoardEvents extends JFrame implements KeyListener
{
	Container c;
	JTextArea ta;
	String str = "";

	KeyBoardEvents()
	{
		c = getContentPane();

		ta = new JTextArea("Press a key");
		ta.setFont(new Font("Arial", Font.BOLD, 30));

		c.add(ta);

		ta.addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		int keycode = ke.getKeyCode();

		if(keycode == KeyEvent.VK_F1)	str = "F1 Key";
		if(keycode == KeyEvent.VK_F2)	str = "F2 Key";
		if(keycode == KeyEvent.VK_F3)	str = "F3 Key";
		if(keycode == KeyEvent.VK_PAGE_UP)	str = "Page Up";
		if(keycode == KeyEvent.VK_PAGE_DOWN)	str = "Page Down";
		if(keycode == KeyEvent.VK_ALT)	str = "Alter";
		if(keycode == KeyEvent.VK_HOME)	str = "Home";
		if(keycode == KeyEvent.VK_END)	str = "End";

		ta.setText(str);
		str ="";
	}

	public void keyReleased(KeyEvent ke)
	{}

	public void keyTyped(KeyEvent ke)
	{}

	public static void main(String[] args) 
	{
		KeyBoardEvents kb = new KeyBoardEvents();

		kb.setSize(400, 400);
		kb.setTitle("Catch Keys");
		kb.setVisible(true);
		kb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}