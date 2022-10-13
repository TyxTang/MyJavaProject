package optional;

import java.io.BufferedReader;
import java.io.IOException;

public class TyxUseException {
    public static void main(String[] args) {
        System.out.println("请输入一个整数字符串：");
        try {
            BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            System.out.println("输入的整数为：" + a);
        }
        catch (IOException e){
            System.out.println("IO错误：" + e.toString());
        }
        catch (NumberFormatException e){
            System.out.println("输入不是一个整数字符串" + e.toString());
        }
    }
}
