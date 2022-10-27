package optional;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TyxInf extends JFrame {
    private JComboBox list;
    private JTextArea info;
    private String names[] =
            {"请选择要查询的商品名称",
                    "Linux程序设计(第3版)",
                    "windows 核心编程",
                    "操作系统概念(第六版 翻译版)",
                    "UNIX 技术手册(第三版)",
                    "计算机操作系统",
                    "Linux系统开发员"
            };
    private String infos[][] = {
            {"", "", ""},
            {"Linux程序设计(第3版)", "人民邮电出版社", "￥89.00"},
            {"Windows核心编程", "机械工业出版社", "￥86.00"},
            {"操作系统概念(第六版 翻译版)", "高等教育出版社", "￥55.00"},
            {"UNIX 技术手册(第三版)", "中国电力出版社", "￥69.00"},
            {"计算机操作系统", "清华大学出版社", "￥21.00"},
            {"Linux系统开发员", "机械工业出版社", "￥23.00"}
    };

    public TyxInf() {
        super("Information of merchandise");
        Container pane = this.getContentPane();
        pane.setLayout(new BorderLayout());
        list = new JComboBox(names);
        info = new JTextArea(5, 20);
        pane.add(list, BorderLayout.NORTH);
        pane.add(info, BorderLayout.CENTER);
        list.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int index = list.getSelectedIndex();
                info.setText("商品名:" + infos[index][0] + "\n");
                info.append("出版社: " + infos[index][1] + "\n");
                info.append("市场价:" + infos[index][2] + "\n");
            }
        });
        this.setSize(400, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        {
            TyxInf information = new TyxInf();
            information.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }
    }
}
