public class Main {
    static public void main(String[] args) {

        // Declare and initialize variables
        char letter = 'B';
        String name = "Octavia";
        int age = 49;
        long distance = 1234567890123456789L;
        float price = 12.50f;
        boolean bool = true;

        // Display the values of the variables
        System.out.println("Letter: " + letter);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Distance: " + distance);
        System.out.println("Price: " + price);
        System.out.println("Boolean: " + bool);

        // Declare and initialize variable TOTO
        int TOTO = (int) 3.817; // Convert because an int cannot store a decimal value
        
        // Display the value of the variable TOTO
        System.out.println("TOTO: " + TOTO); // Will display 3 instead of 3.817
    }
}