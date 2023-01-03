package week7_Midweek;
import java.util.Scanner;
public class Task10_Midweek {
    /*
        10. Write a program to print the sum of two numbers entered by user by defining your own method.
 */

    //declare static method
    static void sumOfTwo() {
        Scanner input1 = new Scanner(System.in); //create scanner object
        System.out.print("Enter First Integer Value: "); //print statement
        int x = input1.nextInt();

        Scanner input2 = new Scanner(System.in); //create scanner object
        System.out.print("Enter Second Integer Value: "); //print statement
        int y = input2.nextInt(); //read user input

        int sum = x+y; //add the two values

        System.out.print("\n"); //skips a line
        System.out.println("Result: " + x + " + " + y + " = " + sum); //print statement and answer
    }

    //Main method
    public static void main(String[] args) {
        sumOfTwo(); //call method
    }
}
