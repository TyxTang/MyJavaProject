package MySQL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class TyxSQLmember extends JFrame {
    JLabel n1=new JLabel("姓名");
    JLabel n2=new JLabel("工资");
    private TextField tx1;
    private TextField tx2;
    JButton b1=new JButton("查询");
    TyxSQLmember() {
        super("查询员工信息");
        this.setLayout(new FlowLayout());
        tx1=new TextField(20);
        add(n1);
        add(tx1);
        tx2=new TextField(20);
        add(n2);
        add(tx2);
        add(b1);
        b1.addActionListener(new Tyx());
        this.setSize(300,150);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String args[]) {
        new TyxSQLmember();
    }
    class Tyx implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Statement stmt=null;
            Connection con=null;
            ResultSet rs=null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            }
            catch(ClassNotFoundException m) {
                m.printStackTrace();
            }
            try{

                con= DriverManager.getConnection("jdbc:mysql://10.0.0.10/pay?useSSL=false&serverTimezone=UTC","TyxTang","root");
                stmt=con.createStatement();
                rs= ((Statement) stmt).executeQuery("select*from payuser");
                while(rs.next()) {
                    if(e.getSource()==b1) {

                        if(tx1.getText().equals(rs.getString("name"))) {
                            tx2.setText(rs.getString("salary"));
                        }

                    }
                    else {tx2.setText("你输入姓名有误");}
                }
                stmt.close();
                ((Connection) con).close();
                rs.close();
            }
            catch(SQLException k){
                System.out.println(k.getMessage());
            }
        }
    }
}
