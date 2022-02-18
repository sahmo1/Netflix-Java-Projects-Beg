package com.company;

import java.util.Scanner;

/*
* In a Java file called ArrayFun5Words,
* provide code that gets five words from the user,
* puts them in an array, and prints the array elements to the screen.
* */
public class ArrayFun5Words {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //create an array to add 5 words
        String[] fiveWordsArray = new String[5];

        //prompt the user to enter words
        System.out.println("Please enter a word. You can enter 5 times. ");

        //add userInput to the array
        for (int i = 0; i < fiveWordsArray.length; i++){
            String userInput = scan.nextLine();
            fiveWordsArray[i] = userInput;
        }

        //print each element in the array
        for (int j = 0; j < fiveWordsArray.length; j++){
            String element = fiveWordsArray[j];
            System.out.println("Each element of the array is: " + element);

        }

    }
}
