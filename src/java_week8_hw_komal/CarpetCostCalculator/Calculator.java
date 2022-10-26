package java_week8_hw_komal.CarpetCostCalculator;

public class Calculator {

    Floor floor;
    Carpet carpet;

    Calculator(Floor f, Carpet c){

        this.floor = f;
        this.carpet = c;
    }

    public double getTotalCost(){

        return this.floor.getArea() * this.carpet.getCost();
    }


}
