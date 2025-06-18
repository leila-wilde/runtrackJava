/*
A Java program for french speaking users that takes an integer n and then 
displays all the even numbers that are less than or equal to n.
 */

 import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a valid integer
        boolean validInput = false;
        int n = 0;

        while (!validInput) {
            try {
                // Prompt the user to enter an integer
                System.out.print("Entrez un nombre entier : ");

                // Read the user's input
                n = scanner.nextInt();

                // Check if the input is a positive integer
                if(n < 0) {
                    System.out.println("Veuillez entrer un nombre entier positif.");
                } else {
                    validInput = true;
                }
            } catch (Exception e) {
                System.out.println("Veuillez entrer un nombre entier valide.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Close the scanner to free up resources
        scanner.close();
        
        // Display the even numbers less than or equal to n
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
 }