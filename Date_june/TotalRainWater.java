package Date_june;

class TotalRainWater {
    public static void main(String[] args) {
        rainWater(new int[]{4,2,0,6,3,2,5});
        
    }
    
    public static void rainWater(int[] arr){
        int n = arr.length ;
        int maxHeight = 0;
        int area = 0;
        int[] LMB = new int[n];
        
        int LeftM = arr[0];
        for(int i = 0 ; i < n ; i++){
            if(i == 0)LMB[i] = LeftM;
            if(arr[i] > LeftM){
                LMB[i] = arr[i];
                LeftM = arr[i];
            }else if(LeftM >= arr[i]){
                LMB[i] = LeftM;
            }
        }
        
        System.out.println();
        
        int[] RMB = new int[n];
        int RightM = arr[n-1];
        
        for(int i = n-1 ; i >= 0 ; i--){
            if(i == n-1)RMB[i] = RightM;
            if(arr[i] > RightM){
                RMB[i] = arr[i];
                RightM = arr[i];
            }else if(RightM >= arr[i]){
                RMB[i] = RightM;
            }
        }
        
        System.out.println();
        
        for(int i = 0 ; i < n ; i++){
            maxHeight = Math.min(LMB[i] , RMB[i]);
            area += maxHeight - arr[i];
        }
        
        System.out.println("Total amount of Rain = "+ area );
    }

}