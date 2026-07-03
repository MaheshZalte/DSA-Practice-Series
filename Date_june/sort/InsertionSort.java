package Date_june;
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        insertionSort(new int[]{5,4,3,2,1});
        
    }
    
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            
            arr[prev+1] = curr;
        }
        
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}