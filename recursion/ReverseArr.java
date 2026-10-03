public class ReverseArr{
     public static int[] swap(int i , int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static int[] reverse(int i , int[] arr  , int n){
        if(i > n-i-1) return arr;
        int[] res = swap(i,n-i-1 , arr);
        return reverse(i+1 , res , n );
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] a = reverse(0 , arr , 5);

        for(int i : a){
            System.out.print(i+" ");
        }
        
    }
}