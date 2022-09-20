package Homework;

class BubbleSort{
    public static void Bubble(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}

class TyxBubbleSort {
    public static void main(String[] args) {
        final int N = 10;
        int[] a = new int[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 100);
        }
        System.out.println("排序前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        System.out.println("排序后：");
        BubbleSort.Bubble(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
