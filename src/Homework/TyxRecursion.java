package Homework;

import java.util.Scanner;

class Recursion{
    static long outRecursion(int n , int a){
        if (a == 0) {
            return 1;
        } else {
            return n * outRecursion(n, a - 1);
        }
    }
}

class TyxRecursion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入x：");
        int x = input.nextInt();
        System.out.println("请输入n：");
        int n = input.nextInt();
        System.out.println(x + "的" + n + "次方为：" + Recursion.outRecursion(x, n));
        input.close();
    }
}
