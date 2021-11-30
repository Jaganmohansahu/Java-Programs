//Types of reference
class Test
{
	static int x = 10;
	static Test t1;

	int y = 20;
	Test t2;

	public static void main(String[] args) 
	{
		int z = 30;
		Test t3;

		System.out.println(t1);		//null

		t1 = new Test();
		System.out.println(t1);		//Hashcode
		t1.y = 100;
		System.out.println(t1.y+"\t"+t1.t2);	//100 null

		t1.t2 = new Test();
		System.out.println(t1.t2);
		t1.t2.y = 200;
		t1.t2.t2 = new Test();
	}
}