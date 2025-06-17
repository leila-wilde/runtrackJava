import java.util.Scanner; // Import Scanner class from java.util package

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter something
        System.out.println("Enter something: ");

        // Read the user's input
        String userInput = scanner.nextLine();

        // Display the user's input
        System.out.println("You entered: " + userInput);

        // Close the scanner
        scanner.close();
    }
}