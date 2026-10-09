import java.util.*;
public class QuickSort{

    public static int partition(ArrayList<Integer> arr , int low , int high){
        int i = low , j = high;
        int pivot = low;
        ArrayList<Integer> res = new ArrayList<>();

        while(i < j){
            while(i <= high &&  arr.get(i) <= arr.get(pivot)){
                i++;
            }
            while(j >= low && arr.get(j) > arr.get(pivot)){
                j--;
            }

            if(i < j){
                int temp = arr.get(i);
                arr.set(i , arr.get(j));
                arr.set(j , temp);
            }
        }

        int temp = arr.get(j);
        arr.set(j , arr.get(pivot));
        arr.set(pivot , temp);

        return j;

    }

    public static void quickSort(ArrayList<Integer> arr , int low , int high){
        if(low >= high)return;

        int partition = partition(arr , low , high);
        quickSort(arr , low , partition - 1);
        quickSort(arr , partition + 1 , high);
    }


    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>(List.of(9, 8, 7, 6, 5, 4, 3, 2, 1));
        System.out.println(arr);
        quickSort(arr,0,8);
        System.out.println(arr);
    }
}