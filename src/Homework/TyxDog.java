package Homework;

class TyxDog {
    private final String name;
    private final String color;
    int age;
    public TyxDog(String name1,String color1,int age1) {
        name=name1;
        color=color1;
        age=age1;
    }
    public void show() {
        System.out.println("Name:" + name + ",Color=+" + color + ",age+" + age);
    }
    public static void main(String[] args) {
        TyxDog ram=new TyxDog("Ram","while",2);
        TyxDog nim=new TyxDog("Nim","black",3);
        ram.show();
        nim.show();
    }
}
