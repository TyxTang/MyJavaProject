package Homework;

import java.util.Scanner;

class TyxSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0 ; i < a.length; i++){
            a[i] = input.nextInt();
        }
        for(int j = 0 ; j < (a.length/2); j++)
        {
            int temp = a[j];
            a[j] = a[a.length - 1 - j];
            a[a.length - 1 - j] = temp;
        }
        for (int n = 0;n <a.length;n++){
            System.out.print(a[n] + " ");
        }
        input.close();
    }
}

