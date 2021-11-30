// creating our own factory method
import java.io.*;

// an interface with an abstract method
interface Fees {
	double showFees();
}

// implementation class to implement showFees()
class CSE implements Fees {
	public double showFees() {
		return 60000;
	}
}

// another implementation class
class ECE implements Fees {
	public double showFees() {
		return 55000.50;
	}
}

// factory class with a factory method getFees()
class CourseFees {
	public static Fees getFees(String course) {
		if(course.equalsIgnoreCase("CSE"))
			return new CSE();
		else if(course.equalsIgnoreCase("ECE"))
			return new ECE();
		else return null;
	}
}

// using factory method to display any course fees depending on user option
class MyClass
{
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter course name: ");
			String name = br.readLine();
			Fees f = CourseFees.getFees(name);
			System.out.println("The fees is Rs. " + f.showFees());
	}
}