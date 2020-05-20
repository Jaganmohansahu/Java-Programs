<<<<<<< HEAD
<<<<<<< HEAD
//An applet where a button is displayed for the user to click
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonGame extends JApplet implements MouseMotionListener, MouseListener 
{
	JButton b;
	JLabel lbl;
	static int score = 0;

	public void init()
	{
		Container c = getContentPane(null);
		c.setLayout();

		ImageIcon ii = new ImageIcon("fig.gif");
		b = new JButton("Click me", ii);
		b.setFont(new Font("Helvetica", Font.BOLD, 30));
		b.setBounds(400, 300, 250, 75);
		c.add(b);

		lbl = new JLabel();
		lbl.setFont(new Font("Impact", Font.PLAIN, 30));
		lbl.setText("Score: "+score);
		lbl.setBounds(550, 20, 150, 50);
		c.add(lbl);

		b.addMouseMotionListener(this);
		b.addMouseListener(this);
	}

	public void mouseDragged(MouseEvent me)
	{
		int x = (int)(600*Math.random());
		int y = (int)(500*Math.random());
		b.setBounds(x, y, 250, 75);
	}

	public void mouseMoved(MouseEvent me)
	{
		int x = (int)(600*Math.random());
		int y = (int)(500*Math.random());
		b.setBounds(x, y, 250, 75);
	}

	public void mouseClicked(MouseEvent me)
	{
		ImageIcon ii = new ImageIcon("fig1.gif");
		b.setIcon(ii);
		lbl.setForeground(Color.red);

		score += 100;
		lbl.setText("Score: "+score);
	}

	public void mouseEntered(MouseEvent e)
	{
		int x = (int)(600*Math.random());
		int y = (int)(500*Math.random());
		b.setBounds(x, y, 250, 75);
	}

	public void mouseExited(MouseEvent me)
	{
		ImageIcon ii = new ImageIcon("fig.gif");
		b.setIcon(ii);
	}

	public void mousePressed(MouseEvent e){}

	public void mouseReleased(MouseEvent e){}
=======
//An applet where a button is displayed for the user to click
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonGame extends JApplet implements MouseMotionListener, MouseListener 
{
	JButton b;
	JLabel lbl;
	static int score = 0;

	public void init()
	{
		Container c = getContentPane(null);
		c.setLayout();

		ImageIcon ii = new ImageIcon("fig.gif");
		b = new JButton("Click me", ii);
		b.setFont(new Font("Helvetica", Font.BOLD, 30));
		b.setBounds(400, 300, 250, 75);
		c.add(b);

		lbl = new JLabel();
		lbl.setFont(new Font("Impact", Font.PLAIN, 30));
		lbl.setText("Score: "+score);
		lbl.setBounds(550, 20, 150, 50);
		c.add(lbl);

		b.addMouseMotionListener(this);
		b.addMouseListener(this);
	}

	public void mouseDragged(MouseEvent me)
	{
		int x = (int)(600*Math.random());
		int y = (int)(500*Math.random());
		b.setBounds(x, y, 250, 75);
	}

	public void mouseMoved(MouseEvent me)
	{
		int x = (int)(600*Math.random());
		int y = (int)(500*Math.random());
		b.setBounds(x, y, 250, 75);
	}

	public void mouseClicked(MouseEvent me)
	{
		ImageIcon ii = new ImageIcon("fig1.gif");
		b.setIcon(ii);
		lbl.setForeground(Color.red);

		score += 100;
		lbl.setText("Score: "+score);
	}

	public void mouseEntered(MouseEvent e)
	{
		int x = (int)(600*Math.random());
		int y = (int)(500*Math.random());
		b.setBounds(x, y, 250, 75);
	}

	public void mouseExited(MouseEvent me)
	{
		ImageIcon ii = new ImageIcon("fig.gif");
		b.setIcon(ii);
	}

	public void mousePressed(MouseEvent e){}

	public void mouseReleased(MouseEvent e){}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//An applet where a button is displayed for the user to click
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonGame extends JApplet implements MouseMotionListener, MouseListener 
{
	JButton b;
	JLabel lbl;
	static int score = 0;

	public void init()
	{
		Container c = getContentPane(null);
		c.setLayout();

		ImageIcon ii = new ImageIcon("fig.gif");
		b = new JButton("Click me", ii);
		b.setFont(new Font("Helvetica", Font.BOLD, 30));
		b.setBounds(400, 300, 250, 75);
		c.add(b);

		lbl = new JLabel();
		lbl.setFont(new Font("Impact", Font.PLAIN, 30));
		lbl.setText("Score: "+score);
		lbl.setBounds(550, 20, 150, 50);
		c.add(lbl);

		b.addMouseMotionListener(this);
		b.addMouseListener(this);
	}

	public void mouseDragged(MouseEvent me)
	{
		int x = (int)(600*Math.random());
		int y = (int)(500*Math.random());
		b.setBounds(x, y, 250, 75);
	}

	public void mouseMoved(MouseEvent me)
	{
		int x = (int)(600*Math.random());
		int y = (int)(500*Math.random());
		b.setBounds(x, y, 250, 75);
	}

	public void mouseClicked(MouseEvent me)
	{
		ImageIcon ii = new ImageIcon("fig1.gif");
		b.setIcon(ii);
		lbl.setForeground(Color.red);

		score += 100;
		lbl.setText("Score: "+score);
	}

	public void mouseEntered(MouseEvent e)
	{
		int x = (int)(600*Math.random());
		int y = (int)(500*Math.random());
		b.setBounds(x, y, 250, 75);
	}

	public void mouseExited(MouseEvent me)
	{
		ImageIcon ii = new ImageIcon("fig.gif");
		b.setIcon(ii);
	}

	public void mousePressed(MouseEvent e){}

	public void mouseReleased(MouseEvent e){}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}