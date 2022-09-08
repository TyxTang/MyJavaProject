package Homework;

import java.util.Scanner;
class TyxPrime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long value = 0;
        System.out.println("请输入一个数：");
        value = input.nextLong();
        for (int i = 2; i <= value; i++) {
            if(value % i == 0) {
                System.out.print(i + " ");
                while(value % i == 0) {
                    value = value / i;
                }
            }
        }
        input.close();
    }
}
