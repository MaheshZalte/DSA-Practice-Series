package Date_june;
import java.util.*;

public class CountNoOfSetBits{
    public static void main(String[] args) {
        
        countNumberOfSetBits(10);
        
    }
    
    public static void countNumberOfSetBits(int n){
        int a = n;
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n= n>>1;
        }
        
        System.out.println("number of set bits in "+a+" is "+count);
    }
}