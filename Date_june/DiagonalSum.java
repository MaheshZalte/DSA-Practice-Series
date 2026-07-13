package Date_june;
import java.util.*;

class DiagonalSum{
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        diagonalSum(new int[][]
                {
                    {1, 2, 3, 4 ,1}, 
                    {5, 6, 7,1, 8}, 
                    {1, 2, 1,1, 4}, 
                    {5,1, 6, 7, 8},
                    {1,1, 6, 7, 8}
                });
    }
    
    public static void diagonalSum(int[][] matrix){
        int n = matrix.length ;
        int m = matrix[0].length;
        int sum = 0;
        if(m != n)return ;
        
        for(int i = 0 ; i < n ;  i++){
            sum += matrix[i][i];
            if(i != n-i-1)
                sum += matrix[i][n-i-1];
        }
        
        System.out.println("Matrix Diagonal Sum = "+sum);
    }
}