package Date_june;
import java.util.*;
public class BitManipulation{
    public static void main(String[] args) {
        
        oddEvenBit(10000001);
        
    }
    
    public static void oddEvenBit(long bit){
        if((bit & 1) == 0){
            System.out.println("The given binary is Even");
        }else{
            System.out.println("The given binary is Odd");
        }
    }
}