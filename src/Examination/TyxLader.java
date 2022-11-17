package Examination;


public class TyxLader {
    public static void main(String[] args) {
        Lader lader = new Lader(1,2,3);
        System.out.println("梯形的面积为：" + lader.area());
    }
}

class Lader{
    private static double updi;
    private static double downdi;
    private static double height;
    public Lader(double updi, double downdi, double height){
        this.updi = updi;
        this.downdi = downdi;
        this.height = height;
    }
    public static double area(){

        return (updi + downdi) * height / 2;
    }
}
