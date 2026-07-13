package Date_june;
import java.util.*;
public class CheckPalidrom{
    public static void main(String[] args) {
        checkPalidrom("racecara");
    }
    
    public static void checkPalidrom(String str){
        int st = 0 , end = str.length()-1;
        while(st < end){
            if(str.charAt(st) != str.charAt(end)){
                System.out.println("Not PLINDROM String");
                return;
            }
            st++;
            end--;
        }
        
        System.out.println("Palindrom");
        
    }
}