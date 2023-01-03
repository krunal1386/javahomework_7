package week7_homework;
import java.util.Scanner; // import the scanner
public class Task7_Homework {
    /*
    7. Write a java program to input any number and find out if it’s odd or even
     */

    //Main method
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in); //create a scanner objet
        System.out.println("Enter a number: ");

        int num = i.nextInt(); //Read user input
        int a = num%2;
        if (a==0){
            System.out.println("The number " + num + " is EVEN. "); //print out result
        }
        else{
            System.out.println("The number " + num + "is ODD. ");  //print out result
        }
    }
}
