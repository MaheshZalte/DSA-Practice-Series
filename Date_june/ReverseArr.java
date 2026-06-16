package Date_june;

import java.util.*;


public class ReverseArr {

    public static void reverseArr(int arr[]){
        int st = 0;
        int end = arr.length-1 ;
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverseArr(arr);
        printArr(arr);
    }
}