package Homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TyxIOFile {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String filename = null;
        String filenameis = input.nextLine();
        if(filenameis.length() > 0) {
            filename = filenameis;
        }
        else
        {
            System.out.println("无文件名");
            return;
        }
        File file = new File("E:\\" + filename + ".txt");
        if(!file.exists()) {
            System.out.println("文件不存在");
            return;
        }
        FileReader fread = new FileReader(file);
        BufferedReader bread = new BufferedReader(fread);
        String s=bread.readLine();
        while(s != null) {
            System.out.println("内容:" + s);
            s=bread.readLine();
        }
        fread.close();
        bread.close();

        System.out.println("文件路径" + file.getAbsolutePath());
        System.out.println("修改时间" + new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(new Date(file.lastModified())));
        System.out.println("文件长度" + file.length());
        System.out.println("文件可读" + file.canRead());
        System.out.println("文件可写" + file.canWrite());
        input.close();
    }
}
