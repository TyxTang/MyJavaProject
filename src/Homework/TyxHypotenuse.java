package Homework;

import java.util.Scanner;

class TyxHypotenuse {
    public static void main(String[] args) {
        System.out.println("请输入第一边长度");
        Scanner input = new Scanner(System.in);
        double First = input.nextDouble();
        System.out.println("请输入第二边长度");
        double Second = input.nextDouble();
        double c = Math.sqrt(First * First + Second * Second);
        System.out.println("斜边长为：" + c);
    }
}
