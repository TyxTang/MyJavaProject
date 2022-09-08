package Homework;

import java.util.Scanner;

class TyxSeries {
    public static void main (String[] args){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入a的值：");
        int a = input.nextInt();
        System.out.println("请输入n的值：");
        int n = input.nextInt();
        for (int i = 1; i <= n;i++){
            int c = 0;
            for (int j = 1; j <= i; j++) {
                c = c * 10 + a;
            }
            sum = sum + c;
        }
        System.out.println("和为：" + sum);
    }
}
