/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *Demonstrates the functionality of a Scanner object and how to use it to gather input from user
 * @author aalbanese
 */
public class UsernameAndPassword {
    public static void main (String[] args) {
        final String CORRECT_USERNAME = "javaghost";
        final String CORRECT_PASSWORD = "ic0d3";
        String username, password;
        
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println("Enter your username followed by ENTER: ");
        username = userInputScanner.next();
        
        System.out.println("Enter your password followed by ENTER: ");
        password = userInputScanner.next();
        
        if (CORRECT_USERNAME.equals(username) && CORRECT_PASSWORD.equals(password)){
            System.out.println("Authentication Successful!");
        }else {
            System.out.println("Authentication Failed!");
        }
    }
}
