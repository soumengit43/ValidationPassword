package org.auth;


import java.sql.SQLOutput;
import java.util.Scanner;

public class ValidationPasswordMain {
    public static void main(String[] args) {

        System.out.println("Enter a valid password: ");

        // Create a Scanner object to read input from console
        Scanner inputScanner = new Scanner(System.in);
        String inputPassword = inputScanner.nextLine();
        try{
            // Call validation service 
            validationService.validatePassword(inputPassword);
            System.out.println("You have enter a valid password");
        } catch (InvalidPassException e) {
            System.out.println("Password validation failed : "+ e.getMessage());
        }
        // Close the scanner to release system resource
        inputScanner.close();

    }
}