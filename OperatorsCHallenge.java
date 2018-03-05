/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author aalbanese
 */
public class OperatorsCHallenge {
    public static void main(String args[]) {
        int a = 100, b = 2000;
        double d = 10.5;
        String line1 = "Go Ask Alice";
        String line2 = "I think she'll know";
        
        int r = b / a;
        System.out.println("b / a: " + r);
        
        int mod = b % a;
        System.out.println("b % a is: " + mod);
        
        double rd = mod*d;
        System.out.println("Variable rd is: " + rd);
        
        a = a + 5;
        System.out.println("Oh boy, I'm getting  ready to compute " + b +
                            " mod " + a);
        
        rd = b % a;
        System.out.println("Module operator divides and gives remainder: " + rd);
        
        System.out.println(line2 + " " + line1);
        System.out.println(line1 + " " + line2);
        
        
    }
}
