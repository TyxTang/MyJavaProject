package Homework;

import java.util.Scanner;
class TyxMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        switch (month) {
            case 1:
                System.out.println("一月份有31天");
                break;
            case 2:
                System.out.println("二月份有28天或29天");
                break;
            case 3:
                System.out.println("三月份有31天");
                break;
            case 4:
                System.out.println("四月份有30天");
                break;
            case 5:
                System.out.println("五月份有31天");
                break;
            case 6:
                System.out.println("六月份有30天");
                break;
            case 7:
                System.out.println("七月份有31天");
                break;
            case 8:
                System.out.println("八月份有31天");
                break;
            case 9:
                System.out.println("九月份有30天");
                break;
            case 10:
                System.out.println("十月份有31天");
                break;
            case 11:
                System.out.println("十一月份有30天");
                break;
            case 12:
                System.out.println("十二月份有31天");
                break;
        }
        input.close();
    }
}
