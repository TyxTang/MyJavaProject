package Homework;

import java.util.Scanner;

class CircleArea {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double r = Input.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("圆的面积为：" + area);
    }
}

