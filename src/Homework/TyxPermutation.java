package Homework;

class Permutation{
    static long p(int n, int k ){
        return (f(n)/f(n-k));
    }
    static long f(int n){
        long f = 1;
        while(n>1){
            f = f * n--;
        }
        return f;
    }
}

class TyxPermutation {
    public static void main(String[] args){
        for (int i = 0;i < 5 ; i++){
            for (int j = 1;j <=i; j++){
                System.out.print("p(" + i + "," + j + ")=" + Permutation.p(i, j) + "\t");
            }
            System.out.println();
        }
    }
}
