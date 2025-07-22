public class GenericMethodDemo 
 {
    public <M> M display(M val)
    {
        return val;        
    }
    
    public static void main(String[] args)
    {
        GenericMethodDemo obj = new    
 GenericMethodDemo();
         System.out.println("The generic method is called with String value: " + obj.display("Test"));
        System.out.println("The generic method is called with Double value: " + obj.display(7.5));
        System.out.println("The generic method is called with Boolean value: " + obj.display(true));
        System.out.println("The generic method is called with Integer value: " + obj.display(10));
   
    }
}

