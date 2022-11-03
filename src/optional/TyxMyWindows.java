package optional;

import javax.swing.*;
import java.awt.*;


public class TyxMyWindows extends JFrame {
    JLabel[] label;
    public TyxMyWindows() {
        label=new JLabel[4];
        Container c=getContentPane();
        c.setLayout(new GridLayout(2,2,20,20));
        for(int i=0;i<4;i++) {
            label[i]=new JLabel(" 标签  "+(i+1));
            c.add(label[i]);
        }
        setSize(100,100);
        setVisible(true);;
        this.setLocationRelativeTo(null);
    }
}
class WindowThread extends Thread{
    int j,time;
    TyxMyWindows myWindow;
    public WindowThread(TyxMyWindows myWindow, int j, int time) {
        this.myWindow=myWindow;
        this.j=j;
        this.time=time;
    }

    public void run() {
        while(true)
            try {
                myWindow.label[j].setVisible(true);
                Thread.sleep(time);
                myWindow.label[j].setVisible(false);
                Thread.sleep(time);
            }
            catch(InterruptedException e) { }
    }
    public static void main(String[] args) {
        TyxMyWindows myWindow=new TyxMyWindows();
        WindowThread w1=new WindowThread(myWindow,0,5000);
        WindowThread w2=new WindowThread(myWindow,1,6000);
        WindowThread w3=new WindowThread(myWindow,2,3000);
        WindowThread w4=new WindowThread(myWindow,3,4000);
        w1.start();
        w2.start();
        w3.start();
        w4.start();
    }
}