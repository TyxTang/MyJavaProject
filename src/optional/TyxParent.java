package optional;

public class TyxParent {
    protected int x;
    public TyxParent(int i) {
        x=i;
    }
    int getX() {
        return x;
    }
    void show() {System.out.println("x="+x);
    }
}

class TyxSon extends TyxParent {
    protected int  x;
    public TyxSon(int j)
    {
        super(3);
        this.x=j;
    }
    void show()
    {
        System.out.println("super.x="+super.x+" "+"tjis.x"+x);
    }

}
class Tyx_Test{
    public static void main(String[] args) {
        TyxSon son=new TyxSon(5);
        son.show();
    }

}

