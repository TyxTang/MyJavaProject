package Homework.Login;

import javax.swing.*;
import java.awt.*;

public class TyxLoginSuccess extends JFrame {
    public TyxLoginSuccess(){
        super("登录成功");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        JLabel success = new JLabel("登录成功");
        success.setFont(new Font("黑体", Font.PLAIN, 40));
        c.add(success);
        this.setSize(280, 100);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
