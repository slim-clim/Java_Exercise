import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Double> obj = new Vector<Double>();
        
        Double dobj1 = Double.valueOf(77.5);
        Double dobj2 = Double.valueOf(68.1);
        Double dobj3 = Double.valueOf(52.8);
        Double dobj4 = Double.valueOf(40.2);
        Double dobj5 = Double.valueOf(77.5);
        
        System.out.println("Size of Vector is: " + obj.size());
        
        obj.add(dobj1);
        obj.add(dobj2);
        obj.add(dobj3);
        obj.add(dobj4);
        obj.add(dobj1);
                
        System.out.println("\nVector after adding the objects: " + obj);
        System.out.println("Size of Vector after adding objects: " + obj.size());
        
        obj.remove(dobj1);
        obj.remove(dobj3);
        
        System.out.println("\nVector after removing the objects: " + obj);
        System.out.println("Size of Vector after removing objects: " + obj.size());
        
        System.out.println("\nThe final Vector: ");
        ListIterator<Double> i = obj.listIterator();  
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}