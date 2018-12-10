package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class TireSales {

    public static void main(String[] args) {
        Stack <Tire> pole = new Stack();
        //more recent Java version includes Deque = double-ended queue
        Deque <Tire> pole2 = new ArrayDeque();
        System.out.println("Adding 10 Goodyear tires to pole");
        for (int i = 0; i < 10; i++) {
            pole2.push(new Tire("Goodyear"));
        }
        
        System.out.println("Selling 2 tires");
        System.out.println("Sold tire: " + pole2.pop());
        System.out.println("Sold tire: " + pole2.pop());
        
        System.out.println("Adding another 2 tires: Cooper");
        pole2.push(new Tire("Cooper"));
        pole2.push(new Tire("Cooper"));
        
        System.out.println("Selling 4 more tires");
        for (int i = 0; i < 4; i++) {
            System.out.println("Sold tire: " + pole2.pop());
        }
        
        System.out.println("There are still " + pole2.size() + " tires left");
        System.out.println("The next tire to sell is: " + pole2.peek());
        
        System.out.println("Selling rest of tires on the pole");
        while (pole2.isEmpty()==false) {            
            System.out.println("Sold tire: " + pole2.pop());
        }
        System.out.println("There are now " + pole2.size() + " tires left");
    }
}
