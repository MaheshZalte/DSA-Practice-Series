public class MargeSort{

    public static void margeSort(ArrayList<Integer> arr , int low ,  int high){
        if(low >= high)return;
        int mid = (low+high)/2;
        margeSort(arr , low , mid);
        margeSort(arr , mid+1 , high);
        marge(arr , low , mid , high);
    }

    public static void marge(ArrayList<Integer> arr , int low , int mid , int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low ;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr.get(left) < arr.get(right)){
                temp.add(arr.get(left));
                left++;
            }else{
                temp.add(arr.get(right));
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr.get(left));
            left++;
        }

        while(right <= high){
            temp.add(arr.get(right));
            right++;
        }

        for(int i = low; i <= high; i++){
    arr.set(i, temp.get(i - low));
}
    }
    
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>(List.of(9, 8, 7, 6, 5, 4, 3, 2, 1));


        margeSort(al , 0 , 8);

        System.out.print(al);
    }
}