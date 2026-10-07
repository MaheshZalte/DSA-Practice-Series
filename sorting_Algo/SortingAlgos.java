class SortingAlgos {

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

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};

        int[] sortArr = bubbleSort(arr);
        // int[] sortArr = insertionSort(arr);
        
        for(int i : sortArr){
            System.out.print(i+" ");
        }
    }
        
}