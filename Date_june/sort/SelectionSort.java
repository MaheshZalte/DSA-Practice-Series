package Date_june;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        selectionSort(new int[]{5,4,3,2,1});
        
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            int minPos = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr[minPos] > arr[j]){
                    minPos  = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        
        for(int i : arr){
            System.out.print(i+" ");
        }
        
    }
}