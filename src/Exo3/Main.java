package Exo3;

public class Main {
    public static void main(String[] args) {
        for ( int i =  1; i<= 5 ; i ++)  {
            for ( int j = 1 ;j <= i  ; j++) {
                System.out.print(j) ;
                if ( j== i )  {
                    System.out.print("") ;


                } else {
                    System.out.print(" , ") ;
                }


            }
            System.out.println() ;
        }
    }


}
