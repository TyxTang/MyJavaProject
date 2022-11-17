package Homework;

import java.io.*;
import java.util.Scanner;

public class TyxFileIn {
    private static File file;
    private static FileReader fread;
    private static BufferedReader bread;
    private static FileWriter fwrite;
    private static BufferedWriter bwrite;
    private static BufferedReader keyread;

    private static void readFile() throws Exception {
        System.out.println("文件内容");
        String s = bread.readLine();
        while (s != null) {
            System.out.println(s);
            s = bread.readLine();
        }
    }

    private static void writeFile() throws Exception {
        String s;
        while (true) {
            System.out.println("输入五个整数");
            System.out.flush();
            s = keyread.readLine();
            if (s.length() == 0)
                break;
            bwrite.write(s);
            bwrite.newLine();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String filename = null;
        String filenameis = input.nextLine();
        if(filenameis.length() > 0) {
            filename = filenameis;
        }
        else {
            System.out.println("无文件名");
            return;
        }
        file = new File("E://" + filename + ".txt");
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }
        fwrite = new FileWriter(file);
        bwrite = new BufferedWriter(fwrite);
        keyread = new BufferedReader(new InputStreamReader(System.in));
        writeFile();
        keyread.close();
        bwrite.close();
        fread = new FileReader(file);
        bread = new BufferedReader(fread);
        readFile();
        bread.close();
    }
}
