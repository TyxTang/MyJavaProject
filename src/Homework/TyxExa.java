package Homework;

class TyxExa {
    static long fac(long n){
        long s = 1;
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        return s;
    }
    public static void main(String[] args) {
        long x = 5 , y;
        y = fac(x);
        System.out.println(y);
    }
}
