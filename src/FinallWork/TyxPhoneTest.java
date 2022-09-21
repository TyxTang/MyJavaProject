package FinallWork;

import java.util.Scanner;

class Scan{
    static Scanner input = new Scanner(System.in);
}

class TyxPhoneTest {
    public static void main(String[] args) {
        Input.In();
        System.out.println("选择测试功能");
        System.out.println("1.测试手机属性");
        System.out.println("2.测试电话功能");
        System.out.println("3.测试游戏功能");
        System.out.print("你的选择是：");
        int n = Scan.input.nextInt();
        switch (n){
            case 1:
                Phone.about();
                break;
            case 2:
                Phone.call(Scan.input.nextInt());
                break;
            case 3:
                Phone.playGame();
                break;
        }
    }
}

class Input{
    public static void In() {
        Phone.brand = "Apple";
        Phone.price = 12999;
        Phone.type = "iPhone 14 pro max 1TB";
        Phone.os = "iOS 16";
        Phone.memory = "128G";
    }
}

class Phone{
    static String brand;
    static String type;
    static int price;
    static String os;
    static String memory;
    static void about(){
        System.out.println();
        System.out.println("品牌：" + brand);
        System.out.println("型号：" + type);
        System.out.println("价格：" + price);
        System.out.println("操作系统：" + os);
        System.out.println("内存：" + memory);
    }
    static void call(int no){
        switch (no){
            case 1:
                System.out.println("打电话给爷爷");
                break;
            case 2:
                System.out.println("打电话给奶奶");
                break;
            case 3:
                System.out.println("打电话给爸爸");
                break;
            case 4:
                System.out.println("打电话给妈妈");
                break;
        }
    }
    static void playGame(){
        System.out.println("玩猜字游戏");
    }
}

