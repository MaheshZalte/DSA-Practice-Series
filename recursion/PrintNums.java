public class PrintNums{
    public static int n = 1 ;
    public static int num = 10;

    public static void print1toN(){
        System.out.println(n);
        if(n == num)return;
        n++;
        print1toN();
    }
    public static int N = 10;
    public static void printNto1(){
        System.out.println(N);
        if(N == 1)return;
        N--;
        printNto1();
    }
    
    public static void main(String[] args) {
        printNto1();
    }
}