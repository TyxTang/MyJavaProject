package Homework;

import java.util.Scanner;

class TyxDemo2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个双精度数：");
        double a = input.nextDouble();
        System.out.println("请输入第二个双精度数：");
        double b = input.nextDouble();
        System.out.println("请输入第三个双精度数：");
        double c = input.nextDouble();
        double average = (a + b + c) / 3;
        System.out.println("平均值为：" + average);
    }
}
