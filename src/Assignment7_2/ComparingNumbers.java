/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 23/10/2020
 *
 */

package Assignment7_2;

/*
* Write a program that reads 11 integers, compares each integer with the 11th integer,
* and displays whether the integers are "greater" or "smaller" or "equal" to the 11th integer.
* */

public class ComparingNumbers {

    public static void main(String[] args) {
        int[] myArray = new int[11]; // creates an array of 11 elements

        // sets random integers into the array
        for (int i = 0; i < myArray.length; i++) {
            // makes a new object of the type int[] for every index of the array
            int rndNumber = (int)((Math.random()*10)+1); // creates random integers
            myArray[i]= rndNumber; //assign a random integer to every object in the array
            System.out.println("Object with the index[" + i + "] created. Assigned value is: " + rndNumber);
        }

        System.out.println("");
        System.out.println("************ Compare with the 11th element *************");
        System.out.println("");

        // compare the last element to every other element
        // determine if the 11th integer is smaller or greater than the current number
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] == myArray[10]){
                System.out.println("The object with the index[" + i + "] has rndNumber: " + myArray[i] + " which is the same as the 11th object: " + myArray[10]);
            }else if (myArray[i]>myArray[10]){
                System.out.println("The object with the index[" + i + "] has rndNumber: " + myArray[i] + " which is greater than the 11th object: " + myArray[10]);
            }else{
                System.out.println("The object with the index[" + i + "] has rndNumber: " + myArray[i] + " which is smaller than the 11th object: " + myArray[10]);
            }
        }
    }
}