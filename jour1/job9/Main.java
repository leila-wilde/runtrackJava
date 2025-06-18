/*
A Java program that asks the user to enter their age 
and displays that they are a minor if their age is less 
than 18 and that they are of age if it is more than 18.
 */

 import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        // Loop until valid input is received
        while(!validInput) {
            try {
                // Ask user for their age
                System.out.println("Entrez votre âge : ");
                
                // Read user input
                int age = scanner.nextInt();
                
                // check for a postive integer
                if(age < 0) {
                    System.out.println("Veuillez âge un âge valide :");
                } else {
                    // Check if the user is a minor or an adult 
                    if (age < 18) {
                        System.out.println("Vous êtes mineur.");
                    } else {
                        System.out.println("Vous êtes majeur.");
                    }
                    validInput = true;
                }
            } catch (Exception e) {
                System.out.println("Veuillez âge un âge valide : ");
                scanner.next(); // clears the invalid input
            }  
        } 

        // Close scanner
        scanner.close();
    }
 }