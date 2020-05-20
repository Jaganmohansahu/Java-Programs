//Program takes angle in degrees, minutes and seconds.
//It calculates equivalent angle in radians and prints 
/** In order to convert minutes and seconds into degrees, 
	we will divide minutes with 60.0 and seconds with 3600.0 respectively 
	before adding to degree to get total angle in degrees.
	Then it will be converted to radians*/

import javax.swing.JOptionPane;
class DegreetoRadians
{
	public static void main(String[] args) 
	{
		double r;
		int d = Integer.parseInt(JOptionPane.showInputDialog("Enter Degrees Component in the Angle"));

		int m = Integer.parseInt(JOptionPane.showInputDialog("Enter Minutes Component in the Angle(0-60)"));

		int s = Integer.parseInt(JOptionPane.showInputDialog("Enter Seconds Component in the Angle(0-60"));

		r = (d + m/60.0 + s/3600.0) * 3.14/180.0;

		JOptionPane.showMessageDialog(null, "Equivalent Angle in Radians = " + r);

		//Angle is printed in radians
		//Now to explain further about integer mode calculations, 
		//we have removed decimals for 60 and 3600 as shown below
		r = (d + m/60 + s/3600) * 3.14/180.0;

		JOptionPane.showMessageDialog(null, "Equivalent Angle in Radians (Assuming calculations are done in Integer mode) = " + r);
		System.exit(0);
	}
}