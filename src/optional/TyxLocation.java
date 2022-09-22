package optional;


public class TyxLocation {
    private int x;
    private int y;



    public TyxLocation(int x1,int y1){
        x = x1;
        y = y1;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public static void main(String[] args) {
        TyxLocation loc = new TyxLocation(12,20);
        System.out.println(loc.getX());
        System.out.println(loc.getY());
        }
}
