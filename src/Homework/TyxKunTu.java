package Homework;

import java.util.Scanner;
public class TyxKunTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入脚数：");
        int f = input.nextInt();
        System.out.println("请输入头数：");
        int h = input.nextInt();
        int j = (4 * h - f) / 2;
        int t = h - j;
        System.out.println("鸡的数量为：" + j);
        System.out.println("兔的数量为：" + t);
    }
}
