package Homework;

import java.util.Scanner;

class TyxMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int high = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个Java工程师的底薪：");
            a[i] = input.nextInt();
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] >= 6000) {
                high++;
                sum += a[j];
            }
        }
        System.out.println("高薪人员比例为：" + (double)high / a.length);
        System.out.println("高薪人员的底薪平均值为：" + (double)sum / high);
        input.close();
    }
}

