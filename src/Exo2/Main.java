package Exo2;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr =  {1, 2, 3, 4, 5} ;
        reverse(arr) ;
    }

    public static void reverse(int[] arr) {
        System.out.println("the given arrays was : ") ;
        for (int i = 0   ; i < arr.length ; i++) {
            System.out.print(arr[i]   + " ");
        }
        for ( int i = 0 ;  i < arr.length/2 ; i++) {
            int temp  =  arr[i] ;
            arr[i] = arr[arr.length  - 1 -i] ;
            arr[arr.length - 1 -i] =  temp ;
        }
        System.out.println("") ;


        System.out.println("the sorted arrays is  : "+ Arrays.toString(arr)) ;
    }
}