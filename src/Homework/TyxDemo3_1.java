package Homework;

import java.util.Scanner;
class TyxDemo3_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入订单标识符");
        int id = input.nextInt();
        switch (id) {
            case 0:
                System.out.println("订单取消");
                break;
            case 10:
                System.out.println("新订单，未发货");
                break;
            case 20:
                System.out.println("已付款，未发货");
                break;
            case 30:
                System.out.println("已发货，未收货");
                break;
            case 40:
                System.out.println("已收货，未评价");
                break;
            case 50:
                System.out.println("已评价");
                break;
            default:
                System.out.println("查询错误");
                break;
        }
    }
}
