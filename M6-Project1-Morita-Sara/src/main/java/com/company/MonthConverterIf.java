package com.company;

/*
* Follow these steps to complete the Month Converter exercise:

Prompt the user to enter a number between 1 and 12.

Print out the name of the month corresponding to its number.

Print out the following error message if the user enters a number less than 1 or greater than 12:
* "You have entered an invalid number. You must enter a number between 1 and 12. Goodbye."
* */

import java.util.Scanner;

public class MonthConverterIf {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        // get input from the user
        System.out.println("Please enter a number between 1 and 12.");
        String userInput = scan.nextLine();

        //convert userInput into a number

        int userNum = Integer.parseInt(userInput);

        //compare userNum to the number between 1 and 12, and print out correct months.

        if (userNum == 1){
            System.out.println("January");
        }else if (userNum == 2){
            System.out.println("February");
        }else if (userNum == 3){
            System.out.println("March");
        }else if (userNum == 4){
            System.out.println("April");
        }else if (userNum == 5){
            System.out.println("May");
        }else if (userNum == 6){
            System.out.println("June");
        }else if (userNum == 7){
            System.out.println("July");
        }else if (userNum == 8){
            System.out.println("August");
        }else if (userNum == 9){
            System.out.println("September");
        }else if (userNum == 10){
            System.out.println("October");
        }else if (userNum == 11){
            System.out.println("November");
        }else if (userNum == 12){
            System.out.println("December");
        } else{
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }


    }
}
