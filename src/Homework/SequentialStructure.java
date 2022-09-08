package Homework;

//导入Scanner类，用于接收用户输入
import java.util.Scanner;
class SequentialStructure {
    //输入a,b，计算ax+b=0的解
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner input = new Scanner(System.in);
        //提示用户输入a,b
        System.out.print("请输入a的值：");
        double a = input.nextDouble();
        System.out.print("请输入b的值：");
        double b = input.nextDouble();
        //计算ax+b=0的解
        double x = -b/a;
        //输出结果
        System.out.println("x="+x);
    }
}