/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *Read a character from the keyboard
 * @author aalbanese
 */
public class KbIn {
    public static void main(String[] args) 
        throws java.io.IOException {
        
        char ch;
        
        System.out.println("Press a key followed by ENTER: ");
        
        ch = (char) System.in.read(); //get a char from keyboard
        
        System.out.println("Your key is: " + ch);
        
    }
    
}
