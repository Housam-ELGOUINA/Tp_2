package Exo7;

public class Main {
    public static void main(String[] args) {
        int[] arr =  {1, -2, 4, -4, 9, -6, 16, -8, 25, -10} ;
        System.out.println(" the standard deviation for {1, -2, 4, -4, 9, -6, 16, -8, 25, -10}  : " + stdev(arr)) ;

    }

    public static double stdev(int[] arr) {
        // Computing the average :

        double count  = 0 ;

        for ( int i =0 ; i < arr.length   ; i++ ) {
            count += arr[i] ;
        }

        double avg =  count /arr.length ;


        double count1 = 0 ;


        for ( int j =0   ;j < arr.length ; j++) {

            count1 += (arr[j] - avg)*(arr[j] - avg) ;

        }

        double squared  = count1/(arr.length -1) ;
        return Math.sqrt(squared) ;
    }
}
