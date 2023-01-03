package week7_homework;

public class Task2_Homework {
    /*
        2. Declare array and store any 5 countries and print them in console.
 */

    //Main method
    public static void main(String[] args) {
        String[] str = {"India", "United Kingdom", "United states", "France", "Russia" +
                ""}; //declare string array

        for (int i=0; i<str.length; i++) { //for loop
            System.out.print(str[i] + ", "); //print statement
        }
    }
}
