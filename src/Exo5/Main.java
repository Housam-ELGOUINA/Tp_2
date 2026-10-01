package Exo5;

public class Main {
    public static void main( String[] args) {

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
