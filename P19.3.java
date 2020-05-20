<<<<<<< HEAD
<<<<<<< HEAD
interface Father
{
	float HT = 6.2f;
	void height();
}
interface Mother
{
	float HT = 5.8f;
	void height();
}
class Child implements Father, Mother
{
	public void height()
	{
		float f = Father.HT-1.0f;
		float ht = (Father.HT+Mother.HT)/2;
		System.out.println("Child's height= "+ht);
	}
}
class Multi
{
	public static void main(String[] args) 
	{
		Child ch = new Child();
		System.out.println("This should be false "+ch.f);
		ch.height();	
	}
=======
interface Father
{
	float HT = 6.2f;
	void height();
}
interface Mother
{
	float HT = 5.8f;
	void height();
}
class Child implements Father, Mother
{
	public void height()
	{
		float f = Father.HT-1.0f;
		float ht = (Father.HT+Mother.HT)/2;
		System.out.println("Child's height= "+ht);
	}
}
class Multi
{
	public static void main(String[] args) 
	{
		Child ch = new Child();
		System.out.println("This should be false "+ch.f);
		ch.height();	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
interface Father
{
	float HT = 6.2f;
	void height();
}
interface Mother
{
	float HT = 5.8f;
	void height();
}
class Child implements Father, Mother
{
	public void height()
	{
		float f = Father.HT-1.0f;
		float ht = (Father.HT+Mother.HT)/2;
		System.out.println("Child's height= "+ht);
	}
}
class Multi
{
	public static void main(String[] args) 
	{
		Child ch = new Child();
		System.out.println("This should be false "+ch.f);
		ch.height();	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}