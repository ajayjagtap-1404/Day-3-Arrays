package com.bridgelabz.day3;
import java.util.Arrays;
public class AscendingOrder {
    public static void main(String[] args) {
        int [] arr = {3,5,6,1,4,2};
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i] > arr[j]){

                    // Swapping number
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
        }
                System.out.println(Arrays.toString(arr));
    }

}

