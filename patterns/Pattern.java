public class Pattern{

    public static void p1(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        /* Output:
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */
    }

    public static void p2(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 0 ; j < n-i+1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        /* Output:
        * * * * *
        * * * *
        * * *    
        * *
        *       */
        
    }

    public static void p3(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n - i + 1 ; j++ ){
               System.out.print(j+" "); 
            }

            System.out.println();
        }
        /* Output:
        1 2 3 4 5
        1 2 3 4
        1 2 3       
        1 2
        1       */
    }

    public static void p4(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-i ; j++ ){
               System.out.print(" ");
            }
            
            for(int j = 1 ; j <= 2*i+1 ; j++){
                System.out.print("*");
            }
            
            for(int j = 0 ; j < n-i ; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
        /* Output:
             *     
            ***    
           *****   
          *******  
         ********* 
        */

    }


    public static void p5(int n){
        for(int i = 0 ; i <= n ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }

            for(int j = 0 ; j < 2*(n-i)+1 ; j++){
                System.out.print("*");
            }

            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void p6(int n ){
        for(int i = 1 ; i <= 2*n-1 ; i++){
            int stars = i;
            if(i > n){stars = 2*n - i;}
            for(int j = 1 ; j <= stars ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /* Output:
        *      
        * *
        * * *
        * * * *
        * * *
        * *
        *      */
    }

    public static void p7(int n ){
        for(int i = 1 ; i <= n ; i++){
            int start = 1;
            if(i % 2 == 0) start = 0;
            else start = 1;
            for(int j = 1 ; j <= i; j++){
                System.out.print(start);
                start = 1 - start;
            }

            System.out.println();
        }
        /* Output:
        1
        01
        101
        0101
        10101
        */

    }

    public static void p2(int n){
        
        for(int i = 1 ; i <= 2*n-1 ; i++){
            //stars
            int stars = i <= n ? i : 2*n-i ;
            for(int j = 1 ; j <= stars ; j++){
                System.out.print("* ");
            }

            //spaces
            int spaces = 2*(n-stars);
            for(int j = 1 ; j <=spaces ; j++){
                System.out.print("  ");
            }
            //stars
            for(int j = 1  ; j <= stars ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }


    public static void p(int n ){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(i == 1 || j == 1 || j == n || i == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }




    public static void main(String[] args) {
        p1(5);
        System.out.println();
        p2(5);
        System.out.println();
        p3(5);
        System.out.println();
        p4(5);
        System.out.println();
        p5(5);
        System.out.println();
        p6(5);
        System.out.println();
        p7(5);
    }
    
}