/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author angal
 */
public class mathChecker {
    public static void main(String[] args) {
        
        //Strings for user interface
        String mathChecker = "***MATH CHECKER***";
        String question = "What is the hypotenuse of a right triangle if the "
                + "following values are given for legs A & B?";
        String legA = "3";
        String legB = "4";
        String tooHigh = "You're too High!";
        String tooLow = "You're too Low!";
        String winner1 = "GOOD JOB!  YOU ARE CORRECT!";
        String ans1 = "(3)^2 + (4)^2 = (5)^2 ";
        String ans2 = "9 + 16 = 25 ";
        String ans3 = "√25 = 5";
        String tryAgain = "Try Again!";
        //counter to limit the number of attempts the user has to get the correct answer
        int counter = 0;
        //double in case the user decides to enter a decimal
        double ans;
        // final to show that these variables are constants
        final int ATTEMPTS = 3;
        final int ANSWER = 5;
        
        // new Scanner object for user input
        Scanner userInput = new Scanner(System.in);
        System.out.println(mathChecker);
        System.out.println();
        //while loop to track the number of attempts to answer the question
        while (counter < ATTEMPTS) {
        //print out question to console   
        System.out.println(question);
        System.out.println("Leg A: " + legA);
        System.out.println("Leg B: " + legB);
        //assign userInput to the ans variable       
        ans = userInput.nextDouble();
        
        if (ans < ANSWER) {
            
            System.out.println(tooLow);
            System.out.println();
            counter++;
        } else if (ans > ANSWER) {
            
            System.out.println(tooHigh);
            System.out.println();
            counter++;
        } else {
            System.out.println(winner1);
            System.out.println();
            break;
            }
        }//close while
        System.out.println("The solution is: ");
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        
    }//close main
}//close class
