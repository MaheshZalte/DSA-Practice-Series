package Date_june;
import java.util.*;


public class KadansAlgo {
    
    
    
    public static void Kadans(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            currSum = currSum + arr[i] > 0 ? currSum + arr[i] : 0;
            maxSum  = currSum > maxSum ? currSum : maxSum;
        }
        System.out.println("Maximum sum of SubArray = "+maxSum);
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int[] arr = {1,-2,6,-1,3};
        Kadans(arr);
        
        
    }
}