package Homework;

import java.util.Scanner;
class TyxTwod_Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入行数与列数：");
        int han = input.nextInt();
        int line = input.nextInt();
        int a[][] = new int[han][line];
        int b[][] = new int[han][line];
        System.out.println("请输入数组a的数值：");
        for (int i = 0; i < han; i++) {
            for (int j = 0; j < line; j++) {
                a[i][j] = input.nextInt();
            }
        }
        b = a ;
        for (int k = 0; k < b.length; k++) {
            for (int l = 0; l < b[k].length; l++) {
                System.out.print(b[k][l] + " ");
            }
            System.out.println();
        }
    }

}
