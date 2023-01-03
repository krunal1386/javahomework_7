package week7_homework;

public class Task21_Homework {
    /*21. Write a Java program to calculate the average value of array elements.
     */

    void avgArray() {
        int[] numbers = new int[]{10, 15, 20, 25, 30,};
        //calculate sum of all array elements
        int sum = 0; //initialise starting value
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        //calculate average value
        float average = sum/numbers.length;
        System.out.println("Average value of the array elements is : " + String.format("%.2f",average));
    }

    //main method
    public static void main(String[] args) {
        Task21_Homework myObj = new Task21_Homework(); //create object
        myObj.avgArray(); //call method
    }
}