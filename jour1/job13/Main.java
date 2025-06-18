/*
A Java program that asks the user to enter an integer n less than
or equal to 9 and displays the multiplication table for this number.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Get a valid integer from the user
        boolean validInput = false;
        int n = 0;

        while (!validInput) {
            try {
                // Prompt user for a integer
                System.out.println("Entrez un nombre entier inférieur ou égal à 9 : ");
                
                // Read user input
                n = scanner.nextInt();

                if (n < 1 || n > 9) {
                    System.out.println("Veuillez saisir un nombre entre 1 et 9.");
                } else {
                    validInput = true;
                }
            } catch (Exception e) {
                System.out.println("Veuillez saisir un nombre entier valide.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Close the scanner to free up resources
        scanner.close();

        // Display the multiplication table
        System.out.println("Table de multiplication de " + n + " :");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + (i * n));
        }
    }
}