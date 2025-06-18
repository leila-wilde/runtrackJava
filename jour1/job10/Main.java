/*
A Java program that calculates the factorial of 8.
 */

public class Main {
    public static void main(String[] args) {
        int factorial = 1;
        
        for(int i = 1; i <= 8; i++) {
            // Calculate the factorial by multiplying the current number by the previous factorial
            factorial *= i;
        }
        
        System.out.println("Le factorielle de 8 est " + factorial);
    }
}