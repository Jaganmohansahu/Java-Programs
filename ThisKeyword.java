class Data
{
    private String data_string;
    Data(String s)
    {
        data_string = s;
    }
    public String getData()
    {
        return data_string;
    }
    public void printData()
    {
        printer p = new printer();
        p.print(this);
    }
}
class printer
{
    void print(Data d)
    {
        System.out.println(d.getData());
    }
}

public class Practice2
{
    public static void main(String[] args) 
    {
        (new Data("hello from java!")).printData();
    }
}