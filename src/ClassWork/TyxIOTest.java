package ClassWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TyxIOTest {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\in.txt");
        FileOutputStream Tyxfos = new FileOutputStream(f);
        int b;
        while ((b = System.in.read()) != '?') {
            Tyxfos.write(b);
        }
        Tyxfos.close();
    }
}
