//getting formatted output into a string
class Ex2
{
	public static void main(String[] args) 
	{
		int i = 65;
		String s = "Hii";
		char ch = 'A';

		String str = String.format("i=%d%ns=%s%nch=%c", i, s, ch);
		System.out.println(str);
	}
}