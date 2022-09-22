package optional;

public class TyxAccount {
    String account;
    String name;
    String address;
    double balance;
    static double minBalance = 50;
    public TyxAccount(){
        account = "XXX";
        name = "Jonel";
        address = "China";
        balance = 0;
    }
    public TyxAccount(String account, String name, String address, double balance){
        this.account = account;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }
    public void deposit(double cash){
        System.out.println("您账户的原有余额：" + balance);
        System.out.println("您存入的金额：" + cash);
        balance += cash;
        System.out.println("您账户的现有余额：" + balance);
    }
    public void withdraw(double cash){
        double temp = balance - cash;
        if(temp < minBalance){
            System.out.println("至少保留余额" + minBalance);
        }
        else {
            balance = temp;
        }
    }
    public void query(){
        System.out.println("您账户的余额：" + balance);
    }

    public static void main(String[] args) {
        TyxAccount Jame = new TyxAccount("1111222", "Jame", "XiAn", 200);
        Jame.deposit(300.5);
        Jame.withdraw(200);
        Jame.withdraw(200);
        Jame.query();
    }
}
