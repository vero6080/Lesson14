package Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class RadioShow {

    public static void main(String[] args) {
        Queue <Caller> phoneLine = new ArrayDeque<>();
        
        System.out.println("3 people all in to start the show");
        phoneLine.add(new Caller("Jerry"));
        phoneLine.add(new Caller("Numan"));
        phoneLine.add(new Caller("Elaine"));
        
        System.out.println("Taking the first caller - say hello to " + phoneLine.remove());
        System.out.println("Two more people call the show");
        phoneLine.add(new Caller("Kramer"));
        phoneLine.add(new Caller("George"));
        
        System.out.println("There are now " + phoneLine.size() + " callers waiting");
        
        System.out.println("The next caller will be " + phoneLine.peek());
        System.out.println("Taking the next caller - say hello to " + phoneLine.remove());
        
        System.out.println("We are almost out of time, lets quickly say hello to the rest of the callers");
        while(!phoneLine.isEmpty())
            System.out.println("Thanks for calling: " + phoneLine.remove());
    }
    
}
