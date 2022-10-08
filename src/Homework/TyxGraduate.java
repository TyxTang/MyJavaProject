package Homework;

import java.util.Scanner;

public class TyxGraduate {
    public static void main(String[] args) {
        Graduate graduate = new Graduate("zhangsan", "男", 20);
        Scanner input = new Scanner(System.in);
        System.out.println("请输入工资收入：");
        double Fee = input.nextDouble();
        graduate.setFee(Fee);
        System.out.println("请输入学费：");
        double Pay = input.nextDouble();
        graduate.setPay(Pay);
        double GetFee = graduate.getFee();
        double GetPay = graduate.getPay();
        double Sum = GetFee - GetPay;
        if(Sum < 2000){
            System.out.println(graduate.getName() + " " + "需要贷款");
        }
        else{
            System.out.println(graduate.getName() + " " + "不需要贷款");
        }
    }
}

interface StudentInterface{
    abstract void setFee(double fee);
    abstract double getFee();
}

interface TeacherInterface{
    abstract void setPay(double pay);
    abstract double getPay();
}

class Graduate implements StudentInterface, TeacherInterface{

    private String name;
    private String sex;
    private int age;
    private double fee;
    private double pay;

    public Graduate(String name,String sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    public double getFee(){
        return fee;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    public double getPay(){
        return pay;
    }
}