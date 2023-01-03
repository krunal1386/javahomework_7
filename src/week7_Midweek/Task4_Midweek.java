package week7_Midweek;
import java.util.Scanner;
public class Task4_Midweek {
    /*
        4. Take values of length and breadth of a rectangle from user and check if it is square or not.
 */

    void recOrSqr() {
        Scanner input1 = new Scanner(System.in); //create scanner object
        System.out.print("Enter the length: "); //print statement
        int length = input1.nextInt(); //read user input

        Scanner input2 = new Scanner(System.in); //create scanner object
        System.out.print("Enter the breadth: "); //print statement
        int breadth = input2.nextInt(); //read user input

        System.out.print("\n"); //skips a line

        if (length==breadth) {
            System.out.println("The Quadrilateral is a SQUARE."); //print if condition true
        }else {
            System.out.println("The Quadrilateral is a RECTANGLE."); //print if condition false
        }
    }

    //Main method
    public static void main(String[] args) {
        Task4_Midweek myObj = new Task4_Midweek(); //create object
        myObj.recOrSqr(); //call instance method
    }
}
