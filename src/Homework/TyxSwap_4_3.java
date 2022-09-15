package Homework;

import java.util.Scanner;

class Swap_4_3 {
    static void swap(int x , int y ){
        int temp = x;
        x = y;
        y = temp;
        System.out.println("在swap（）方法中，x的值为：" + x + "，y的值为：" + y);
    }
}

class TyxSwap_4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("使用swap（）方法前，x的值为：" + x + "，y的值为：" + y);
        Swap_4_3.swap(x, y);
        System.out.println("使用swap（）方法后，x的值为：" + x + "，y的值为：" + y);
    }
}
