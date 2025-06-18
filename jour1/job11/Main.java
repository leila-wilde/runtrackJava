/*
A Java program for French speaking users to calculate 
the factorial of an integer n entered by the user.
(n! = 1*2*3*4*5*6*7...*n)
 */

import java.util.Scanner;
import java.math.BigInteger; // Import the BigInteger class for large factorials

public class Main {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.println("Entrez un nombre entier pour trouver sa factorielle");

        // Declare a variable to verify the input is valid
        boolean validInput = false;
        
        // Declare a variable to store the number
        int n = 0;

        // Create a while loop to handle error and get a valid input
        while(!validInput) {
            try {
                // Get the user's input
                n = scanner.nextInt();
                if(n < 0) {
                    System.out.println("Le nombre doit être positif");
                } else {
                    validInput = true;
                } 
             } catch (Exception e) {
                System.out.println("Veuillez saisir un nombre entier valide.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        // Close the scanner
        scanner.close();

        // Declare a variable to store the factorial
        BigInteger factorial = BigInteger.ONE;

        // Calculate the factorial
        for(int i = 1 ; i <= n; i++) {
            // Multiply the current number by the previous factorial
            factorial = factorial.multiply(BigInteger.valueOf(i)); 
        }

        // Print the factorial 
        System.out.println("Le factorielle de " + n + " est " + factorial);
    }
}
