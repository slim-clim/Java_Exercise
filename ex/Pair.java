class Pair<X, Y> 
{

    private X first;
    private Y second;

    public Pair(X a1, Y a2) 
    {
        first = a1;
        second = a2;
    }

    public X getFirst() 
    {
        return first;
    }

    public Y getSecond() {
        return second;
    }
    
    public static void main(String[] args)
    {
        Pair<String, Integer> obj1 = new Pair<String, Integer>("Test", 1);
        System.out.println("String is " + obj1.getFirst());
        System.out.println("Integer is " + obj1.getSecond());
        
        Pair<Integer, String> obj2 = new Pair<Integer, String>(2, "Demo");
        System.out.println("Integer is " + obj2.getFirst());
        System.out.println("String is " + obj2.getSecond());
        
    }
}
