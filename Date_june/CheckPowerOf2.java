package Date_june;
import java.util.*;
public class CheckPowerOf2{
    public static void main(String[] args) {
        
        // oddEvenBit(10000001);
        
        checkPowerOf2(10);
        
    }
    
    public static void checkPowerOf2(int n){
        if((n & (n-1)) == 0){
            System.out.println("this number is power of 2");
        }else{
            System.out.println("this number is not power of 2");
        }
    }
}