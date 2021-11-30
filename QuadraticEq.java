import javax.swing.JOptionPane;
import java.util.*;
class Quad
{
	public static void main(String[] args) 
	{
		double a = Double.parseDouble(JOptionPane.showInputDialog("Enter Coefficient of x^2 term: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Enter Coefficient of x term: "));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Enter Coeeficient of Constant term: "));

		double dis = b*b - 4*a *c;

		if(dis<0)
		{
			JOptionPane.showMessageDialog(null, "Roots are Imaginary", "Error", JOptionPane.ERROR_MESSAGE);
		}	
		else if (dis==0)
		{
			JOptionPane.showMessageDialog(null, "Root is = " + (-b/(2*a)), "Results", JOptionPane.PLAIN_MESSAGE);
		}

		else
		{
			dis = Math.sqrt(dis);
			double r1 = (-b+dis)/(2*a);
			double r2 = (-b-dis)/(2*a);

			JOptionPane.showMessageDialog(null, "Roots are = " + r1 + "\n" + r2, "Results", JOptionPane.PLAIN_MESSAGE);
		}
	}
}