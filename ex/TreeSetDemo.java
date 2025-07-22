import java.util.Iterator;  // Correct import for Iterator
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> obj = new TreeSet<Integer>();
                
        Integer iobj1 = Integer.valueOf(114);
        Integer iobj2 = Integer.valueOf(111);
        Integer iobj3 = Integer.valueOf(113);
        Integer iobj4 = Integer.valueOf(112);
        
        System.out.println("Size of TreeSet is: " + obj.size());
        
        obj.add(iobj2);
        obj.add(iobj1);
        obj.add(iobj4);
        obj.add(iobj3);
        obj.add(iobj2);  
                
        System.out.println("\nTreeSet after adding the objects: " + obj);
        System.out.println("Size of TreeSet after adding objects: " + obj.size());
        
        obj.remove(iobj3);
        obj.remove(iobj1);
                
        System.out.println("\nTreeSet after removing the objects: " + obj);
        System.out.println("Size of TreeSet after removing objects: " + obj.size());
        
        System.out.println("\nThe final TreeSet: ");
        Iterator<Integer> i = obj.iterator();  
        while(i.hasNext()) {
            System.out.println(i.next());
        }
   }
}