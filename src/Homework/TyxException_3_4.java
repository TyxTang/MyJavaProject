package Homework;

import java.io.IOException;

public class TyxException_3_4 {
    public static void main(String[] args) {
        int[] x = { 10, 5, 0 };
        Divide d = new Divide();
        try {
            System.out.println("已输入main（）中的First try块");
            System.out.println("结果为：" + d.divide(x, 0));
            x[1] = 0;
            System.out.println("结果为：" + d.divide(x, 0));
            x[1] = 1;
            System.out.println("结果为：" + d.divide(x, 1));
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception caught in main()");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught in main()");
        }
        System.out.println("已退出main（）中的First try块");
        try {
            System.out.println("输入main（）中的Second try块");
            System.in.read();
            return;
        }
        catch(IOException e) {
        System.out.println("IOException caught in main()");
        }
        finally {
            System.out.println("finally块已执行");
        }
        System.out.println("已退出main（）中的Second try块");
    }
}

class Divide{
    public  int divide (int [] array , int index){
        try{
            System.out.println("\n输入divide（）中的First try块");
            array[index + 2] = array[index] / array[index + 1];
            System.out.println("Code at end of try block in divide()");
            return array[index + 2];
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException caught in divide()");
            return 0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index_out_of_bound exception caught in divide()");
            return 0;
        }
        finally {
            System.out.println("Finally block in divide() executed");
        }
    }
}
