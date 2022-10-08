package optional.mypackage;

import optional.mypackage.MyClass1;
import optional.mypackage.MyClass2;

public class TyxPlay {
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();
        MyClass2 myClass2 = new MyClass2();
        System.out.println("和为：" + myClass1.sum());
        System.out.println("乘积为：" + myClass2.multi());
    }
}
