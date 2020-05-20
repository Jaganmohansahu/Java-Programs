<<<<<<< HEAD
<<<<<<< HEAD
//Catching which key is pressed  	//ERROR
import java.awt.*;
import java.awt.event.*;
class Keys extends Frame implements KeyListener
{
	TextArea ta;
	String msg="";

	Keys()
	{
		setLayout(new FlowLayout());
		ta = new TextArea(5, 25);

		Font f = new Font("Arial", Font.BOLD, 25);
		ta.setFont(f);
		ta.setBackground(Color.red);

		add(ta);

		ta.addKeyListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void keyPressed(KeyEvent ke)
	{
		int keycode = ke.getKeyCode();
		msg += "\nKey Code: "+keycode;

		String keyname = ke.getKeyText(keycode);
		msg += "\nKey Released: "+keyname;

		ta.setText(msg);
		msg = "";
	}
	public void keyTyped(KeyEvent ke)
	{

	}
	public void keyReleased(KeyEvent ke)
	{
		int keycode = ke.getKeyCode();
		msg += "\nKey Code: "+keycode;

		String keyname = ke.getKeyText(keycode);
		msg += "\nKey Released: "+keyname;

		ta.setText(msg);
		msg = "";
	}
	public static void main(String[] args) 
	{
		Keys ks = new Keys();

		ks.setTitle("Keyboard Tracker");	
		ks.setSize(400, 400);
		ks.setVisible(true);
	}
=======
//Catching which key is pressed  	//ERROR
import java.awt.*;
import java.awt.event.*;
class Keys extends Frame implements KeyListener
{
	TextArea ta;
	String msg="";

	Keys()
	{
		setLayout(new FlowLayout());
		ta = new TextArea(5, 25);

		Font f = new Font("Arial", Font.BOLD, 25);
		ta.setFont(f);
		ta.setBackground(Color.red);

		add(ta);

		ta.addKeyListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void keyPressed(KeyEvent ke)
	{
		int keycode = ke.getKeyCode();
		msg += "\nKey Code: "+keycode;

		String keyname = ke.getKeyText(keycode);
		msg += "\nKey Released: "+keyname;

		ta.setText(msg);
		msg = "";
	}
	public void keyTyped(KeyEvent ke)
	{

	}
	public void keyReleased(KeyEvent ke)
	{
		int keycode = ke.getKeyCode();
		msg += "\nKey Code: "+keycode;

		String keyname = ke.getKeyText(keycode);
		msg += "\nKey Released: "+keyname;

		ta.setText(msg);
		msg = "";
	}
	public static void main(String[] args) 
	{
		Keys ks = new Keys();

		ks.setTitle("Keyboard Tracker");	
		ks.setSize(400, 400);
		ks.setVisible(true);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Catching which key is pressed  	//ERROR
import java.awt.*;
import java.awt.event.*;
class Keys extends Frame implements KeyListener
{
	TextArea ta;
	String msg="";

	Keys()
	{
		setLayout(new FlowLayout());
		ta = new TextArea(5, 25);

		Font f = new Font("Arial", Font.BOLD, 25);
		ta.setFont(f);
		ta.setBackground(Color.red);

		add(ta);

		ta.addKeyListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void keyPressed(KeyEvent ke)
	{
		int keycode = ke.getKeyCode();
		msg += "\nKey Code: "+keycode;

		String keyname = ke.getKeyText(keycode);
		msg += "\nKey Released: "+keyname;

		ta.setText(msg);
		msg = "";
	}
	public void keyTyped(KeyEvent ke)
	{

	}
	public void keyReleased(KeyEvent ke)
	{
		int keycode = ke.getKeyCode();
		msg += "\nKey Code: "+keycode;

		String keyname = ke.getKeyText(keycode);
		msg += "\nKey Released: "+keyname;

		ta.setText(msg);
		msg = "";
	}
	public static void main(String[] args) 
	{
		Keys ks = new Keys();

		ks.setTitle("Keyboard Tracker");	
		ks.setSize(400, 400);
		ks.setVisible(true);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}