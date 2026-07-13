package Date_june;

import java.util.*;
public class StaireSearch{
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        staireSearch(new int[][]
                {
                    {10,20,30,40}, 
                    {15,25,35,45}, 
                    {27,29,37,48}, 
                    {32,33,39,50}
                }  , 32);
    }
    
    public static void staireSearch(int[][] matrix , int key){
        int row = 0;
        int col = matrix[0].length-1;
        
        
        while(row < matrix.length && col >= 0)
        {
            if(matrix[row][col] == key){
                System.out.println("key found at "+"("+row+","+col+")");
            }
            if(matrix[row][col] > key){
                col--;
            }else{
                row++;
            }
        }
    }
}