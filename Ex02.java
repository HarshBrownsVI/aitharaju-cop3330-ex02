/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;
public class Ex02 {

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String s = "";
        System.out.println("What is the input string?");
        s = kb.next();
        while( s.equals(" ")){
            System.out.println("What is the input string?");
            s = kb.next();
        }
        System.out.println(s + " has " + s.length() + " characters.") ;
    }

}

}