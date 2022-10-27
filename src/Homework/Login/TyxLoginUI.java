package Homework.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Homework.Login.TyxLoginInspection;

public class TyxLoginUI extends JFrame {
    private JLabel id;
    private JTextField idInput;
    private JLabel password;
    private JPasswordField passwordInput;
    private String passwordString;
    private JButton ok;
    public TyxLoginUI(){
        super("登录");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        id = new JLabel("用户名：");
        id.setHorizontalAlignment(SwingConstants.CENTER);
        idInput = new JTextField(8);
        password = new JLabel("密码：");
        password.setHorizontalAlignment(SwingConstants.CENTER);
        passwordInput = new JPasswordField(8);
        ok = new JButton("登录");
        JPanel idPan = new JPanel();
        idPan.add(id);
        idPan.add(idInput);
        c.add(idPan);
        JPanel passwordPan = new JPanel();
        passwordPan.add(password);
        passwordPan.add(passwordInput);
        c.add(passwordPan);
        passwordString = new String(passwordInput.getPassword());
        c.add(ok);
        ok.addActionListener(new handler());
        this.setSize(280, 150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    public String getId(){
        return idInput.getText();
    }
    public String getPassword(){
        return passwordString;
    }
    class handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            passwordString = new String(passwordInput.getPassword());
            TyxLoginInspection inspection = new TyxLoginInspection();
            if(inspection.login(getId(), getPassword())){
                TyxLoginSuccess success = new TyxLoginSuccess();
                dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "用户名或密码错误");
            }
        }
    }
    public static void main(String[] args) {
        TyxLoginUI login = new TyxLoginUI();
    }
}

