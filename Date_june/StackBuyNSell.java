package Date_june;

class StackBuyNSell {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        stacksBuyNSell(new int[]{7,1,5,3,6,4});
        
    }
    
    public static void stacksBuyNSell(int[] arr){
        int n = arr.length;
        int buyP = Integer.MAX_VALUE;
        int sellP = 0;
        int profit = 0;
        
        for(int i = 0 ; i < n ; i++){
            buyP = Math.min(buyP , arr[i]);
            sellP = arr[i];
            System.out.print("S"+sellP +" ");
        }
        System.out.println();
        System.out.println(profit);
    }
}