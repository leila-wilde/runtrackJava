import java.util.Scanner; // Import Scanner class from java.util package

public class Main {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Saisissez votre prénom : ");

        // Read a line of input
        String firstName = scanner.nextLine();

        // Print greeting and input
        System.out.println("Bonjour " + firstName);

        // Close the scanner
        scanner.close();
    }
}