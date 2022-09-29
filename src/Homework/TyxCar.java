package Homework;

import java.util.Scanner;

public class TyxCar {
    public static void main(String[] args) {
        System.out.println("请输入要租赁的天数：");
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        System.out.println("请输入要租赁的汽车品牌（1.宝马  2.别克）:");
        int brand = input.nextInt();
        switch (brand){
            case 1:
                System.out.println("1.550i\n请输入要租赁的汽车型号：");
                int type = input.nextInt();
                switch (type){
                    case 1:
                        Car bmw = new Car("宝马", "550i");
                        System.out.println("\n" + bmw.printInfo());
                        System.out.println("顾客您好！您需要支付的租赁费用为" + bmw.calRent(days) + "元");
                        break;
                    default:
                        System.out.println("输入错误");
                }
                break;
            case 2:
                System.out.println("1.商务舱GL8  2.林荫大道\n请输入要租赁的汽车型号：");
                int type_2 = input.nextInt();
                switch (type_2){
                    case 1:
                        Car bie_GL = new Car("别克", "商务舱GL8");
                        System.out.println("\n" + bie_GL.printInfo());
                        System.out.println("顾客您好！您需要支付的租赁费用为" + bie_GL.calRent(days) + "元");
                        break;
                    case 2:
                        Car bie = new Car("别克", "林荫大道");
                        System.out.println("\n" + bie.printInfo());
                        System.out.println("顾客您好！您需要支付的租赁费用为" + bie.calRent(days) + "元");
                        break;
                    default:
                        System.out.println("输入错误");
                }
                break;
        }
    }
}

class MotoVehicle{
    private String brand;
    public MotoVehicle(String brand){
        this.brand = brand;
    }
    public String printInfo(){
        return brand;
    }
    public int calRent(int days){
        return days;
    }
}

class Car extends MotoVehicle{
    private String type;
    public Car(String brand, String type){
        super(brand);
        this.type = type;
    }
    public String printInfo(){
        return "品牌： " + super.printInfo() + "\n型号： " + type;
    }
    public int calRent(int days){
        switch (super.printInfo()){
            case "宝马":
                return days * 600;
            case "别克":
                switch (type){
                    case "商务舱GL8":
                        return days * 750;
                    case "林荫大道":
                        return days * 500;
                }
            default:
                return 0;
        }
    }
}
