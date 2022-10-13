package optional;

import java.util.Scanner;

public class TyxMultiException {
    public static double multi(int n){
        if(n < 0){
            throw new IllegalArgumentException("n不能小于0");
        }
        double s = 1;
        for(int i = 1; i <= n; i++){
            s = s * i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int n = input.nextInt();
            System.out.println("n的阶乘为：" + multi(n));
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("输入错误！数组越界:" + e1.toString());
            System.exit(404);
        }
        catch (NumberFormatException e2){
            System.out.println("输入错误！数字格式错误:" + e2.toString());
            System.exit(555);
        }
        catch (IllegalArgumentException e3){
            System.out.println("输入错误！参数错误:" + e3.toString());
            System.exit(666);
        }
        finally {
            System.out.println("阶乘结束！");
        }
    }
}

