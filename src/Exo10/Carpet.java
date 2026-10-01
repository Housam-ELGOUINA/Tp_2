package Exo10;

public class Carpet {
    private double cost ;
    Carpet(double cost) {
        if ( cost < 0) {
            this.cost =  0 ;
            return  ;
        }

        this.cost =  cost ;
    }

    public double getCost() {
        return this.cost ;
    }



}
