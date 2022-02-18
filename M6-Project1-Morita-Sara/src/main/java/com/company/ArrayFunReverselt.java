package com.company;

/*
* In a Java file called ArrayFunReverselt, provide code that declares the array [1, 2, 3, 4, 5],
* creates another array of equal length, and fills that array with values from the original array but in reverse order.
* Finally, your code must print the contents of both arrays to the screen
* */

import java.util.Arrays;

public class ArrayFunReverselt {

/*
    public static void originalArray(){

        //declaring original array
        int[] original = {1, 2, 3, 4, 5};

        //print out original array
        System.out.println("The original array is "+ original);

    }

    static int[] reverseOriginalArray() {

        //reverse the original array with same length

        int[] copyOriginal = new int[originalArray().length];

        int k, t;

        int n = originalArray().length;

        for (int i = 0; i < n / 2; i++){
            t = copyOriginal[i];
            copyOriginal[i] = copyOriginal[n - i - 1];
            copyOriginal[n - i - 1] = t;

        }
        //print the reversed
        System.out.println("Reversed array is "+ copyOriginal);
    }



 */

    public static void main(String[] args) {
        //declaring original array
        int[] originalArray = {1, 2, 3, 4, 5};

        //print out each element in the original array
        System.out.println("These are the each element in the original array: ");

        int n = originalArray.length;

        for (int i = 0; i < n; i++) {
            int element = originalArray[i];
            System.out.println(element);
        }

        // create a new array to add the reversed integers from the original
        int[] reverseOriginalArray = new int [n];

        int k, j, temp;

        for (j = 0; j < n / 2; j++){
            temp = originalArray[j];
            originalArray[j] = originalArray[n - j - 1];
            temp = originalArray[n - j - 1];

            //add the reversed element into new array
            for (int indx = 0; indx < n; indx++ ){
                reverseOriginalArray = temp[indx];
            }
        }




        //print the reversed array
        System.out.println("Reversed array is: \n");
        for (k = 0; k < n; k++) {
            System.out.println(reverseOriginalArray[k]);
        }

    }
}