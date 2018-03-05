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
public class Inches {
    public static void main(String args[]) {
        long ci, im;
        
        im = 5280 * 12;
        
        ci = im * im * im;
        
        System.out.println(" There are " + ci + 
                " cubic inches in a cubic mile. ");
    }
}
