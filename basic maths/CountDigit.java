public class CountDigit{
    public static void countDigit(int n){
        int cnt = 0;
        while(n > 0){
            n = n/10;
            cnt++;
        }
        // int count = (int)(Math.log10(n) + 1);
        System.out.println("Number of Digits : "+cnt);
    }
    
    public static void main(String[] args) {
        countDigit(7007);
    }
}