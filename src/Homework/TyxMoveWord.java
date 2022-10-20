package Homework;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TyxMoveWord  extends Frame {
    private TextArea eastArea = new TextArea(7, 20);
    private TextArea westArea = new TextArea(7, 20);
    private Button toLeft = new Button("左");
    private Button toRight = new Button("右");

    public TyxMoveWord() {
        super("移动单词");
        this.setLayout(new FlowLayout());
        this.add(westArea);
        Panel pal = new Panel();
        pal.setLayout(new GridLayout(2, 1, 10, 10));
        pal.add(toLeft);
        pal.add(toRight);
        toLeft.addActionListener(new Handler());
        toRight.addActionListener(new Handler());
        this.add(pal);
        this.add(eastArea);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(400, 200);
        setVisible(true);
        this.setLocationRelativeTo(null);
    }

    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String copyText = "";
            if (e.getSource() == toLeft) {
                copyText = eastArea.getSelectedText();
                westArea.append(copyText);
            } else {
                copyText = westArea.getSelectedText();
                eastArea.append(copyText);
            }
        }
    }
    public static void main(String[] args) {
        TyxMoveWord word = new TyxMoveWord();
    }
}
