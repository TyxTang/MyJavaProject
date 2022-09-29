package optional;

public class TyxCCircle {
    protected double radius;
    public TyxCCircle(double r) {
        radius=r;
    }
    public void show()
    {
        System.out.println("Radius="+radius);
    }
}


class TyxCCion extends TyxCCircle {
    private int value;
    public TyxCCion(double r,int v) {
        super(r);
        value=v;
    }
    public void show()
    {
        System.out.println("Radius="+radius+" Value="+value);
    }

    public static void main(String[] args) {
        TyxCCircle circle=new TyxCCircle(2.0);
        TyxCCion  coin=new TyxCCion(3.0,5);
        circle.show();
        coin.show();
    }

}