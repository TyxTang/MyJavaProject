package optional;


public class TyxZHInumber extends Thread{
    int st,en,count = 0;
    TyxZHInumber(int m, int n){
        this.st = m;
        this.en = n;
    }
    public void run() {
        for(int m = st; m <= en; m++) {
            boolean isPrime = true;
            for(int i = 2;i < m; i++)
                if(m % i == 0){
                    isPrime = false;
                    break;
                }
            if(isPrime) count++;
        }
        System.out.println(st+"~"+en+"之间一共有 "+count+" 个质数");
    }
    public static void main(String[] args) {
        TyxZHInumber thread1 = new TyxZHInumber(2,100000);
        TyxZHInumber thread2 = new TyxZHInumber(100000,200000);
        thread1.start();
        thread2.start();
    }
}