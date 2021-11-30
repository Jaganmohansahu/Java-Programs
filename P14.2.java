//Relating the objects of 3 class
class One
{
	Two obj2;

	One(Two obj2)
	{
		this.obj2 = obj2;
	}
	double cube(double x)
	{
		double result = x*obj2.square(x);
		return result;
	}
}

class Two
{
	Three obj3;
	Two(Three obj3)
	{
		this.obj3 = obj3;
	}
	double square(double x)
	{
		double result = x*obj3.get(x);
		return result;
	}
}

class Three
{
	double get(double x)
	{
		return x;
	}
}

class Relate
{
	public static void main(String[] args) 
	{
		Three obj3 = new Three();
		Two obj2 = new Two(obj3);
		One obj1 = new One(obj2);
		double result1 = obj1.cube(5);
		System.out.println("Cube of 5 = "+result1);
		double result2 = obj2.square(6);
		System.out.println("Square of 6 = "+result2);	
	}
}