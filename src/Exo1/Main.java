package Exo1;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(106);
        arrayList.add(26) ;
        arrayList.add(81) ;
        arrayList.add(5) ;
        arrayList.add(15) ;

        printarray(sortInteger(arrayList));

    }


    public static void printarray(ArrayList<Integer> arr) {
        for ( int i =0  ; i < arr.size() ; i++) {
            System.out.println("Element "+ i + " : " + arr.get(i));
        }
    }

    public static ArrayList<Integer> sortInteger(ArrayList<Integer> arr) {
        ArrayList<Integer> newArray  = new ArrayList<>();
        for ( int i = 0 ; i < arr.size() ; i++) {
            newArray.add(arr.get(i)) ;
        }


        for ( int i = 0 ; i < arr.size() ; i++) {
            for ( int j = 0 ; j < arr.size() - i - 1 ; j++) {
                if ( newArray.get(j+1) > newArray.get(j)) {
                    int temp = newArray.get(j+1);
                    newArray.set(j+1 ,  newArray.get(j));
                    newArray.set(j, temp ) ;
                }
            }
        }

        return newArray ;
    }
}