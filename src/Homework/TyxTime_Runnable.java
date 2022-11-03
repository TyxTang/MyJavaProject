package Homework;


public class TyxTime_Runnable implements Runnable {
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
        TyxTime_Runnable t1 = new TyxTime_Runnable();
        Thread thread = new Thread(t1);
        thread.start();
    }
}


