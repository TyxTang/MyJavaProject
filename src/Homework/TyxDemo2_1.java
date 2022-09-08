package Homework;

import java.util.Scanner;

class TyxDemo2_1 {
    public static void main(String[] args) {
        System.out.println("请输入圆柱体的半径r");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        System.out.println("请输入圆柱体的高h");
        double h = input.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.println("圆柱体的体积为：" + volume);
    }
}
