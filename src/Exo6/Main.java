package Exo6;

public class Main {
    public static void main (String[] args) {
        int[] arr  =   {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17} ;

        System.out.println( "the median of  {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17} is: " + median(arr)) ;


        int[] arr1  = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27} ;

        System.out.println(" the median of {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27} is  : " + median(arr1)) ;

    }

    public static int median(int[] arr) {
        // Sorting the array arr first :
        for ( int i = 0  ; i < arr.length  ; i++) {
            for ( int j = 0 ; j < arr.length -i -1 ; j++) {
                if ( arr[j+1] < arr[j]) {
                    int temp =  arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ; // swapping the element for sorting

                }

            }
        }

        // Checking the median value  :

        return arr[(arr.length-1)/2] ;


    }
}
