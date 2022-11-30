package com.bridgelabz.day3;

public class SecondLargestNumberChecker {
    public static void main(String[] args) {
        int [] arr = {3, 2, 7, 8, 6, 9, 5};
        int temp;
        for (int i= 0; i <arr.length; i++){
            for(int j= i+1; j <arr.length; j++){
                // Swap
                if (arr[i] > arr[j]){
                     temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (int i= 0; i< arr.length; i++){
            System.out.print(arr[i]+ ", ");
        }
        System.out.println("Second largest number is:"+ arr[1]);
    }
}
