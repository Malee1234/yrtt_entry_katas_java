package com.techreturners.exercise004;
import javax.swing.*;
import java.String.*;
import java.util.*;

public class Exercise004 {

     // Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
    // Leave punctuation marks untouched.

     public String pigLatin(String str) {
        char firstLetter = str.charAt(0); //get the first letter
        str = str.substring(1); //remove the first letter from the input string
        str = str + firstLetter + "ay"; //add first letter and "ay" to end of input string
        return str;
    }
}
