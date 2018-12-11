package Queues;

public class Caller {
    private String name;
    private int id;
    private static int nextid = 1;
    
    public Caller(String n){
        name = n;
        id = nextid++;
    }

    @Override
    public String toString() {
        return "Caller{" + "name=" + name + ", id=" + id + '}';
    }
    
    
}
