package Homework;

class Month_String{
    public static String Month(int month){
        String[] a = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return a[month - 1];
    }
}

class TyxMonth_String {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 12 + 1);
        System.out.println(n + "月份为：" + Month_String.Month(n));
    }

}
