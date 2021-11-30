//Use of Math library methods and constants 

class MathEx
{
	public static void main(String[] args) 
	{
		System.out.println("PI Constant value = " + Math.PI);
		System.out.println("e Constant value = " + Math.E);

		System.out.println("Maximum and Minimum of 10 and 20 = " + Math.max(10,20) + "\t" + Math.min(10,20));
		System.out.println("Maximum and Minimum of 10 and 20 = " + Math.max(1.8,20.89) + "\t" + Math.min(1.8,20.89));

		System.out.println("Ceiling of 1.8792 = " + Math.ceil(1.8792));
		System.out.println("Floor value of 1.8972 = " + Math.floor(1.8792));

		System.out.println("Rounded value of 1.879289892 = " + Math.round(1.879289892));

		System.out.println("Cosine of 1.879289892 = " + Math.cos(1.879289892));
		System.out.println("Sine of 1.879289892 = " + Math.sin(1.879289892));
		System.out.println("Tan of 1.879289892 = " + Math.tan(1.879289892));
	}
}