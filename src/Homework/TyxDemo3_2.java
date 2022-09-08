package Homework;

import java.util.Scanner;
class TyxDemo3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("抽请输入奖号码");
        int id = input.nextInt();
        switch (id) {
            case 1:
                System.out.println("恭喜你得大奖，一辆汽车！");
                break;
            case 2:
                System.out.println("不错呀，你得到一台笔记本电脑！");
                break;
            case 3:
                System.out.println("没有白来，你得到一台冰箱！");
                break;
            case 0:
                break;
            default:
                System.out.println("真不幸，你没有奖品！下次再来吧");
                break;
        }
    }
}
