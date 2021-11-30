class ObjectFactory
{
    public CreatedClass 
        getNewObject()
    {
        return new CreatedClass();
    }
}

class CreatedClass
{
    public String tag = "This is the tag data";
}

public class Practice2
{
    public static void main(String[] args)
    {
        ObjectFactory o = new ObjectFactory();
        CreatedClass c = o.getNewObject();
        System.out.println(c.tag);
    }
}