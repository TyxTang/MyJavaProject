package optional;

public class TyxTestBank_1 {
    public static void main(String[] args) {
        int mon = 10000;
        FixedBank_1 fixedBank = new FixedBank_1(mon);
        fixedBank.show();
        DebtBank_1 debtBank = new DebtBank_1(mon);
        debtBank.show();
        InterestBank_1 interestBank = new InterestBank_1(mon);
        interestBank.show();
    }
}

interface Bank_1 {
    float fixedRate = 0.0178f;
    float debtRate = 0.0198f;
    float interestRate = 0.0078f;
    abstract void count();
    abstract void show();
}

class FixedBank_1 implements Bank_1 {
    private float saving;
    private double sum;
    FixedBank_1(float i) {
        this.saving = i;
        count();
    }
    public void count() {
        sum = saving + (saving * Bank_1.fixedRate * 0.8);
    }
    public void show() {
        System.out.println("定期存款利息为：" + sum);
    }
}
class DebtBank_1 implements Bank_1 {
    private float debt;
    private double sum;
    DebtBank_1(float i) {
        this.debt = i;
        count();
    }
    public void count() {
        sum = debt + (debt * Bank_1.debtRate * 0.8);
    }
    public void show() {
        System.out.println("定期存款利息为：" + sum);
    }
}
class InterestBank_1 implements Bank_1 {
    private float interest;
    private double sum;
    InterestBank_1(float i) {
        this.interest = i;
        count();
    }
    public void count() {
        sum = interest + (interest * Bank_1.interestRate * 0.8);
    }
    public void show() {
        System.out.println("定期存款利息为：" + sum);
    }
}



