package Queues;

import java.time.LocalDateTime;

public class Patient implements Comparable{
    private String name;
    private int level;
    private String status;
    private LocalDateTime time;
    
    public Patient(String nm, int lv){
        name = nm;
        level = lv;
        time = LocalDateTime.now();
        
        if (level==1)
            status = "Critical";
        else if (level==2)
            status = "Serious";
        else
            status = "Fair";
    }
    
    @Override
    public String toString() {
        return name + "\t" + status + "\tWaiting...";
    }
    
    @Override
    public int compareTo(Object t) {
        Patient other = (Patient)t;
        if (level==other.level){
            return time.compareTo(other.time);
        }
        else
            return level-other.level;
    }

    public String getName() {
        return name;
    }
    
}
