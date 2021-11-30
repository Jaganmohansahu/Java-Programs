import java.util.Date;
class Example
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1);


		System.out.println(sb1.append("WELCOME"));
		System.out.println(sb1);

		System.out.println(new Date());
		for(int i=0; i<20000; i++)
			sb1.append(" "+i);
		System.out.println(new Date);
		System.out.println("....................");

		String s1 = "hello";
		System.out.println(new Date());
		for(int i=0; i<200000; i++)
			s1 = s1.concat(" "+i);
		System.out.println(new Date());
	}
}