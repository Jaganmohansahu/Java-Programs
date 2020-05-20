<<<<<<< HEAD
<<<<<<< HEAD
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*<applet code = "Cal" width = 300 height = 300>
</applet>*/


public class Calculator extends JFrame implements ActionListener
{
	Button one, two, three, four, five, six, seven, eight, nine, zero, dot, sqrt;
	String msg = "";
	int v1, v2, result;
	TextField t1;
	Button add, sub, mul, div, clear, mod, EQ;
	char OP;

	Calculator()
	{
		
		t1 = new TextField(10);
		Color k = new Color(120, 89, 90);
		setBackground(k);
		setLayout(null);

		add = new Button("add");
		sub = new Button("sub");
		mul = new Button("mul");
		div = new Button("div");
		mod = new Button("mod");
		clear = new Button("clear");
		EQ = new Button("EQ");

		t1.addActionListener(this);

		add(t1);
		one = new Button("1");
		two = new Button("2");
		three = new Button("3");
		four = new Button("4");
		five = new Button("5");
		six = new Button("6");
		seven = new Button("7");
		eight = new Button("8");
		nine = new Button("9");
		zero = new Button("0");
		dot = new Button(".");
		sqrt = new Button("sqrt");

		one.setBounds(50, 65, 50, 30);
		two.setBounds(105, 65, 50, 30);
		three.setBounds(160, 65, 50, 30);
		four.setBounds(215, 65, 50, 30);

		five.setBounds(50, 100, 50, 30);
		six.setBounds(105, 100, 50, 30);
		seven.setBounds(160, 100, 50, 30);
		eight.setBounds(215, 100, 50, 30);

		nine.setBounds(50, 135, 50, 30);
		zero.setBounds(105, 135, 50, 30);

		t1.setBounds(50, 30, 220, 25);
		add.setBounds(160, 135, 50, 30);
		sub.setBounds(215, 135, 50, 30);
		mul.setBounds(50, 170, 50, 30);
		div.setBounds(105, 170, 50, 30);
		mod.setBounds(160, 170, 50, 30);
		clear.setBounds(215, 170, 50, 65);
		EQ.setBounds(50, 205, 50, 30);
		dot.setBounds(105, 205, 50, 30);
		sqrt.setBounds(160, 205, 50, 30);

		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(zero);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clear);
		add(EQ);
		add(dot);
		add(sqrt);

		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		dot.addActionListener(this);
		sqrt.addActionListener(this);

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();

