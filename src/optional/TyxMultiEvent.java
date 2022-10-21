package optional;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TyxMultiEvent extends Frame {
    private WindowHandler handler = new  WindowHandler();
    public TyxMultiEvent() {
        super("MultiEvent");
        setLayout(new FlowLayout());
        addKeyListener(new KeyHandler());
        addWindowListener(handler);
        this.add(new Label("正在检测键盘输入内容"));
        this.add(new Label("按下 空格 结束程序"));
        this.setLocationRelativeTo(null);
        setSize(250,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        TyxMultiEvent Do = new TyxMultiEvent();
    }
    class KeyHandler implements KeyListener {
        public void keyPressed(KeyEvent e) {
            if(e.getKeyChar() == ' ') {
                System.exit(0);
            }
        }
        public void keyReleased(KeyEvent e) {
            
        }
        public void keyTyped(KeyEvent e) {
            System.out.println(e.getKeyChar() + " is pass!");
        }
    }
}
class WindowHandler implements WindowListener {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    public void windowClosed (WindowEvent e) {

    }
    public void windowActivated (WindowEvent e) {

    }
    public void windowDeactivated (WindowEvent e) {

    }
    public void windowIconified (WindowEvent e) {

    }
    public void windowDeiconified (WindowEvent e) {

    }
    public void windowOpened (WindowEvent e) {

    }
}
