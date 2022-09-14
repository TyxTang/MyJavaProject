package Homework;

class TyxAdd {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        System.out.println("调用方法前数组的值为：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        add(a);
        System.out.println("\n调用函数后数组的值：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        output();
    }
    static void add(int a[]){
        for (int i = 0; i < a.length; i++) {
            a[i] += 2;
        }
    }
    static void output(){
        String s = new String("abcdef");
        System.out.println();
        System.out.println();
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf('c'));
        System.out.println(s.indexOf("de",1));
        System.out.println(s.substring(1,3));
    }
}
