
package Exo9;

public class Main {

    public static void main(String[] args) {
        System.out.println("this is a test for the Point class methods: ") ;

        Point p1  = new Point(1 , 2) ;

        Point p2 = new Point(2 , 5) ;


        System.out.println("the distance from p1 to p2 is : "+ p1.distance(p2));
        System.out.println("the distance from p1 to p2(2 , 5) using just the variables of x2 and y2 is ( Another way )  : "+ p1.distance(2 , 5));

    }
}
