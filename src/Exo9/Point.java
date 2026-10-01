package Exo9;

public class Point {

    private int x ;
    private int y ;

    Point() {
        this.x= 0 ;
        this.y  =  0 ;

    }

    Point(int x, int y) {
        this.x  = x ;
        this.y  = y ;
    }

    public int getX() {
        return this.x ;
    }

    public int getY() {
        return this.y ;
    }

    public void setX(int x) {
        this.x  = x  ;
    }

    public void setY( int y) {
        this.y  =  y ;
    }

    public double distance() {
        return Math.sqrt((x*x + y*y)) ;
    }

    public double distance (Point other) {
        return Math.sqrt(((x*x - other.x*other.x) + (y*y - other.y*other.y))) ;
    }


    public double distance(int x  , int y) {
        Point other  = new Point(x , y) ;
        return distance(other) ;
    }
}
