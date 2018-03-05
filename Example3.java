/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookExamples;

/**
 *
 * @author aalbanese
 */
public class Example3 {
    public static void main(String args[]){
        int var;  // Declares var as an integer type variable
        double x; // Declares x as a floating point double type variable
        
        var = 10; //Assigns the value of 10 to var
        x = 10.0; //Assigns the more specific value of 10.0 to x
        
        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println(); //Inserts a blank line
        
        var = var / 4;
        x = x / 4;
        
        System.out.println("var after division: " + var);
        System.out.println("x after division: " + x);
    }   
}
