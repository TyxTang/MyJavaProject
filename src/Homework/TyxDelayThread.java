package Homework;


public class TyxDelayThread extends Thread {
    private static int count = 0;
    private int no;
    private int delay;
    public TyxDelayThread(int delay) {
        this.delay = delay;
        no = count++;
    }
    public void run(){
        try{
            for(int i = 0; i < 10; i++){
                delay = (int)(Math.random() * 1000);
                Thread.sleep(delay);
                System.out.println("Thread " + no + " with a delay " + delay);
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class MyThread{
    public static void main(String[] args) {
        TyxDelayThread t1 = new TyxDelayThread(1000);
        TyxDelayThread t2 = new TyxDelayThread(1000);
        t1.start();
        t2.start();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
}



