import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a new scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask user for three whole numbers 
        System.out.println("Saisissez deux nombres entiers : ");

        // Read user input three times
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Print the maximum number
        System.out.println("Le plus grand nombre est " + Math.max(num1, num2));

        // close scanner 
        scanner.close();
    }
}