package Exo5;

public class Main {
    public static void main( String[] args) {
            int[][] m1 = {{1 , 2  , 3 , 4} ,
                    {4 , 6 ,8 , 8} ,
                    {0 , 8 , 11 , 1}} ;

            int[][] m2 = {{1 , 2  , 3 , 4} ,
                {4 , 6 ,8 , 8} ,
                {0 , 8 , 11 , 1}} ;


            System.out.println("the sum of m1 and m2 is  : " ) ;


            for ( int i = 0 ; i < m1.length  ; i++) {
                for (int j = 0  ; j < m1[0].length ; j++) {
                    System.out.print(matrixAdd(m1 , m2)[i][j] +  " ");
                }
                System.out.println("  ");
            }

    }

    public static int[][] matrixAdd(int[][] M1 , int[][] M2) {
        int[][] Msum = new int[M1.length][M1[0].length] ;

        for ( int i = 0 ; i < M1.length ; i ++) {
            for ( int j =0 ; j < M1[0].length  ; j++) {
                Msum[i][j] = M1[i][j] + M2[i][j] ;
            }
        }

        return Msum ;
    }
}
