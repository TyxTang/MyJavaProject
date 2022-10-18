package Homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TyxIOSecond {
    public static void main(String[] args) throws IOException {
        Long start = System.currentTimeMillis();
        File f = new File("E:\\TyxSecond.txt");
        FileWriter Tyxin=new FileWriter(f);
        int a;
        for(int i=1; i <= 10000; i++) {
            a = (int)(Math.random() * 10000);
            Tyxin.write(a);
        }

        System.out.println(System.currentTimeMillis() - start);
    }
}

