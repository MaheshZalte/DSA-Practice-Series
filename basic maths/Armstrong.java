import java.util.Scanner;
public class Armstrong{
    public static boolean isArmstrong(int n) {
        int arm = 0;
        int res = n;
        while(n > 0){
            int num = n %10;
            int cub =  num*num*num;
            arm+=cub;
            n/=10;
        }

        return arm == res;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
}