public class ReverseNum{
     public static void reverse(int n){
        int reverse = 0;
        while(n > 0){
            int lastDigit = n % 10;
            n /= 10;
            reverse = (reverse * 10) + lastDigit;
        }

        System.out.println(reverse);
    }

    public static void main(String[] args) {
        reverse(1234);
    }
}