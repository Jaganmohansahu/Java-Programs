class parent
{
    void display()
  {
    System.out.println("PARENT");
  }
}
class test extends parent
{
  void display()
  {
    System.out.println("CHILD");
  }

  public static void main(String[] args) 
  {
    test a  = new test();
    a.display();
    parent b = new parent();
    b.display();
  }
}