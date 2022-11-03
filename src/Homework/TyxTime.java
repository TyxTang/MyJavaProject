package Homework;

public class TyxTime extends Thread {
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
                System.out.println("当前时间为：" + java.time.LocalDateTime.now());

            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        TyxTime t1 = new TyxTime();
        t1.start();
    }
}
