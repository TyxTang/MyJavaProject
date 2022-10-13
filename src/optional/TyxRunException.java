package optional;

import java.io.BufferedReader;
import java.io.IOException;

public class TyxRunException {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int a = 2;
        int b = 2;
        String s;
        try {
            System.out.println("请输入第一个整数：");
            s = br.readLine();
            a = Integer.parseInt(s);
            System.out.println("请输入第二个整数：");
            s = br.readLine();
            b = Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.out.println("输入不是一个整数字符串" + e.toString());
        }
        catch (IOException e){
            System.out.println("IO错误：" + e.toString());
        }
        try {
            System.out.println(a + " / " + b + " = " + a / b);
        }
        catch (ArithmeticException e){
            System.out.println("输入数据错误" + e.toString());
        }
    }
}
