package Exo10;

public class Calculator {
    private Floor floor ;
    private Carpet carpet ;

    Calculator(Floor f , Carpet c ) {
        this.floor = f ;
        this.carpet  = c ;
    }

    public double getTotalCost() {
        return this.carpet.getCost()*this.floor.getArea() ;
    }
}
