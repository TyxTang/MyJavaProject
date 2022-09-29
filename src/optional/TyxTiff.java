package optional;

public class TyxTiff {
    double calculate(float r)
    {
        return Math.PI*r*r;
    }
    double calculate(float r,float h)
    {
        return Math.PI*r*r*h;
    }

}

class TyxTest {
    public static final TyxTiff TIFF = new TyxTiff();

    public static void main(String[] args) {
        TyxTiff a = new TyxTiff();
        System.out.println("Area="+a.calculate(12.6f));
        System.out.println("Volume="+a.calculate(12.6f,37.8f));
    }
}
