package optional;

import java.io.*;

public class TyxUniteFile {
    public static void main(String[] args) {
        File file1 = new File("E:\\file.txt");
        try {
            BufferedReader f1 = new BufferedReader(new FileReader("E:\\file1.txt"));
            BufferedReader f2 = new BufferedReader(new FileReader("E:\\file2.txt"));
            BufferedWriter f3 = new BufferedWriter(new FileWriter("E:\\unite.txt"));
            String s1 = f1.readLine();
            while (s1 != null) {
                f3.write(s1);
                f3.newLine();
                s1 = f1.readLine();
            }
            f1.close();
            String s2 = f2.readLine();
            while (s2 != null) {
                f3.write(s2);
                f3.newLine();
                s2 = f2.readLine();
            }
            f2.close();
            f3.close();
        } catch (FileNotFoundException fe) {
            System.out.println(fe.toString());
        } catch (IOException ie) {
            System.out.println(ie.toString());
        }
    }
}
