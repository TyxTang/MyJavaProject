package Homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class TyxCalculator extends Frame {
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    private TextField num1;
    private TextField num2;
    private TextField result;
    public TyxCalculator(){
        super("计算器");
        this.setLayout(new FlowLayout());
        num1 = new TextField(5);
        num2 = new TextField(5);
        result = new TextField(5);
        plus = new Button("+");
        minus = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");
        this.add(new Label("NO.1数"));
        this.add(num1);
        this.add(new Label("NO.2数"));
        this.add(num2);
        this.add(new Label("结果"));
        this.add(result);
        this.add(plus);
        this.add(minus);
        this.add(multiply);
        this.add(divide);
        this.setLocationRelativeTo(null);
        plus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                result.setText(String.valueOf(a + b));
            }
        });
        minus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                result.setText(String.valueOf(a - b));
            }
        });
        multiply.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                result.setText(String.valueOf(a * b));
            }
        });
        divide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                result.setText(String.valueOf(a / b));
            }
        });
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        this.setSize(148, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        TyxCalculator calculator = new TyxCalculator();
    }

}


