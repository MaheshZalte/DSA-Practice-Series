package Date_june;
import java.util.*;

public class SpriralMatrix{
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        spiralMatrix(new int[][]{
            {1,2,3},
            {8,9,4},
            {7,6,5},
            {7,6,5}
        });
        
    }
    
    public static void spiralMatrix(int[][] matrix){
        int n = matrix.length ;
        int m = matrix[0].length;
        
        int startR = 0;
        int endR = n-1;
        int startC = 0;
        int endC = m-1;
        
        while(startR <= endR && startC <= endC ){
            //top
            for(int i = startC ; i <= endC ; i++){
                System.out.print(matrix[startR][i]+" ");
            }
            
            //right 
            for(int i = startR+1 ; i <= endR ; i++){
                System.out.print(matrix[i][endC]+" ");
            }
            
            //bottom
            for(int i = endC-1 ; i >= startC ; i--){
                if(startR == endR){
                    break;
                }
                System.out.print(matrix[endR][i]+" ");
            }
            
            //left
            for(int i = endR-1 ; i > startR ; i--){
                if(startC == endC){
                    break;
                }
                System.out.print(matrix[i][startC]+" ");
            }
            startR++;
            endR--;
            startC++;
            endC--;
        }
    }
}