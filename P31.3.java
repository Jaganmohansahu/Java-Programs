//A generic interface
interface Fruit<T>
{
	void tellTaste(T fruit);
}
class AnyFruit<T> implements Fruit<T>
{
	public void tellTaste(T fruit)
	{
		String fruitname = fruit.getClass().getName();

		if(fruitname.equals("Banana"))
			System.out.println("Banana is sweet");
		else if(fruitname.equals("Orange"))
			System.out.println("Orange is sour");
	}
}
class Banana
{

}
class Orange
{

}
class Gen3
{
	public static void main(String[] args) 
	{
		Banana b = new Banana();
		AnyFruit<Banana> fruit1 = new AnyFruit<>();
		fruit1.tellTaste(b);

		Orange o = new Orange();
		AnyFruit<Orange> fruit2 = new AnyFruit<>();
		fruit2.tellTaste(o);	
	}
}