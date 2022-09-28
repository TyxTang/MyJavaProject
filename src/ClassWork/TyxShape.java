package ClassWork;

import java.util.Scanner;

public class TyxShape {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入长方形的长：");
        double length_1 = input.nextDouble();
        System.out.println("请输入长方形的宽：");
        double width_1 = input.nextDouble();
        Square square = new Square(length_1, width_1);
        System.out.println("正方形的面积为：" + square.area());
    }
}

abstract class Shape{
    private double length;
    private double width;
    public abstract double area();
    public Shape(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
}

class Square extends Shape{
    public Square(double length, double width){
        super(length, width);
    }
    public double area(){
        return getArea();
    }
}


