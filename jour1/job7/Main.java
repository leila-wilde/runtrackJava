public class Main {
    static public void main(String[] args) {
        // Initialize the sum variable
        int sum = 0;
        // Calculate the sum of the first 100 integers
        for (int i=1; i<=100; i++) {
            sum += i;
        }
        // Display the result
        System.out.println("La somme des 100 premiers entiers est " + sum);
    }
}