public class Palindrom{
    public static boolean palindrom(int i , int n , String s){
        if(i >= n-i-1)return true;
        if(s.charAt(i) != s.charAt(n-i-1))return false;

        return palindrom(i+1,n,s);
    }
    
    public static void main(String[] args) {
        System.out.println(palindrom(0,5 , "madnm"));
    }
}