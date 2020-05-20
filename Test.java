public class Test
{
    int x=10;
    boolean y;

    public static void main(String[] args)
    {
        Test obj1 = new Test();
        Test obj2 = new Test();

        System.out.println(obj1.x);
        System.out.println(obj2.x);

        obj2.x=90;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
 }
