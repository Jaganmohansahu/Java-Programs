//Vector
import java.util.Vector;
class Example
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add(0,11);
		v.add(1,22);
		v.addElement(44);
		System.out.println(v);
		v.remove(0);
		v.removeElement(33);
		System.out.println(v);	
	}
}