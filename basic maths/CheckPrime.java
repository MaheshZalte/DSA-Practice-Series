public class CheckPrime{
    public static void  checkPrime(int n){
        int count = 0;
        for(int i = 1 ; i*i <= n ; i++){
            if(n % i == 0){
                count++;
                int a = n/i;
                if(a != i){
                    count++;
                }
            }
        }

        if(count > 2 || count < 2){
            System.out.println("Not prime");
        }else{
            System.out.println("prime");
        }
    }
    
    public static void main(String[] args) {
        checkPrime(7);
    }
}