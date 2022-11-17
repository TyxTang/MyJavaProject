package Examination;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TyxFac extends JFrame {
    private JLabel lbl1, lbl2;
    private JTextField input, output;
    public TyxFac(){
        super("Tyx的JTextField组件实例");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        lbl1 = new JLabel("输入一个正整数");
        lbl2 = new JLabel("该数的阶乘值为");
        input = new JTextField(10);
        output = new JTextField(10);
        c.add(lbl1);
        c.add(input);
        c.add(lbl2);
        c.add(output);
        input.addActionListener(new Handler());
        this.setSize(450,80);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int fac = 1;
            int num = Integer.parseInt(input.getText());
            for (int i = 1; i <= num; i++) {
                fac *= i;
            }
            output.setText(String.valueOf(fac));
        }
    }
    public static void main(String[] args) {
        TyxFac fac = new TyxFac();
        fac.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
