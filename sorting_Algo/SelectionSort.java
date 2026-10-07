public class SelectionSort{
    public static int[] selectionSort(int[] arr){
        //Selection Sort
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int min = i;
            int j = 0;
            for(j = i ; j < n ; j++){
                if(arr[j] < arr[min])min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,4,1,8,5,7,6,3};

        int[] sortArr = selectionSort(arr);
        for(int i : sortArr){
            System.out.print(i+" ");
        }
    }
}