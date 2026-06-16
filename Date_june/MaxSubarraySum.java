package Date_june;
import java.util.*;


public class MaxSubarraySum {
    public static void PrintSubarray(int []arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            int st = i;
            for(int j = i ;j < arr.length ; j++){
                int total = 0;
                int end = j;
                System.out.print("( ");
                for(int k = st ; k <= end ; k++ ){
                    System.out.print(arr[k]+" ");
                    total += arr[k];
                }
                System.out.print(")  ");
                System.out.println("sum = "+total);
                max =( total > max )? total : max;
                min = (total < min)? total : min;
            }
            System.out.println();
        }
        
        System.out.println("Max Subarray Sum : "+ max);
        System.out.println("Min Subarray Sum : "+ min);
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int[] arr = {1,-2,6,-1,3};
        PrintSubarray(arr);
        
    }
}