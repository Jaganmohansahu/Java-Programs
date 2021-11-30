//Mouse Events
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MouseEvents extends JFrame implements MouseListener, MouseMotionListener
{
	String str = "";
	JTextArea ta;
	Container c;
	int x, y;

	MouseEvents()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());

		ta = new JTextArea("Click the mouse or move it", 5, 20);
		ta.setFont(new Font("Arial", Font.BOLD, 30));

		c.add(ta);

		ta.addMouseListener(this);
		ta.addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		int i = me.getButton();
		if(i == 1)
		str += "Clicked Button: Left";
		else if(i == 2)
			str += "Clicked Button: Middle";
		else if(i == 3)
			str += "Clicked Button: Right";

		this.display();
	}
	public void mouseEntered(MouseEvent me)
	{
		str += "Mouse Entered";
		this.display();
	}
	public void mouseExited(MouseEvent me)
	{
		str += "Mouse Exited";
		this.display();
	}
	public void mousePressed(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		str += "Mouse Pressed at: " +x +"\t" +y;
		this.display(); 
	}
	public void mouseReleased(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		str += "Mouse Released at: " +x +"\t" +y;
		this.display();
	}
	public void mouseDragged(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		str += "Mouse Dragged at: " +x +"\t" +y;
		this.display();
	}
	public void mouseMoved(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		str += "Mouse moved at: " +x +"\t" +y;
		this.display();
	}
	public void display()
	{
		ta.setText(str);
		str = "";
	}
	public static void main(String[] args) 
	{
		MouseEvents mes = new MouseEvents();

		mes.setSize(400, 400);
		mes.setTitle("Location of Mouse");
		mes.setVisible(true);
		mes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}