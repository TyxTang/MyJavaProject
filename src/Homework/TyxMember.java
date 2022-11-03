package Homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TyxMember extends JFrame {

    private JMenuBar menuBar;
    private JMenuBar menuBar_2;
    private JMenu menu;
    private JMenu menu_2;
    private JMenu member_add;
    private JMenu member_edit;
    private JMenu member_look;
    private JMenu member_delete;
    private JMenuItem menuItem;
    private JMenuBar menuBar1;
    public TyxMember(){
        super("员工基本信息管理");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        menuBar = new JMenuBar();
        menu = new JMenu("文件");
        menuBar.add(menu);
        member_add = new JMenu("添加员工信息");
        menu.add(member_add);
        member_edit = new JMenu("修改员工信息");
        menu.add(member_edit);
        member_look = new JMenu("查看员工信息");
        menu.add(member_look);
        member_delete = new JMenu("删除员工信息");
        menu.add(member_delete);

        menuBar_2 = new JMenuBar();
        menu_2 = new JMenu("退出");
        menuBar.add(menu_2);
        member_add = new JMenu("添加员工信息");
        menuItem = new JMenuItem("关闭");
        menu_2.add(menuItem);
        menuItem.addActionListener(new handler());
        this.setJMenuBar(menuBar);
        this.setSize(280, 150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    class handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }

    public static void main(String[] args) {
        TyxMember member = new TyxMember();
    }
}


