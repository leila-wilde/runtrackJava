import java.util.Scanner; // Import Scanner class from java.util package

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); //Create a Scanner object
        System.out.println("Enter username");

        String userName = userInput.nextLine();
        System.out.println("Username is: " + userName);
    }
}