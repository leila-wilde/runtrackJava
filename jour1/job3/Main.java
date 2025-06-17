public class Main {
    public static void main(String[] args) {

        // Create an array of 10 integers
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print [0], [1], [5], [9] and [10] of the array
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[5]);
        System.out.println(myArray[9]);
        System.out.println(myArray[10]); // Will throw an ArrayIndexOutOfBoundsException
    }
}
