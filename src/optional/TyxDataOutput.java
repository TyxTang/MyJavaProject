package optional;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TyxDataOutput {
    public static void main(String[] args) throws Exception {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("E://Data.txt"));
        out.writeDouble(3.14159 );
        out.writeBoolean(true);
        out.close();
        DataInputStream in = new DataInputStream(new FileInputStream("E://Data.txt"));
        System.out.println(in.readDouble());
        System.out.println(in.readBoolean());
    }
}
