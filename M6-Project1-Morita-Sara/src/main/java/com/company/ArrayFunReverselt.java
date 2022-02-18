package com.company;

/*
 * In a Java file called ArrayFunReverselt, provide code that declares the array [1, 2, 3, 4, 5],
 * creates another array of equal length, and fills that array with values from the original array but in reverse order.
 * Finally, your code must print the contents of both arrays to the screen
 * */



public class ArrayFunReverselt {

    public static void reverseArray(int[] arr, int n){

        //create a new array to append reversed integers from the original array
        int[] reversedArray = new int[n];
        int j = n;

        //use for loop to add each element from the original array into the new reversed array in a reversed order.
        for (int i = 0; i < n; i++){
            reversedArray[j - 1] = arr[i];
            j -= 1;
        }

        //printing each element of reversed array
        System.out.println("Each element of the reversed array: ");
        for (int index = 0; index < n; index++){
            System.out.println(reversedArray[index]);
        }
    }


    public static void main(String[] args) {
        // declare an original array with given values
        int[] originalArr = {1, 2, 3, 4, 5};

        //print each element of the original array
        System.out.println("Each element of the original array: ");
        for (int k = 0; k < originalArr.length; k++){
            System.out.println(originalArr[k]);

        }
        //reverse original array
        reverseArray(originalArr, originalArr.length);
    }
}
