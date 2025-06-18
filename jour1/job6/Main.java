import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number; 

        // Ask user for five whole numbers
        System.out.println("Entrez cinq nombres entiers : ");
        
        // Read the five numbers
        for (int i=0; i<5; i++) {
            while(true) {
                System.out.print("Entrez le nombre " + (i+1) + " : ");
                try {
                    number = scanner.nextInt();
                    sum += number;
                    break; // exit loop if input is valid
                } catch (Exception e) {
                    System.out.println("Veuillez entrer un nombre entier valide.");
                    scanner.nextLine(); // clear the input buffer
                }
            } 
        }
            
        
        // Calculate the average
        double average = (double) sum / 5;

        // Print the average
        System.out.println("Le moyenne est " + average);

        scanner.close();
    }
}