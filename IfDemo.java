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
public class IfDemo {
    public static void main(String args[]){
        int a, b, c;
        
        a = 2;
        b = 3;
        
        if(a < b) System.out.println("a is less than b");
        if(a == b) System.out.println("You won't see this");
        
        System.out.println();
        
        c = a - b;
        
        System.out.println("c contains -1");
        if(c >= 0) System.out.println("c is non-negative");
        if(c < 0)  System.out.println("c is negative");
        
        System.out.println();
        
        c = b - a;
        
        System.out.println("c contains 1");
        if(c >= 0) System.out.println("c is non-negative");
        if(c < 0)  System.out.println("c is negative");
    }
}
