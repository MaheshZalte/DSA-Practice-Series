import java.util.ArrayList;
import java.util.Collections;

// its take O(sqrt(n)) time complexity and O(sqrt(n)) space complexity
public class Divisor{
    public static void divisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                int a = n / i;
                    list.add(i);
                if(a != i){
                    list.add(a);
                }
            }
        }

        Collections.sort(list);

        for(int i : list){
            System.out.print(i+" ");
        }
    }
    
    public static void main(String[] args) {
        divisors(36);
    }
}