package java_week8_hw_komal.Cylinder;

public class Cylinder extends Circle {

    double height;

    Cylinder(double r, double h){
        super(r);
        this.height = h > 0? h: 0;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){

        return this.height * this.radius;
    }
}
