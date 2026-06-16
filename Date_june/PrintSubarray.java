// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package Date_june;
import java.util.*;


public class PrintSubarray {
    public static void PrintSubarray(int []arr){
        for(int i = 0 ; i < arr.length ; i++){
            int st = i;
            for(int j = i ;j < arr.length ; j++){
                int end = j;
                System.out.print("( ");
                for(int k = st ; k <= end ; k++ ){
                    System.out.print(arr[k]+" ");
                }
                System.out.print(")  ");
            }
            System.out.println();
        }
        
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int[] arr = {2,4,6,8,10};
        PrintSubarray(arr);
        
    }
}