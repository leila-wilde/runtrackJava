import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        // Ask the user for a number
        System.out.println("Enter a whole number:");
        // Read the user input
        int userNumber = scanner.nextInt();
        // print the square of the number 
        System.out.println(userNumber + " squared is " + (userNumber * userNumber));
        // Close the Scanner object
        scanner.close();
    }
}