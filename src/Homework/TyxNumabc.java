package Homework;

import java.util.Scanner;

class TyxNumabc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ZFC = input.nextLine();
        int num = 0;
        int abc = 0;
        int other = 0;
        for (int i = 0; i < ZFC.length(); i++) {
            char ch = ZFC.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                abc++;
            } else {
                other++;
            }
        }
        System.out.println("数字的个数为：" + num);
        System.out.println("字母的个数为：" + abc);
        System.out.println("其他字符的个数为：" + other);
    }
}
