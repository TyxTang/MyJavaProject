package Homework;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TyxEmployeeInformation extends Frame {
    TextField ID = new TextField(20);
    TextField name = new TextField(5);
    TextField birthday = new TextField(5);
    TextField sex = new TextField(3);
    TextField home = new TextField(18);
    TextField address = new TextField(18);
    TextField number = new TextField(5);
    Button operate =  new Button("操作");
    Button exit = new Button("退出");
    public  TyxEmployeeInformation() {
        super("公司职员信息");
        this.setLayout(new FlowLayout());
        this.add(new Label("身份证号码"));
        this.add(ID);
        this.add(new Label("姓名"));
        this.add(name);
        this.add(new Label("性别"));
        this.add(sex);
        this.add(new Label("出生日期"));
        this.add(birthday);
        this.add(new Label("籍贯"));
        this.add(home);
        this.add(new Label("居住地"));
        this.add(address);
        this.add(new Label("职工号"));
        this.add(number);
        this.add(operate);
        this.add(exit);
        this.pack();
        operate.addActionListener(new ActionListener1());
        exit.addActionListener(new ActionListener1());
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    class ActionListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource () == operate){
                ID.setText (" ");
                name.setText (" ");
                birthday.setText (" ");
                sex.setText (" ");
                home.setText (" ");
                address.setText (" ");
                number.setText (" ");
            }
            else if (e.getSource () == exit) {
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        TyxEmployeeInformation Do = new TyxEmployeeInformation();
    }
}
