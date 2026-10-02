package Exo1;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arrayList = new int[6];

        arrayList[0]  = 106;
        arrayList[1]  = 26 ;
        arrayList[2]  = 81 ;
        arrayList[3]  =5 ;
        arrayList[4]  = 15 ;

        printarray(sortInteger(arrayList));

    }


    public static void printarray(int[] arr) {
        for ( int i =0  ; i < arr.length ; i++) {
            System.out.println("Element "+ i + " : " + arr[i]);
        }
    }

    public static int[] sortInteger(int[] arr) {
        int[] newArray  = new int[arr.length];
        for ( int i = 0 ; i < arr.length ; i++) {
            newArray[i] = (arr[i]) ;
        }


        for ( int i = 0 ; i < arr.length ; i++) {
            for ( int j = 0 ; j < arr.length - i - 1 ; j++) {
                if ( newArray[j+1] > newArray[j]) {
                    int temp = newArray[j+1];
                    newArray[j+1 ] =   newArray[j];
                    newArray[j] =  temp ;
                }
            }
        }

        return newArray ;
    }
}