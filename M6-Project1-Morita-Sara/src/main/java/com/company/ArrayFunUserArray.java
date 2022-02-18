package com.company;

/*
*In a Java file called ArrayFunUserArray,
* provide code that reads five integers from the user, puts them in an array,
* and prints the array elements to the screen.
*
* */


import java.util.Scanner;

public class ArrayFunUserArray {


    public static void main(String[] args) {

        //create scanner and define a new array to append 5 integers.
        Scanner scan = new Scanner(System.in);
        int[] funArray = new int[5];

        //prompt for the user to enter int 5 times.
        System.out.println("Please enter an integer 5 times.");

        //adding user input integers into the array funArray
        for (int i = 0; i < 5; i++){
            int userInput = Integer.parseInt(scan.nextLine());
            //adding each integer by index.
            funArray[i] = userInput;
        }

        //int variable j is index and arrayElement prints out each element in funArray
        int j, arrayElement;

        System.out.println("Below are the elements in the array: ");

        for (j = 0; j < funArray.length; j++ ){
            arrayElement = funArray[j];
            System.out.println(arrayElement);
        }






    }

}
