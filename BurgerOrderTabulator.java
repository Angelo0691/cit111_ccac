/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;
import java.util.Random;
/**
 *
 * @author angal
 */
public class BurgerOrderTabulator {
    //initialize membver variables that are accessible to all methods within 
    //BurgerOrderTabulator class
    private static int numBurgersOrdered = 0;
    private static int numHotdogsOrdered = 0;
    private static int burgerScrewUps = 0;
    private static int hotdogScrewUps = 0;
    
    public static void main(String[] args) {
        //call each method several times with predefined order amounts and then
        //print the order stats after each order
        
        burgerTabulator(15);
        printOrderStats();
        
        hotdogTabulator(8);
        printOrderStats();
    
        burgerTabulator(25);
        printOrderStats();
        
        hotdogTabulator(11);
        printOrderStats();
        
        burgerTabulator(3);
        printOrderStats();
        
    }//close main method
    
    private static void burgerTabulator(int burger) {
        System.out.println("Makin da burghers...");
        numBurgersOrdered = numBurgersOrdered + burger;
        //introduce a random int with an upper bound of the number of burgers passed 
        //to the method to represent incorrectly made burgers
        Random rand = new Random();
        int badBurgers = rand.nextInt(burger);
        burgerScrewUps = burgerScrewUps + badBurgers;
        
        
    }//close burgerTabulator method
    
    private static void hotdogTabulator(int hotdog) {
        System.out.println("Makin da hotdogs...");
        numHotdogsOrdered = numHotdogsOrdered + hotdog;
        //introduce a random int with an upper bound of the number of burgers passed 
        //to the method to represent incorrectly made burgers
        Random rand = new Random();
        int badHotdogs = rand.nextInt(hotdog);
        hotdogScrewUps = hotdogScrewUps + badHotdogs;
        
        
    }//close hotdogTabulator method
    
    private static void printOrderStats() {
       System.out.println("*******ORDER TOTALS*******");
       System.out.println("Total Burgers: " + numBurgersOrdered);
       System.out.println("Total Hotdogs: " + numHotdogsOrdered);
       System.out.println("Total Screwed Up Burger Orders: " + burgerScrewUps);
       System.out.println("Total Screwed Up Hotdog Orders: " + hotdogScrewUps);
       System.out.println("*************************\n");
    }//close printOrderStats method
    
    
}//close class
