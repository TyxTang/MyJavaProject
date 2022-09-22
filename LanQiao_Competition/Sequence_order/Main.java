package Sequence_order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++){
            a[i] = input.nextInt();
        }
        for (int j = 0 ; j < n ; j++){
            for (int k = 0 ; k < n - j - 1 ; k++){
                if (a[k] > a[k+1]){
                    int temp = a[k];
                    a[k] = a[k+1];
                    a[k+1] = temp;
                }
            }
        }
        for (int l = 0 ; l < n ; l++){
            System.out.print(a[l] + " ");
        }
    }
}
