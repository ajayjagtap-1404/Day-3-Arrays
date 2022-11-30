package com.bridgelabz.day3;

public class LargestElementChecker {
    public static void main(String[] args) {
        int [] input = {1, 15, 17, 8, 98, 56, 33, 88};
        int max = input[0];
        // iterating all the array element
        for (int i=1; i<input.length;i++){

            // checking array element is greater than max variable
            if (input[i]>max){
                // if array element is grater then storing it into max variable
                max = input[i];
            }
        }
        // printing max value
        System.out.println("max number is :"+ max);
    }
}
