package week7_Midweek;

import java.util.Arrays;
import java.util.Scanner;

public class Task7_Midweek {
    /*
        7. Take input of age of 3 people by user and determine oldest and youngest among them.
 */

    static void youngOld() {
        Scanner input1 = new Scanner(System.in); //create scanner object
        System.out.print("Enter Age of Person 1: "); //print statement
        int age1 = input1.nextInt(); //read user input

        Scanner input2 = new Scanner(System.in); //create scanner object
        System.out.print("Enter Age of Person 2: "); //print statement
        int age2 = input2.nextInt(); //read user input

        Scanner input3 = new Scanner(System.in); //create scanner object
        System.out.print("Enter Age of Person 3: "); //print statement
        int age3 = input3.nextInt(); //read user input

        System.out.print("\n"); //skips a line

        int[] ageArray = {age1,age2,age3}; //create array from user input
        int[] newAge = Arrays.stream(ageArray).sorted().toArray(); //create new array and sort out in ascending order
        int yAge = newAge[0]; //declare new variable for youngest age
        int oAge = newAge[2]; //declare new variable for oldest age
        System.out.println("YOUNGEST AGE: " + yAge); //print youngest age
        System.out.println("OLDEST AGE: " + oAge); //print oldest age
    }

    //Main method
    public static void main(String[] args) {
        youngOld(); //call method
    }
}
