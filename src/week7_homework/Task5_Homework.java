package week7_homework;

import java.util.Scanner;


public class Task5_Homework {
/*
        5.  Write a java program to input student Name, roll No, and three subjects Math, Science and
            English marks (marks is between 0 and 100 and if it is out of range print error message “Invalid
            Input, Marks should between 0 and 100”) and find out total, percentage and result.
            If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
            %> = 60 A, %> = 50 B, %> = 35 C and print Mark Sheet in following format
 */

    //declare static void
    static void m1() {
        int xMath = 0, xSci = 0, xEng = 0; //declare local variables

        Scanner myName = new Scanner(System.in);  //create scanner object
        System.out.print("Input Student Name: "); //print out statement
        String name = myName.nextLine();  //read user input

        Scanner rollNo = new Scanner(System.in);  //create scanner object
        System.out.print("Input Student Roll Number: "); //print out statement
        int roll = rollNo.nextInt();  //read user input

        Scanner math = new Scanner(System.in);  //create scanner object
        System.out.print("Input marks for Mathematics: "); //print out statement
        xMath = math.nextInt();  //read user input

        Scanner sci = new Scanner(System.in);  //create scanner object
        System.out.print("Input marks for Science: "); //print out statement
        xSci = sci.nextInt();  //read user input

        Scanner eng = new Scanner(System.in);  //create scanner object
        System.out.print("Input marks for English: "); //print out statement
        xEng = eng.nextInt();  //read user input

        int sum = xMath + xSci + xEng;
        double perc = sum / 3;
        String res;
        String grade;

        if (perc >= 35) {
            res = "Pass";
        } else {
            res = "Fail";
        }

        if (perc >= 80) {
            grade = "A+";
        } else if (perc >= 60) {
            grade = "A ";
        } else if (perc >= 50) {
            grade = "B ";
        } else if (perc >= 35) {
            grade = "C ";
        } else {
            grade = "D ";
        }

        if (xMath<0 || xMath>100 || xSci<0 || xSci>100 || xEng<0 || xEng>100) {
            System.out.println("Invalid Input, Marks should between 0 and 100");
        }else {
            System.out.println("_________________________________");
            System.out.println("|                               |");
            System.out.println("|           MARK SHEET          |");
            System.out.println("|   NAME       : " + name + "  |");
            System.out.println("|   ROLL NO.   :   " + roll + "           |");
            System.out.println("|-------------------------------|");
            System.out.println("|   SUBJECTS   :   MARKS        |");
            System.out.println("|-------------------------------|");
            System.out.println("|   MATHS      :   " + xMath + "           |");
            System.out.println("|   SCIENCE    :   " + xSci + "           |");
            System.out.println("|   ENGLISH    :   " + xEng + "           |");
            System.out.println("|-------------------------------|");
            System.out.println("|   TOTAL      :   " + sum + "          |");
            System.out.println("|-------------------------------|");
            System.out.println("|   PERCENTAGE :   " + String.format("%.1f", perc) + "         |");
            System.out.println("|   RESULT     :   " + res + "         |");
            System.out.println("|   GRADE      :   " + grade + "           |");
            System.out.println("|                               |");
            System.out.println("_________________________________");
        }
    }

    public static void main(String[] args) {
        m1();
    }
}


