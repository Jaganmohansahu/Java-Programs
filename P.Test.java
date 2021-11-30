class parent
{
    void display()
  {System.Out.Println("PARENT");}
}
class Test
{
  public static void main(String[] args) 
  {
      test a  = new test();
      a.display();
      parent b = new parent();
      b.display();
  }
  void display()
  {System.Out.Println("CHILD");}
}