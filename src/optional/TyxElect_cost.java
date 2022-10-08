package optional;

public class TyxElect_cost {
    public static void main(String[] args) {
        Winter x = new Winter(125);
        Summer y = new Summer(125);
        x.calculate();
        y.calculate();
    }
}

abstract class Common{
    public int amount;
    public final double price=0.49;
    public Common(int amount){
        this.amount=amount;
    }
    public abstract void calculate();
}

class Winter extends Common{
    public Winter(int amount){
        super(amount);
    }
    public void calculate(){
        System.out.println("冬季电费：" + (amount * price + 20 * price) + "元" );
    }
}

class Summer extends Common{
    public Summer(int amount){
        super(amount);
    }
    public void calculate(){
        System.out.println("夏季电费：" + amount * price  + "元" );
    }
}
