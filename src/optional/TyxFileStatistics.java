package optional;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TyxFileStatistics {
    public static void main(String[] args) {
        int numA=0,numE=0,numI=0,numO=0,numU=0;
        int ch;
        File file3=new File("E:\\file3.txt");
        try {
            FileInputStream fin= new FileInputStream(new File("E:\\file3.txt"));
            ch=fin.read();
            while(ch!=-1) {
                char c=(char)ch;
                switch(c) {
                    case'a':numA+=1; break;
                    case'e':numE+=1; break;
                    case'i':numI+=1; break;
                    case'o':numO+=1; break;
                    case'u':numU+=1;
                }
                ch=fin.read();
            }
            fin.close();
            System.out.println("文件中共有字母a: " + numA + "个，字母e: "+numE + "个，字母i: " + numI + "个，字母o: " + numO + "个，字母u: " + numU);
        }
        catch(FileNotFoundException fe) {
            System.out.println(fe.toString());
        }
        catch(IOException ie) {
            System.out.println(ie.toString());
        }
    }
}
