package week7_Midweek;

import java.util.Scanner;

public class Task9_Midweek {
    /*9. Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
*/
    //declare static method
    static void m1() {
        Scanner input1 = new Scanner(System.in); //create scanner object
        System.out.print("Number of classes held: "); //print statement
        double held = input1.nextDouble(); //read user input

        Scanner input2 = new Scanner(System.in); //create scanner object
        System.out.print("Number of classes attended: "); //print statement
        double attend = input2.nextDouble(); //read user input

        Scanner input3 = new Scanner(System.in); //create scanner object
        System.out.print("Do they have a medical cause? (y/n): "); //print statement
        char cause = input3.next().charAt(0); //read user input

        System.out.print("\n"); //skips a line

        double percentage = (attend / held) * 100; //declare local variable
        System.out.println("Percentage of class attended: " + percentage + "%."); //print statement

        double pass = 75.0;
        System.out.print("Is student allowed to sit in exam? "); //print statement
        if (percentage < pass) {
            System.out.print("NO."); //not allowed if less than 75
        } else {
            System.out.print("YES."); //otherwise allowed
        }

        System.out.println(); //skip to a new line
        System.out.print("Is student allowed to sit in exam? "); //print statement1010

        if (cause=='y') {
            System.out.println("no."); //not allowed if they have a medical cause
        }else if (cause=='n') {
            System.out.println("yes"); //otherwise allowed
        }
    }

    //Main method
    public static void main(String[] args) {
        m1(); //call static method
    }
}
