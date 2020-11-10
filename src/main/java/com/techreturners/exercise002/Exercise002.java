package com.techreturners.exercise002;
import java.util.Calendar;
import java.lang.*;

public class Exercise002 {

    // The clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
    // Your task is to make the 'past' function return time past midnight converted to milliseconds.

    public int past(int h, int m, int s) {
        // Your code here!
        long timeinmilli=0;
        long midnightimeinmilli=0;

        Calendar c1 = Calendar.getInstance();
        Calendar midnite = Calendar.getInstance();
    
        midnite.add(Calendar.DAY_OF_MONTH, 1);
        midnite.set(Calendar.HOUR_OF_DAY, 0);
        midnite.set(Calendar.MINUTE, 0);
        midnite.set(Calendar.SECOND, 0);
        midnite.set(Calendar.MILLISECOND, 0);
        midnightimeinmilli=midnite.getTimeInMillis();
       
        c1.add(Calendar.DAY_OF_MONTH, 1);
        c1.set(Calendar.MINUTE, m);
        c1.set(Calendar.HOUR, h);
        c1.set(Calendar.SECOND, s);
        timeinmilli=c1.getTimeInMillis();   
        
        if(timeinmilli > midnightimeinmilli)
            return timeinmilli;
        else 
         return 0;
    }

    public static void main(String args[]) 
    { 
        System.out.println("midnite" + past(2,30,0)); 
    }
}
