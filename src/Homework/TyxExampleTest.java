package Homework;

class TyxExampleTest {
    public static void main(String[] args) {
         int no = (11 + 20) * 3 / 5 ;
         System.out.println("no = " + no);
         no ++;
         System.out.println("no = " + no);
         boolean bool = false;
         bool = true &&!false;
         System.out.println("bool = " + bool);
         byte bValue = 0x10;
         System.out.println("bValue = " + bValue);
         bool = (no > bValue);
         System.out.println("bool = " + bool);
    }
}
