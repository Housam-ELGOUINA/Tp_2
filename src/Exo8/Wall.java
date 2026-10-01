package Exo8;

public class Wall {
    private double width ;
    private double height ;

    Wall() {
        this.height = 0 ;
        this.width =  0 ;
    }

    Wall(int width  , int height) {
        if (height < 0) {
            this.height = 0;
        } else if (width < 0) {
            this.width = 0;
        }

        if (height > 0 && width > 0) {
            this.height = height;
            this.width = width;
        }
    }

    public double getWidth() {
        return this.width ;
    }

    public double getHeight() {
        return this.height ;
    }

    public void setWidth( double w) {
        if( w < 0) {
            this.width  =  0 ;
            return ;
        }
        this.width  =  w ;
    }

    public void setHeight(double h) {

        if ( h< 0) {
            this.height =  0 ;
            return  ;
        }

        this.height = h ;


    }


    public double getArea() {
        return this.width*this.height ;
    }
}
