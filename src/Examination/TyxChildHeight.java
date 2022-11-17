package Examination;

import java.util.Scanner;

public class TyxChildHeight {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("请输入父亲的身高：");
        double fa = Input.nextDouble();
        System.out.print("请输入母亲的身高：");
        double mo = Input.nextDouble();
        double son = (fa + mo) * 1.08 / 2;
        System.out.println("儿子的身高为：" + son);
        double girl = (fa * 0.923 + mo) / 2;
        System.out.println("女儿的身高为：" + girl);
    }
}
