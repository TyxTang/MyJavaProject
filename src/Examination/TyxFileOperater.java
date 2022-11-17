package Examination;

import java.io.*;

public class TyxFileOperater {
    private static File file;
    private static FileReader fread;
    private static BufferedReader bread;
    private static FileWriter fwrite;
    private static BufferedWriter writefile;
    private static BufferedReader keyread;

    private static void writeFile() throws Exception {
        String s;
        for (int i = 0; i < 5; i++) {
            System.out.print("输入第"+ (i+1) + "个整数：");
            System.out.flush();
            s = keyread.readLine();
            if (s.length() == 0)
                break;
            writefile.write(s);
            writefile.newLine();
        }
    }

    private static void readFile() throws Exception {
        int[] num = new int[5];
        String s = bread.readLine();
        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(s);
            s = bread.readLine();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.println("去掉最大值和最小值后其它3个数的平均值为：" + ( num[1] + num[2] + num[3] ) / 3);
    }

    public static void main(String[] args) throws Exception {
        String filename = null;
        file = new File("E://num.txt");
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }
        fwrite = new FileWriter(file);
        writefile = new BufferedWriter(fwrite);
        keyread = new BufferedReader(new InputStreamReader(System.in));
        writeFile();
        keyread.close();
        writefile.close();
        fread = new FileReader(file);
        bread = new BufferedReader(fread);
        readFile();
        bread.close();

    }
}
