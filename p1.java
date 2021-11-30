class Demo1
{
    int x=10;
    boolean y;

    public static void main(String[] args)
    {
        Demo1 obj1 = new Demo1();
        Demo1 obj2 = new Demo1();

        System.out.println(obj1.x);
        System.out.println(obj2.x);

        obj2.x=90;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}