		char ch = str.charAt(0);
		if(Character.isDigit(ch))
			t1.setText(t1.getText()+str);
		else
			if(str.equals("add"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '+';
				t1.setText("");
			}
			else if(str.equals("sub"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '-';
				t1.setText("");
			}
			else if(str.equals("mul"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '*';
				t1.setText("");
			}
			else if(str.equals("div"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '/';
				t1.setText("");
			}
			else if(str.equals("mod"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '%';
				t1.setText("");
			}

			if(str.equals("EQ"))
			{
				v2 = Integer.parseInt(t1.getText());
				if(OP == '+')
					result = v1+v2;
				else if(OP == '-')
					result = v1-v2;
				else if(OP == '*')
					result = v1*v2;
				else if(OP == '/')
					result = v1/v2;
				else if(OP == '%')
					result = v1%v2;
				t1.setText(""+result);
			}

			if(str.equals("clear"))
			{
				t1.setText("");
			}
	}
	public static void main(String[] args) 
	{
		Calculator obj = new Calculator();

		obj.setTitle("Calculator");
		obj.setVisible(true);
		obj.setSize(700, 700);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
=======
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*<applet code = "Cal" width = 300 height = 300>
</applet>*/


public class Calculator extends JFrame implements ActionListener
{
	Button one, two, three, four, five, six, seven, eight, nine, zero, dot, sqrt;
	String msg = "";
	int v1, v2, result;
	TextField t1;
	Button add, sub, mul, div, clear, mod, EQ;
	char OP;

	Calculator()
	{
		
		t1 = new TextField(10);
		Color k = new Color(120, 89, 90);
		setBackground(k);
		setLayout(null);

		add = new Button("add");
		sub = new Button("sub");
		mul = new Button("mul");
		div = new Button("div");
		mod = new Button("mod");
		clear = new Button("clear");
		EQ = new Button("EQ");

		t1.addActionListener(this);

		add(t1);
		one = new Button("1");
		two = new Button("2");
		three = new Button("3");
		four = new Button("4");
		five = new Button("5");
		six = new Button("6");
		seven = new Button("7");
		eight = new Button("8");
		nine = new Button("9");
		zero = new Button("0");
		dot = new Button(".");
		sqrt = new Button("sqrt");

		one.setBounds(50, 65, 50, 30);
		two.setBounds(105, 65, 50, 30);
		three.setBounds(160, 65, 50, 30);
		four.setBounds(215, 65, 50, 30);

		five.setBounds(50, 100, 50, 30);
		six.setBounds(105, 100, 50, 30);
		seven.setBounds(160, 100, 50, 30);
		eight.setBounds(215, 100, 50, 30);

		nine.setBounds(50, 135, 50, 30);
		zero.setBounds(105, 135, 50, 30);

		t1.setBounds(50, 30, 220, 25);
		add.setBounds(160, 135, 50, 30);
		sub.setBounds(215, 135, 50, 30);
		mul.setBounds(50, 170, 50, 30);
		div.setBounds(105, 170, 50, 30);
		mod.setBounds(160, 170, 50, 30);
		clear.setBounds(215, 170, 50, 65);
		EQ.setBounds(50, 205, 50, 30);
		dot.setBounds(105, 205, 50, 30);
		sqrt.setBounds(160, 205, 50, 30);

		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(zero);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clear);
		add(EQ);
		add(dot);
		add(sqrt);

		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		dot.addActionListener(this);
		sqrt.addActionListener(this);

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();

		char ch = str.charAt(0);
		if(Character.isDigit(ch))
			t1.setText(t1.getText()+str);
		else
			if(str.equals("add"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '+';
				t1.setText("");
			}
			else if(str.equals("sub"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '-';
				t1.setText("");
			}
			else if(str.equals("mul"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '*';
				t1.setText("");
			}
			else if(str.equals("div"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '/';
				t1.setText("");
			}
			else if(str.equals("mod"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '%';
				t1.setText("");
			}

			if(str.equals("EQ"))
			{
				v2 = Integer.parseInt(t1.getText());
				if(OP == '+')
					result = v1+v2;
				else if(OP == '-')
					result = v1-v2;
				else if(OP == '*')
					result = v1*v2;
				else if(OP == '/')
					result = v1/v2;
				else if(OP == '%')
					result = v1%v2;
				t1.setText(""+result);
			}

			if(str.equals("clear"))
			{
				t1.setText("");
			}
	}
	public static void main(String[] args) 
	{
		Calculator obj = new Calculator();

		obj.setTitle("Calculator");
		obj.setVisible(true);
		obj.setSize(700, 700);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*<applet code = "Cal" width = 300 height = 300>
</applet>*/


public class Calculator extends JFrame implements ActionListener
{
	Button one, two, three, four, five, six, seven, eight, nine, zero, dot, sqrt;
	String msg = "";
	int v1, v2, result;
	TextField t1;
	Button add, sub, mul, div, clear, mod, EQ;
	char OP;

	Calculator()
	{
		
		t1 = new TextField(10);
		Color k = new Color(120, 89, 90);
		setBackground(k);
		setLayout(null);

		add = new Button("add");
		sub = new Button("sub");
		mul = new Button("mul");
		div = new Button("div");
		mod = new Button("mod");
		clear = new Button("clear");
		EQ = new Button("EQ");

		t1.addActionListener(this);

		add(t1);
		one = new Button("1");
		two = new Button("2");
		three = new Button("3");
		four = new Button("4");
		five = new Button("5");
		six = new Button("6");
		seven = new Button("7");
		eight = new Button("8");
		nine = new Button("9");
		zero = new Button("0");
		dot = new Button(".");
		sqrt = new Button("sqrt");

		one.setBounds(50, 65, 50, 30);
		two.setBounds(105, 65, 50, 30);
		three.setBounds(160, 65, 50, 30);
		four.setBounds(215, 65, 50, 30);

		five.setBounds(50, 100, 50, 30);
		six.setBounds(105, 100, 50, 30);
		seven.setBounds(160, 100, 50, 30);
		eight.setBounds(215, 100, 50, 30);

		nine.setBounds(50, 135, 50, 30);
		zero.setBounds(105, 135, 50, 30);

		t1.setBounds(50, 30, 220, 25);
		add.setBounds(160, 135, 50, 30);
		sub.setBounds(215, 135, 50, 30);
		mul.setBounds(50, 170, 50, 30);
		div.setBounds(105, 170, 50, 30);
		mod.setBounds(160, 170, 50, 30);
		clear.setBounds(215, 170, 50, 65);
		EQ.setBounds(50, 205, 50, 30);
		dot.setBounds(105, 205, 50, 30);
		sqrt.setBounds(160, 205, 50, 30);

		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(zero);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clear);
		add(EQ);
		add(dot);
		add(sqrt);

		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		dot.addActionListener(this);
		sqrt.addActionListener(this);

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();

		char ch = str.charAt(0);
		if(Character.isDigit(ch))
			t1.setText(t1.getText()+str);
		else
			if(str.equals("add"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '+';
				t1.setText("");
			}
			else if(str.equals("sub"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '-';
				t1.setText("");
			}
			else if(str.equals("mul"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '*';
				t1.setText("");
			}
			else if(str.equals("div"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '/';
				t1.setText("");
			}
			else if(str.equals("mod"))
			{
				v1 = Integer.parseInt(t1.getText());
				OP = '%';
				t1.setText("");
			}

			if(str.equals("EQ"))
			{
				v2 = Integer.parseInt(t1.getText());
				if(OP == '+')
					result = v1+v2;
				else if(OP == '-')
					result = v1-v2;
				else if(OP == '*')
					result = v1*v2;
				else if(OP == '/')
					result = v1/v2;
				else if(OP == '%')
					result = v1%v2;
				t1.setText(""+result);
			}

			if(str.equals("clear"))
			{
				t1.setText("");
			}
	}
	public static void main(String[] args) 
	{
		Calculator obj = new Calculator();

		obj.setTitle("Calculator");
		obj.setVisible(true);
		obj.setSize(700, 700);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}