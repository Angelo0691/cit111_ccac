/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author aalbanese
 */
public class Guess2 {
    public static void main(String[] args) 
        throws java.io.IOException {
        
        char ch, answer = 'K';
        
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it?");
        
        ch = (char) System.in.read(); //get a char from keyboard
        
        if (ch == answer) System.out.println("*** RIGHT ***");
        else System.out.println("Sorry...you're wrong.");
        
    }
}
