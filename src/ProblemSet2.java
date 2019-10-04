/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

        System.out.print(" \n Enter your first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();
        System.out.print("Enter your grade: ");
        int grade = in.nextInt();
        System.out.print("Enter your age: ");
        int age = in.nextInt(); in.nextLine();
        System.out.print("Enter your hometown: ");
        String town = in.nextLine();

        System.out.println("\n NAME     :" + firstName + " " + lastName);
        System.out.println("GRADE    :" + grade);
        System.out.println("AGE      :" + age);
        System.out.println("HOMETOWN :" + town);



        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

        System.out.print(" \n Enter a dollar amount: ");

        int dollars = in.nextDouble();
        dollars = dollars * 100;

        int dollarBills = (int)(dollars / 100);
        dollars = dollars % 100;

        int quarters = (int)(dollars / 25);
        dollars = dollars % 25;

        int dimes = (int)(dollars / 10);
        dollars = dollars % 10;

        int nickels = (int)(dollars / 5);
        dollars = dollars % 5;

        int pennies = (int)(dollars / 1);
        dollars = dollarAmount % 1;

        System.out.println(" \n DOLLARS  : " + dollarBills);
        System.out.println("QUARTERS : " + quarters);
        System.out.println("DIMES    : " + dimes);
        System.out.println("NICKELS  : " + nickels);
        System.out.println("PENNIES  : " + pennies);


        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

        System.out.print(" \n Enter a dollar amount: ");

        double amount = in .nextDouble();
        amount = amount * 100;

        int hundredBills = (int)(amount / 10000);
        amount = amount % 10000;

        int twentyBills = (int)(amount / 2000);
        amount = amount % 2000;

        int tenBills = (int)(amount / 1000);
        amount = amount % 1000;

        int fiveBills = (int)(amount / 500);
        amount = amount % 500;

        int bills = (int)(amount / 100);
        amount = amount % 100;

        int quarters2 = (int) (amount / 25);
        amount = amount % 25;

        int dimes2 = (int) (amount / 10);
        amount = amount % 10;

        int nickels2 = (int) (amount / 5);
        amount = amount % 5;

        int pennies2 = (int) (amount / 1);
        amount = amount % 1;

        System.out.println(" \n BILLS : " + (hundredBills + twentyBills + tenBills + fiveBills + bills));
        System.out.println("COINS : " + (quarters2 + dimes2 + nickels2 + pennies2));

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

        System.out.print(" \n Enter a number of inches: ");
        int number = in.nextInt();

        int miles = number / 63360;
        number = number % 63360;

        int yards = number / 36;
        number = number % 36;

        int feet = number / 12;

        int inches = number % 12;

        System.out.println(" \n MILES  : " + miles);
        System.out.println("YARDS  : " + yards);
        System.out.println("FEET   : " + feet);
        System.out.println("INCHES : " + inches);

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

        System.out.print(" \n Enter a number of centimeters: ");

        int centimeters = in.nextInt();

        int kilometers = centimeters / 100000;

        centimeters = centimeters % 100000;

        int meters = centimeters / 100;

        centimeters = centimeters % 100;

        System.out.println(" \n KILOMETERS  : " + kilometers);
        System.out.println("METERS      : " + meters);
        System.out.println("CENTIMETERS : " + centimeters);


        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

        System.out.print(" \n Enter a diameter: ");
        double diameter = in.nextInt();

        double area = Math.pow(diameter / 2, 2) * Math.PI;
        double circumference = diameter * Math.PI;

        System.out.printf(" \n AREA          : %,.2f", area);
        System.out.printf(" \n CIRCUMFERENCE : %,.2f\n ", circumference);



        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */

        System.out.print(" \n Enter a length: ");
        int length = in.nextInt();

        System.out.print("Enter a width: ");
        int width = in.nextInt();

        double perimeter = (2 * (double)length) + (2 * (double)width);

        System.out.printf(" \n AREA      : %,.2f ", (double)(length * width));
        System.out.printf(" \n PERIMETER : %,.2f ", perimeter);
        System.out.printf(" \n DIAGONAL  : %,.2f\n ", Math.hypot(length, width));



        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */

        System.out.print(" \n Enter a side length: ");

        int sidelength = in.nextInt();
        in.nextLine();

        double hexArea = ((3 * Math.sqrt(3)) / 2) * Math.pow(sidelength, 2);
        double hexPerimeter = 6 * sidelength;

        System.out.printf(" \n AREA      : %,.2f\n ", hexArea);
        System.out.printf("PERIMETER : %,.2f\n ", hexPerimeter);



        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */

        System.out.print(" \n Enter a String: ");

        String string = in.nextLine();

        String firstHalf = string.substring(0, (int)Math.floor(string.length()) / 2);

        String secondHalf = string.substring((int)Math.floor(string.length()) / 2, string.length());

        System.out.println("\n" + secondHalf + firstHalf);


        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */

       System.out.print("\n Enter your first name: ");
       String firstname = in.nextLine();

       System.out.print("Enter your middle name: ");
       String middlename = in.nextLine();

       System.out.print("Enter last first name: ");
       String lastname = in.nextLine();

       System.out.println("\n" + firstname.substring(0, 1) + middlename.substring(0, 1) + lastname.substring(0, 1) + "\n");

       in .close();


    }
}
