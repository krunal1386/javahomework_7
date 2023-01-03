package week7_homework;

public class Task4_Homework {
    /*
        4. Write if else condition and print your group name in console else
           others group name.
 */

    //declare static method
    static void m1() {

        //declare local variables
        int x = 5;
        int y = 5;

        if (x==y) { //if statement
            System.out.println("JAVA"); //print if true
        }else {
            //print otherwise
            System.out.println("SELENIUM, POSTMAN, REST ASSURED");
        }
    }

    //Main method
    public static void main(String[] args) {
        m1(); //call static method
    }
}

