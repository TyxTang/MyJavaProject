package optional;

public class TyxTestBank {
    public static void main(String[] args) {
        int mon = 10000;
        FixedBank_1 fixedBank = new FixedBank_1(mon);
        fixedBank.show();
        DebtBank_1 debtBank = new DebtBank_1(mon);
        debtBank.show();
        InterestBank interestBank = new InterestBank(mon);
        interestBank.show();
    }
}

abstract class Bank{
    protected static final float fixedRate = 0.0178f;
    protected static final float debtRate = 0.0198f;
    protected static final float interestRate  = 0.0078f;
    abstract void count();
    abstract void show();
}

class FixedBank implements Bank_1 {
    private float saving;
    private double sum;
    FixedBank(float i){
        this.saving = i;
        count();
    }
    public void count(){
        sum = saving+ (saving * Bank_1.fixedRate * 0.8);
    }
    public void show(){
        System.out.println("定期存款利息为：" + sum);
    }
}
class DebtBank implements Bank_1 {
    private float debt;
    private double sum;
    DebtBank(float i){
        this.debt = i;
        count();
    }
    public void count(){
        sum = debt+ (debt * Bank_1.debtRate * 0.8);
    }
    public void show(){
        System.out.println("定期存款利息为：" + sum);
    }
}

class InterestBank implements Bank_1 {
    private float interest;
    private double sum;
    InterestBank(float i){
        this.interest = i;
        count();
    }
    public void count(){
        sum = interest+ (interest * Bank_1.interestRate * 0.8);
    }
    public void show(){
        System.out.println("定期存款利息为：" + sum);
    }
}
