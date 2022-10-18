package optional;

import java.io.*;

public class TyxFileStudent {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\grade.txt"));
            String s;
            while (true) {
                System.out.println("输入姓名");
                s = br.readLine();
                if (s.length() == 0) break;
                bw.write(s);
                bw.newLine();
                System.out.println("输入学号");
                s = br.readLine();
                bw.write(s);
                bw.newLine();
                System.out.println("输入成绩");
                s = br.readLine();
                bw.write(s);
                bw.newLine();
            }
            br.close();
            bw.close();
            int max = 0, min = 100, total = 0, num = 0;
            BufferedReader bf = new BufferedReader(new FileReader("E:\\grade.txt"));
            while (true) {
                String ss = bf.readLine();
                if (ss == null) {
                    break;
                }
                ss = bf.readLine();
                ss = bf.readLine();
                int grade = Integer.parseInt(ss);
                total += grade;
                num += 1;
                if (grade > max) max = grade;
                if (grade < min) min = grade;
            }
            System.out.println("学生成绩中最高为：" + max + ",最低为：" + min + ",平均值为：" + total * 1.0 / num);
            bf.close();
        } catch (FileNotFoundException fe) {
            System.out.println(fe.toString());
        } catch (IOException ie) {
            System.out.println(ie.toString());
        }
    }
}
