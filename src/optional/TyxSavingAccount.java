package optional;

public class TyxSavingAccount {
    static double interest;
    double balance;
    TyxSavingAccount(double balance){
        this.balance = balance;
    }
    public double MonthInterest(){
        return YearInterest() / 12;
    }
    public double YearInterest(){
        return balance * interest;
    }
    public void Balance(){
        System.out.println("余额为：" + balance);
    }
    public static void setInterest(double interest1){
        TyxSavingAccount.interest = interest1;
    }
    public static void main(String[] args) {
        TyxSavingAccount saver = new TyxSavingAccount(3000);
        TyxSavingAccount.setInterest(0.03);
        saver.Balance();
        System.out.println("年利息为：" + saver.MonthInterest());
        System.out.println("月利息为：" + saver.YearInterest());
    }
}
