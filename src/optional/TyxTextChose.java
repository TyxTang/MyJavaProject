package optional;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TyxTextChose extends Frame{
    private Button doChoose=new Button("添加选定文本");
    private TextArea eastArea=new TextArea(4,10);
    private TextArea westArea=new TextArea(4,10);
    public TyxTextChose() {
        super("挑单词");
        this.setLayout(new BorderLayout());
        this.add(westArea, BorderLayout.WEST);
        this.add(eastArea,BorderLayout.EAST);
        this.add(doChoose,BorderLayout.SOUTH);
        doChoose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String copyText=westArea.getSelectedText();
                eastArea.append(copyText);
            }
        });
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(300,200);
        setVisible(true);
    }
    public static void main(String args[]) {
        TyxTextChose word=new TyxTextChose();
    }
}
