//create an enumeration with day names
enum Days
{
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}
class DisplayEnum
{
	public static void main(String[] args) 
	{
		Days alldays[] = Days.values();
		for(Days d: alldays)
		System.out.println(d);	
	}
}