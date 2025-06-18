/*
A Java program that asks the user to enter an integer n 
and displays the sum of the first n cubes.
*/

import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        // Create a scanner object 
        Scanner scanner = new Scanner(System.in);
        int n =0;
        boolean validInput = false;
        
        // Loop until valid integer is given
        while (!validInput) {
            try {
                // Ask the user to provide an integer n
                System.out.println("Saissisez un nombre entier : ");

                // Read user input
                n = scanner.nextInt();

                // Check if the input n is a positive integer
                if (n < 1) {
                    System.out.println("Veuillez saisir un nombre entier positif.");
                } else {
                    validInput = true;
                }
            } catch (Exception e) {
                System.out.println("Veuillez saisir un nombre entier valide.");
                scanner.nextLine(); // Clear the invalid input
            }   
        } 

        // Calculate the sum of the cubes of the first n integers
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (i * i * i);
        }

        // Print the result
        System.out.println("La somme des cubes des " + n + " premiers entiers est : " + sum);

        // Close the scanner
        scanner.close();
    }
}