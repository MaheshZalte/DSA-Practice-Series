public class Recursion{
    public static int sum(int n){
        if(n == 0) return 0;
        return n + sum(n-1);
    }

    public static int fectorial(int n){
        if(n == 1)return 1;
        return n * fectorial(n-1);
    }
    
    public static void main(String[] args) {
        // sum(1,0);
        System.out.println(fectorial(2));
    }
}