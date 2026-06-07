package Date_june;

public class HollowRectangle {

    public static void hollowRectangle() {
        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= m ; j++){
                if(i == 1 || i==n || j == 1 || j == m){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }


    public static void HalfPyramid(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(i + j <= n){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();   
        }
    }

    public static void InvertedRotatedHalfPyramid(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedHalfNumPyraamid(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(i + j <= n+1){
                    System.out.print(j+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public  static void PiramidZeroOne(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1  ; j <= i ; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }


    public static void ButterFly(int n){
        for(int i = 1 ; i <= n/2 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            for(int j = 1 ; j <= (n/2)-i ; j++){
                System.out.print("  ");
            }
            for(int j = n/2 ; j <= n ; j++){
                if(i+j <= n){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for(int i = 1 ; i <= n/2 ;  i++){
            for(int j = 1 ; j <= n/2-i+1 ; j++){
                System.out.print("* ");

            }
            for(int j = 1 ; j <= n/2 ; j++){
                if(i+j >= n/2+2){
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            for(int j = n/2-1 ; j <= i+1 ; j++){
                System.out.print("  ");
            }

            for(int j = n/2+1 ; j <= n-i+1 ; j++){
                System.out.print("* ");
            }

            // for(int j = n/2+1 ; j <= n-i+1 ; j++){
            //     System.out.print("* ");
            // }

            System.out.println();
        }

    }


    public static void main(String[] args) {
        // hollowRectangle();

        // HalfPyramid(7);

        // InvertedRotatedHalfPyramid(7);

        // invertedHalfNumPyraamid(7);

        // PiramidZeroOne(7);

        ButterFly(8);

    }
}
