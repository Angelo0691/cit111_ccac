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
public class Example2 {
    public static void main(String args[]){
        int var1; //Declares var1 as an integer type variable
        int var2; //Declares var2 as an integer type variable
        
        var1 = 1024; //Assigns the number 1024 to var1
        
        System.out.println("var1 contains: " + var1); //Prints var1 contains: followed by the value stored in var1 which is currently 1024 
        
        var2 = var1 / 2; //var2 is being assigned the current value of var1 which is then divided by 2
        
        System.out.print("var2 contains var1 / 2: "); //Prints var2 contains var1 / 2: but does not start a new line
        System.out.println(var2); //Prints the current value of var2 immediately following the end of the previous line since the method print was used instead of println
        
    }
}
