package Homework;

import java.util.Scanner;

public class TyxScoreExpertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int n = input.nextInt();
        if(n < 0){
            throw new IllegalArgumentException("输入错误！学生人数不能为负！");
        }
        int[] score = new int[n];
        System.out.println("请输入学生成绩：");
        for (int i = 0; i < n; i++) {
            score[i] = input.nextInt();
        }
        try {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + score[i];
            }
            System.out.println("平均成绩为：" + sum / n);
        } catch (ArithmeticException e1) {
            System.out.println(e1.toString() + "  : 输入错误！学生人数不能为0！");
            System.exit(404);
        }
        try {
            System.out.println("请输入要显示第几个学生的成绩：");
            int m = input.nextInt();
            System.out.println("该学生的成绩为：" + score[m - 1]);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2.toString() + "  : 输入错误！选择的学生超出范围！");
            System.exit(666);
        }
    }
}