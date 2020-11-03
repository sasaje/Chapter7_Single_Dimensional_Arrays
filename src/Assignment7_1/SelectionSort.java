/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 23/10/2020
 *
 */

package Assignment7_1;

public class SelectionSort {

// sorts the objects in the array in ascending order
    public static void selectionSort(double[] allStudents){
        for (int i = 0; i < allStudents.length - 1; i++) {
            double currentMin = allStudents[i];
            int currentMinIndex = i;

            for (int j = i; j < allStudents.length; j++) {
                if(currentMin > allStudents[j]){
                    currentMin = allStudents[j];
                    currentMinIndex = j;
                }
            }

            //swap array[i] with list[currentMinIndex] if necessary
            if(currentMinIndex != i){
                allStudents[currentMinIndex] = allStudents[i];
                allStudents[i] = (int) currentMin;
            }
        }
    }
}
