package Homework;

public class TyxShape {
    public static void main(String[] args) {
        Circle_1 shape_1 = new Circle_1(10.0);
        Rectangle shape_2 = new Rectangle(20, 30);
        System.out.println("圆的面积为：" + shape_1.getArea());
        System.out.println("矩形的面积为：" + shape_2.getArea());
    }
}

abstract class Shape {
    public abstract double getArea();
}

class Circle_1 extends Shape {
    private double r;
    public Circle_1(double r){
        this.r = r;
    }
    public double getArea(){
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
}