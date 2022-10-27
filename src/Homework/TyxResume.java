package Homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TyxResume extends JFrame {
    private JLabel name;
    private JTextField nameInput;
    private JLabel sex;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup sexSelect;
    private JLabel provinceLab;
    private String province[] = {"北京市", "天津市", "河北省", "山西省", "内蒙古自治区", "辽宁省", "吉林省", "黑龙江省", "上海市", "江苏省", "浙江省", "安徽省", "福建省", "江西省", "山东省", "河南省", "湖北省", "湖南省", "广东省", "广西壮族自治区", "海南省", "重庆市", "四川省", "贵州省", "云南省", "西藏自治区", "陕西省", "甘肃省", "青海省", "宁夏回族自治区", "新疆维吾尔自治区", "台湾省", "香港特别行政区", "澳门特别行政区"};
    private JComboBox provinceBox;
    private JLabel degreeLab;
    private String degree[] = {"小学", "初中", "高中", "大学", "研究生", "博士"};
    private JComboBox degreeList;
    private JButton ok, cancel;
    private String[] str = new String[5];
    private String output = "";
    private JTextArea txa;
    public TyxResume(){
        super("简历");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        name = new JLabel("姓名：");
        name.setHorizontalAlignment(SwingConstants.CENTER);
        nameInput = new JTextField(8);
        sex = new JLabel("性别：");
        sex.setHorizontalAlignment(SwingConstants.CENTER);
        male = new JRadioButton("男",true);
        female = new JRadioButton("女",false);
        sexSelect = new ButtonGroup();
        sexSelect.add(male);
        sexSelect.add(female);
        provinceLab = new JLabel("籍贯：");
        provinceLab.setHorizontalAlignment(SwingConstants.CENTER);
        provinceBox = new JComboBox(province);
        degreeLab = new JLabel("学历：");
        degreeLab.setHorizontalAlignment(SwingConstants.CENTER);
        degreeList = new JComboBox(degree);
        ok = new JButton("确定");
        cancel = new JButton("取消");
        txa = new JTextArea(5, 20);
        JPanel namePan = new JPanel();
        namePan.add(name);
        namePan.add(nameInput);
        c.add(namePan);
        JPanel sexPan = new JPanel();
        sexPan.add(sex);
        sexPan.add(male);
        sexPan.add(female);
        c.add(sexPan);
        JPanel provincePan = new JPanel();
        provincePan.add(provinceLab);
        provincePan.add(provinceBox);
        c.add(provincePan);
        JPanel degreePan = new JPanel();
        degreePan.add(degreeLab);
        degreePan.add(degreeList);
        c.add(degreePan);
        JPanel buttonPan = new JPanel();
        buttonPan.add(ok);
        buttonPan.add(cancel);
        ok.addActionListener(new Handle1());
        cancel.addActionListener(new Handle1());
        c.add(buttonPan);
        c.add(txa);
        this.setSize(350, 280);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    private class Handle1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == ok) {
                str[0] = "姓名：" + nameInput.getText();
                if (male.isSelected()) {
                    str[1] = "性别：男";
                } else {
                    str[1] = "性别：女";
                }
                str[2] = "籍贯：" + provinceBox.getSelectedItem();
                str[3] = "学历：" + degreeList.getSelectedItem();
                output = "";
                for (int i = 0; i < 4; i++) {
                    output = output + str[i] + "\n";
                    txa.setText(output);
                }
                if(e.getSource() == cancel){
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        TyxResume resume = new TyxResume();
        resume.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
