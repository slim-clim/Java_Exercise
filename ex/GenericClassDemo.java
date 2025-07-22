public class GenericClassDemo <T> 
{
    private T t;
    public void setValue(T t) 
    {
        this.t = t;
    }
	public T getValue() 
    {
        return t;
    }
public static void main(String[] args) 
    {
        GenericClassDemo<Integer> iobj = new GenericClassDemo<Integer>();
        iobj.setValue(10);
        System.out.println(iobj.getValue());        GenericClassDemo<String> sobj = new GenericClassDemo<String>();
        sobj.setValue("Ten");
        System.out.println(sobj.getValue());
    }
}