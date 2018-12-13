package Queues;

import java.time.LocalDateTime;

public class Guest implements Comparable{
    private String name;
    private int level;
    private LocalDateTime time;
    
    public Guest(String nm, int lv){
        name = nm;
        level = lv;
        time = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Guest{" + "name=" + name + ", level=" + level + ", time=" + time + '}';
    }

    @Override
    public int compareTo(Object t) {
        Guest other = (Guest)t;
        if (level==other.level){
            return time.compareTo(other.time);
        }
        else
            return level-other.level;
    }
    
    
}
