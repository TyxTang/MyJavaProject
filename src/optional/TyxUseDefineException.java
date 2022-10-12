package optional;

import java.util.Scanner;

public class TyxUseDefineException {
    public static boolean prime(int n) throws ArgumentOutOfBoundException
    {
        if(n<0) {
        ArgumentOutOfBoundException ae=new ArgumentOutOfBoundException();
        throw ae;
        }
    else {
        boolean isPrime=true;
        for(int i=2;i<n;i++)
            if(n%i==0) {
                isPrime=false;
                break;
            }
        return isPrime;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String mm = input.nextLine();
        for(int i=mm.length();--i>=0;){
            int chr=mm.charAt(i);
            if(chr<48 || chr>57){
                System.out.println("输入格式有误，只能输入一个数字");
                System.exit(666);
            }

        }
        int m = Integer.parseInt(mm);
        try {
            boolean result=prime(m);
            System.out.println("对您输入的整数"+m+"是否为素数的判断结果是："+result);
        }
        catch(ArgumentOutOfBoundException e) {
            System.out.println("异常名称："+e.toString());
        }
    }
}
class ArgumentOutOfBoundException extends Exception {
    ArgumentOutOfBoundException() {
    System.out.println("输入错误！欲判断的数不能为负!");
    }
}
