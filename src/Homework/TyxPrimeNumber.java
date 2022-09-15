package Homework;


import java.util.Scanner;

class PrimeNumber {
    static boolean Prime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
class TyxPrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = input.nextInt();
        if (PrimeNumber.Prime(n)) {
            System.out.println(n + " 是素数");
        } else {
            System.out.println(n + " 不是素数");
        }
    }
}
