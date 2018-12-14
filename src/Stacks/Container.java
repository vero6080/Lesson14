package Stacks;

public class Container {
    private int id;
    private String name;
    private static int nextid = 1001;
    
    public Container(){
        id = nextid++;
        name = "Unassigned";
    }

    public void book(String name) {
        this.name = name;
    }
    
    public void unbook() {
        this.name = "Unassigned";
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Borrower: " + name;
    }
    
}
