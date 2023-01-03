package week7_homework;

public class Task3_Homework {
    /*
        3. Declare multidimensional array and store 5 countries and their
           capital and print them in console.
 */

    //declare static method
    static void m1() {
        //declare 2D array
        String[][] array = {{"India", "New Delhi"},
                {"France", "Paris"},
                {"Spain", "Madrid"},
                {"Germany", "Berlin"},
                {"New Zealand", "Wellington"}};

        for (int i=0; i<=4; i++) { //loop through rows
            System.out.print("[COUNTRY, CAPITAL CITY]: ");
            for (int j=0; j<=1; j++) { //loop through columns
                System.out.print(array[i][j] + "     "); //print array elements
            }
            System.out.println(); //skips to a new line
        }
    }

    //Main method
    public static void main(String[] args) {
        m1(); //call method
    }
}
