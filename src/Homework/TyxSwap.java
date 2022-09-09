package Homework;

class TyxSwap {
    static void swap(int a,int b){
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        int a = 6, b = 3;
        swap(a, b);
    }
}
