package week7_homework;
import java.util.Scanner;
public class Task1_Homework {
    /*
        1.  Write a java program that tells us that Input number is odd or even?
            HINT: use ternary operator (? :)
 */

    //declare instance method
    void checkEvenOdd() {
        Scanner input = new Scanner(System.in); //create scanner object
        System.out.print("Enter a number to check: "); //print out statement
        int i = input.nextInt(); //read user input

        //check if even or odd
        //variable var = (condition) ? value1 if true : value2 if false
        String str = (i%2==0) ? "The number " + i + " is EVEN." : "The number " + i + " is ODD.";
        System.out.println(str); //print output
    }

    //Main method
    public static void main(String[] args) {
        Task1_Homework myObj = new Task1_Homework(); //create object
        myObj.checkEvenOdd(); //call method
    }

}

