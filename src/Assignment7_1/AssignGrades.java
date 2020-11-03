/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 23/10/2020
 *
 */

package Assignment7_1;

/*
* Write a program that reads student scores, get the best score, and then assigns grades based on the following scheme:
* Grade is A if a score is >= best - 5
* Grade is B if the score is >= best - 10
* Grade is C if a score is >= best - 15
* Grade is D if the score is >= best - 20
* Grade is F otherwise.
*
* The program prompts the user to enter the total number of students, and then prompts the user to enter all of the
* scores, and concludes by displaying the grades.
*/

import java.util.Scanner;

public class AssignGrades {

    public static void main(String[] args) {

        // prompts number of students

        System.out.println("Enter number of students: ");
        Scanner students = new Scanner(System.in);
        int numbersOfStudents = students.nextInt();

        //make array with prompts number of students
        double[] allStudents = new double[numbersOfStudents];
        System.out.println("There are " + allStudents.length + " empty elements in this array.");

        System.out.println("Enter the students scores (divided by a space or ','): ");

        // assign values to every object in the array
        for (int i = 0; i < numbersOfStudents; i++) {
            // prompts scores to the students
            double studentScores = students.nextDouble();

            // add value scores to the students in the array
            allStudents[i] = studentScores; // only int scores
            System.out.println("The scores of the students are: " + studentScores);

            // print grades based on the students scores.
            System.out.println(assignGrades(studentScores));
        }

        // get best score by sorting the array low numbers first
        // largest last and then select the last number in the array

        SelectionSort.selectionSort(allStudents); // sorts the array in ascending order
        int newIndexNumber = allStudents.length-1; // set the length of the array as the last index
        System.out.println("The largest score is: " + allStudents[newIndexNumber]); // print largest indexNumber == best score
    }

    // method to print grades based on the students scores.
    public static String assignGrades(double studentScores){
        String grades = "";
        if(studentScores <= 5){
            System.out.println("The grade is A");
        }else if(studentScores >= 10 && studentScores < 15){
            System.out.println("The grade is B");
        }else if(studentScores >= 15 && studentScores < 20){
            System.out.println("The grade is C");
        }else if(studentScores <= 20){
            System.out.println("The grade is D");
        }else{
            System.out.println("The grade is F");
        }
        return grades;
    }
}
