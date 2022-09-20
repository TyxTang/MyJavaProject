package Homework;

import java.util.Scanner;

class TyxRice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入20为同学的评价：");
        int[] a = new int[20];
        for (int i =0; i < a.length; i++){
            a[i] = input.nextInt();
        }
        int break_if = 0;
        int sum_1 = 0;
        int sum_2 = 0;
        int sum_3 = 0;
        int sum_4 = 0;
        int sum_5 = 0;
        for(int j = 0;break_if == 0;j++){
            if(a[j] == 1){
                sum_1++;
            }
            if(a[j] == 2){
                sum_2++;
            }
            if(a[j] == 3){
                sum_3++;
            }
            if(a[j] == 4){
                sum_4++;
            }
            if(a[j] == 5){
                sum_5++;
            }
            if(j == a.length - 1){
                break_if = 1;
            }
        }
        System.out.println("1分的人数为：" + sum_1);
        System.out.println("2分的人数为：" + sum_2);
        System.out.println("3分的人数为：" + sum_3);
        System.out.println("4分的人数为：" + sum_4);
        System.out.println("5分的人数为：" + sum_5);
    }
}
