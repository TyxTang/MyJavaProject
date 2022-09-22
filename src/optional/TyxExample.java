package optional;

class Example{
    static void graph(){
        for (int i=3; i>=0; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            System.out.print("****");
            System.out.println();
        }
    }
}

class TyxExample {
    public static void main(String[] args) {
        Example.graph();
    }
}
