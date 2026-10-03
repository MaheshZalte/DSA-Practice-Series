public class LCM{
    public static int GCD(int n1 , int n2){
        if(n1 == 0)return n2;
        if(n2 == 0)return n1;

        if(n1 > n2)return GCD(n1%n1 , n2);

        return GCD(n2%n1 , n1);
    }

    public int LCM(int n1, int n2) {
        int GCD = GCD(n1,n2);

        int LCM = (n1 * n2) / GCD;

        return LCM;
    }
}