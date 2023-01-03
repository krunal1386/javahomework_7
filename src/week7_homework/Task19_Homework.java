package week7_homework;

import java.util.Arrays;

public class Task19_Homework {
    /*
            19. Write a Java program to sort a numeric array and a string array.
 */

    //Main method
    public static void main(String[] args) {
        sortArrays(); //call method
    }

    //declare static method
    static void sortArrays() {

        //declare local arrays
        int[] numArray = {141,142,96,86,7774,1326,1220};
        String[] strArray = {"Usa", "Russia", "India", "Germany", "France", "United Kingdom"};

        System.out.println("Original Numeric Array : " + Arrays.toString(numArray)); //print original
        Arrays.sort(numArray); //sort numeric array into ascending order
        System.out.println("Sorted Numeric Array : " + Arrays.toString(numArray)); //print sorted
        System.out.print("\n"); //skip a line
        System.out.println("Original String Array : " + Arrays.toString(strArray)); //print original
        Arrays.sort(strArray); //sort string array into ascending order
        System.out.println("Sorted String Array : " + Arrays.toString(strArray)); //print sorted
    }
}
