package Homework;

class TyxCompleteNumber {
    public static void main(String[] args) {
        int i, j, sum;
        for (i = 1; i <= 100; i++) {
            sum = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i + " ");
            }
        }
    }
}
