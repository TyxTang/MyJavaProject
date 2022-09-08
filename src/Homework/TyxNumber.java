package Homework;

import java.util.Scanner;

class TyxNumber {
    public static void main (String[] args) {
        System.out.println("请输入一个正整数");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a;
        int c = a /10;
        int count = 0;
        while (b != 0) {
            b = b / 10;
            count++;
        }
        System.out.println("位数为：" + count);

        System.out.println("逆序为：");
        for (int i = 0; i < count; i++) {
            System.out.print(a % 10);
            System.out.print(' ');
            a = a / 10;
        }
    }
}
