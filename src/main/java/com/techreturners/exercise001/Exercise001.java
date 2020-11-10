package com.techreturners.exercise001;
import java.lang.*;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!
    static final int INT_SIZE = 32; 
    public int singles(int [] arr){
        

        int n = arr.length; 
        int result [] = new int[n + 1]; 
        int x, sum; 
        // Iterate through every bit 
        for (int i = 0; i < INT_SIZE; i++) { 
            // Find sum of set bits at ith position in all 
            // array elements 
            sum = 0; 
            x = (1 << i); 
            for (int j = 0; j < n; j++) { 
                if ((arr[j] & x) == 0) 
                    sum++; 
            } 
            // The bits with sum not multiple of 3, are the 
            // bits of element with single occurrence. 455e3w2
            if ((sum % 3) != 0) 
                result[i]=x; 
        } 

        int sumofsingles = result.stream(arr).sum();

        return sumofsingles;
    }

    public static void main(String args[]) 
    { 
        int arr[] = { 12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7 }; 
        
        System.out.println("sum is" + singles(arr)); 
    }
}
