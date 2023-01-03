package week7_Midweek;
import java.util.Scanner;
public class Task8_Midweek {
    /*
        8.  A student will not be allowed to sit in exam if his/her attendence is less than 75%.
            Take following input from user
            Number of classes held
            Number of classes attended.
            And print
            percentage of class attended
            Is student is allowed to sit in exam or not.
 */

    //declare static method
    static void m1() {
        Scanner input1 = new Scanner(System.in); //create scanner object
        System.out.print("Number of classes held: "); //print statement
        double held = input1.nextDouble(); //read user input

        Scanner input2 = new Scanner(System.in); //create scanner object
        System.out.print("Number of classes attended: "); //print statement
        double attend = input2.nextDouble(); //read user input

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
    }

    //Main method
    public static void main(String[] args) {
        m1(); //call static method
    }
}
