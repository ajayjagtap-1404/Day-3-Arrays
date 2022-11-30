package com.bridgelabz.day3;

public class DuplicateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,4,2,6,7,6,2};
        for (int i=0;i< arr.length;i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]+" ");

                }
            }
        }
    }
}
