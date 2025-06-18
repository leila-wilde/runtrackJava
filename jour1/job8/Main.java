/*
A Java program that asks the user to enter an integer n 
and displays the sum of the first n cubes.
*/


import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        // Create a scanner object 
        Scanner scanner = new Scanner(System.in);

        // Ask the user to provide an integer n
        System.out.println("Saissisez un nombre entier : ");

        // Read user input
        int n = scanner.nextInt();

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