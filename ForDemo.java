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
public class ForDemo {
    public static void main(String args[]) {
        int count;
        
        for(count = 0; count < 5; count = count + 1) //sets the count at 0; sets the upper limit of 5; defines the iteration increment
            System.out.println("This is count: " + count);
        System.out.println("Done!");
    }
}
