package Homework;

public class TyxException_2 {
    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[5]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.toString() + " ,caused by a[5]");
        }
        try {
            int[] b = new int[-4];
        }
        catch (NegativeArraySizeException e){
            System.out.println(e.toString() + " ,caused by new int[-4]");
        }
        try {
            String a = null;
            a.length();
        }
        catch (NullPointerException e){
            System.out.println(e.toString() + " ,caused by a.length()");
        }
    }
}
