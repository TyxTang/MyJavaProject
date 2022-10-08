package FinallWork;

public class TyxAreaDemo {
    public static void main(String[] args) {
        Circle c = new Circle(0);
        System.out.println("Circle Area=" + c.calArea(3.5));
    }
}


interface Area {
    double PI = Math.PI;
    double calArea(double r);
}

class Circle implements Area{
    double r;
    Circle(double r){
        this.r = r;
    }
    public double calArea(double r){
        return r * r * PI;
    }
}
