package Date_june;
import java.util.*;
public class FindDisplacementBasedOnStr{
    public static void main(String[] args) {
        findDisplacement("WNEENESENNN");
    }
    
    public static void findDisplacement(String str){
        int cor1 =0 , cor2 = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'E')cor1++;
            if(str.charAt(i) == 'W')cor1--;
            if(str.charAt(i) == 'N')cor2++;
            if(str.charAt(i) == 'S')cor2--;
        }
        
        double displacement = Math.sqrt(Math.pow(cor1,2)+Math.pow(cor2,2));
        
        System.out.println("Shortest Distance between start and end is = "+ displacement);
    }
}