package Homework;

public class TyxPoint {
    public static void main(String[] args) {
        //建立若干个Cylinder其类对象，输出其轴心位置坐标、半径和高及其体积的值
        Cylinder c1 = new Cylinder(1, 2, 3, 4 );
        Cylinder c2 = new Cylinder(6, 7, 8, 9);
        System.out.println("c1的轴心位置坐标为：" + c1.x + "," + c1.y );
        System.out.println("c1的半径为：" + c1.r);
        System.out.println("c1的高为：" + c1.h);
        System.out.println("c1的体积为：" + c1.getVolume());
        System.out.println();
        System.out.println("c2的轴心位置坐标为：" + c2.x + "," + c2.y );
        System.out.println("c2的半径为：" + c2.r);
        System.out.println("c2的高为：" + c2.h);
        System.out.println("c2的体积为：" + c2.getVolume());
    }
}

class Point{
    protected int x;
    protected int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Circle extends Point{
    protected int r;
    public Circle(int x, int y, int r){
        super(x, y);
        this.r = r;
    }
    public int getR(){
        return r;
    }
    public double getArea(){
        return Math.PI * r * r;
    }
}

class Cylinder extends Circle{
    protected int h;
    public Cylinder(int x, int y, int r, int h){
        super(x, y, r);
        this.h = h;
    }
    public int getH(){
        return h;
    }
    public double getVolume(){
        return getArea() * h;
    }
}
