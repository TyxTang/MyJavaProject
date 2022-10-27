package optional;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TyxFontExp extends JFrame {
    private Font font;
    private JLabel lbl;
    private JComboBox jName,jSize;
    private String[] names= {"宋体","仿宋","黑体","方正舒体","隶书"};
    private String[] sizes= {"14","18","24","28","36","48"};
    private String fontName="宋体";
    private int fontSize=18;
    public TyxFontExp()
    {
        super("FontExp");
        Container c=getContentPane();
        c.setLayout(new BorderLayout());
        jName=new JComboBox(names);
        jSize=new JComboBox(sizes);
        jName.addItemListener(new handle());
        jSize.addItemListener(new handle());
        lbl=new JLabel("字体及大小样例");
        JPanel pal=new JPanel();
        pal.setLayout(new BorderLayout());
        pal.add(jName,BorderLayout.WEST);
        pal.add(jSize,BorderLayout.EAST);
        c.add(pal,BorderLayout.NORTH);
        c.add(lbl,BorderLayout.SOUTH);
        setSize(360,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        TyxFontExp TyxApp=new TyxFontExp();
        TyxApp.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    class handle implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == jName)
                fontName = names[jName.getSelectedIndex()];
            if (e.getSource() == jSize)
                fontSize = Integer.parseInt(sizes[jSize.getSelectedIndex()]);
            font = new Font(fontName, Font.PLAIN, fontSize);
            lbl.setFont(font);
        }
    }
}
