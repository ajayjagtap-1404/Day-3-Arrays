package com.bridgelabz.day3;

public class SmallestElementChecker {
    public static void main(String[] args) {
        int [] input = {11, 15, 17, 8, 98, 56, 33, 2, 88};
        int min = input[0];
        // iterating all the array element
        for (int i= 1; i <input.length; i++){

            // checking array element is smaller than max variable
            if (input[i]<min){
                // if array element is smaller then storing it into max variable
                min = input[i];
            }
        }
        // printing smallest value
        System.out.println("Smallest number is :"+ min);
    }
}


