package week7_homework;
import java.util.Scanner;
public class Task10_Homework {
    /*
        10. Input any alphabet from "A" to "F" and print their city name accordingly (use if else), if
            any other alphabet should be invalid entry
 */

    //declare instance method
    void m1() {
        Scanner myInput = new Scanner(System.in);  //create scanner object
        System.out.print("Choose an alphabet from A to F: "); //print out statement
        char c = myInput.next().charAt(0);  //read user input

        if (c == 'A') { //if condition
            System.out.println("City: ABERDEEN"); //print statement if true
        } else if (c == 'B') {
            System.out.println("City: BARODA"); //print statement if true
        } else if (c == 'C') {
            System.out.println("City: CHANDIGARH"); //print statement if true
        } else if (c == 'D') {
            System.out.println("City: DELHI"); //print statement if true
        } else if (c == 'E') {
            System.out.println("City: EL PASO"); //print statement if true
        } else if (c == 'F') {
            System.out.println("City: FARIDABAD"); //print statement if true
        } else {
            System.out.println("INVALID ENTRY"); //print if input character is out of range
        }
    }

    //Main method
    public static void main(String[] args) {
        Task10_Homework myObj = new Task10_Homework(); //create object
        myObj.m1(); //call method
    }
}

