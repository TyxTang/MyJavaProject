package Homework;

import java.util.Scanner;

public class TyxFloatDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s =input.nextLine();
        double d = Double.parseDouble(s);
        System.out.println(d + "整数的部分为" + (long)d);
    }
}
