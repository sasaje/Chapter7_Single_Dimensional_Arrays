package Assignment7_9;
import java.util.Scanner;

class FindTheLargestElementTest {

/* Write a test program that prompts the user to enter ten numbers, invokes this method to return the maximum value,
 * and displays the maximum value.
 */

    public static void main(String[] args) {

        //ten numbers integers from user
        System.out.println("Please enter ten numbers (doubles): ");
        Scanner doubles = new Scanner(System.in);

        // new array with index[10] empty spaces in the array
        double [] tenNumberArray = new double[10];

        // prompts ten doubles from user
        double numbers = 0;

        for (int i = 0; i < tenNumberArray.length ; i++) {

            numbers = doubles.nextDouble();

            // initialize the tenNumbers as values for the array elements
            tenNumberArray[i] = numbers;

            System.out.print("Index[" + i + "]");
            System.out.println(" with the value: " + numbers);
        }

        System.out.println("");

         // prints the largest element of the array.
        System.out.println("The largest element in the array is: " + FindTheLargestElement.max(tenNumberArray));
    }
}