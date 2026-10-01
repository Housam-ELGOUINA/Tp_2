package Exo4;

public class Main {
    public static void main(String args[]) {
        int[][] matrix  = new int[6][8];

        for ( int i =0 ; i < 6 ; i ++) {
            int temp  = matrix[i][6] ;
            matrix[i][6] =  matrix[i][7] ;
            matrix[i][7] = temp ;

        }
    }
}
