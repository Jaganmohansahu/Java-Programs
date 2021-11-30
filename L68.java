//Methods of String
class Example
{
	public static void main(String[] args) 
	{
		String s1 = new String("Hello");
		System.out.println(s1);

		System.out.println(s1.charAt(0));
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.contains("H"));
		System.out.println(s1.replace("H","K"));
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.indexOf("I"));
		System.out.println(s1.lastIndexOf("I"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());

		char arr[] = s1.toCharArray();
		byte brr[] = s1.getBytes();

		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+"\t"+brr[i]);
		}
		String s2 = new String("Java is Simple");
		String s[] = s2.split(" ");
		int c= 0;
		for(String x:s)
		{
			if(!x:sEmpty())
			{
				System.out.println(x);
				c++;
			}
		}
		System.out.println(c);
	}
}