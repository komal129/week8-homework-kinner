package java_week8_hw_komal.CarpetCostCalculator;

public class Carpet {

    double cost;

    Carpet(double c){

        this.cost =  0;
        if (c > 0){
            this.cost = c;
        }
    }

    public double getCost(){

        return this.cost;
    }
}
