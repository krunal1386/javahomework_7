package week7_homework;

public class Task20_Homework {
    /*
        20. Write a Java program to sum values of an array.
 */

    static int[] x = {5, 2, 8}; //declare integer array

    //declare static method
    static int sum() {
        for (int i = 0; i < x.length; i++) { //for loop
            int start = 0; //initialise first of the sum
            int temp = x[i] + start; //declare temporary variable to store the values of each loop
            int ans = temp; //declare variable to sum each value of each loop
            return ans; //return the sum after every loop is executed
        }
        return 0;
    }

    //Main method
    public static void main(String[] args) {
        System.out.println("Sum of Array = " + sum()); //print statement by calling the static method
    }
}
