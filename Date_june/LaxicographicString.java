package Date_june;
import java.util.*;
public class LaxicographicString{
     public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        laxicographicString(new String[]{"apple","mango","banana","orange","pineapple","smallapple","graps"});
        
    }
    
    public static void laxicographicString(String[] arr){
        int n = arr.length;
        String largest = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(largest.compareTo(arr[i]) < 0){
                largest = arr[i];
            }
        }
        
        System.out.println("largest string = "+ largest);
    }
}