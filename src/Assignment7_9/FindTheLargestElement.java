/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 23/10/2020
 *
 */

package Assignment7_9;

/*
* Write a method that finds the largest element in an array of double values using the following header:
* public static double max(double[] array)
* Write a test program that prompts the user to enter ten numbers, invokes this method to return the maximum value,
* and displays the maximum value.
* */

public class FindTheLargestElement {

    public static double max(double[] arrayName) {
        double max = arrayName[0];
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] > max) {
                max = arrayName[i];
            }
        }
        return max;
    }
}
