package Homework;

import java.util.Scanner;

class Fibonacci{
    static void outFibonacci(){
        int a1 = 1;
        int a2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入输出的位数：");
        int n = input.nextInt();
        System.out.println("Fibonacci数列:");
        for (int i = 0; i < n; i++) {
            System.out.print(a1 + " ");
            int temp = a1;
            a1 = a2;
            a2 = temp + a2;
        }
    }
}

class TyxFibonacci {
    public static void main(String[] args){
        Fibonacci.outFibonacci();
    }
}
