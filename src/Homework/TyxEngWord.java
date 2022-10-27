package Homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TyxEngWord extends JFrame {
    private int index ;
    private String word;
    private String guessedWord;
    private String character;
    private String[] words = {"China", "study", "program", "desk", "room", "computer", "tree"};
    private String[] characters = {"中国", "学习", "程序", "桌子", "房间", "电脑", "树"};
    private JLabel lbll, lbl2;
    private JTextField input;
    public TyxEngWord(){
        super("背单词");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        lbll = new JLabel("英文单词");
        lbl2 = new JLabel("输入英文单词");
        input = new JTextField(10);
        c.add(lbll);
        c.add(input);
        c.add(lbl2);
        input.addActionListener(new Handler());
        create();
        this.setSize(250,150);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String inputWord = input.getText();
            if(inputWord.equals(word)) {
                JOptionPane.showMessageDialog(null, "正确");
                create();
                input.setText("");
            }
            else {
                JOptionPane.showMessageDialog(null, "错误");
                input.setText("");
            }
        }
    }
    public void create() {
        index = (int)(Math.random() * words.length);
        word = words[index];
        character = characters[index];
        lbll.setText(character);
    }

    public static void main(String[] args) {
        TyxEngWord word = new TyxEngWord();
        word.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

