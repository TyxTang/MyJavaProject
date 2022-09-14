# JAVA的基本介绍

![image-20220830145315416](https://tyxtang-images-1301033129.cos.ap-guangzhou.myqcloud.com/images/image-20220830145315416.png)



### JAVA是跨平台性的

一个编译好的 **.class** 文件 可以再多个系统下运行

----

![image-20220901004314689](https://tyxtang-images-1301033129.cos.ap-guangzhou.myqcloud.com/images/image-20220901004314689.png)





### JAVA开发工具

sublime、notepad、**idea**（主流）、**eclipse** (主流)

----



### JAVA运行机制

**.java**（源文件） 程序编译为 **.class**（字节码文件） 运行至 **JVM** ，**JVM** 包含 **JDK** 中。

----



### JDK、JRE的介绍

**JDK** 是 Java 的开发工具包，包含 JRE + java的开发工具集

**JRE**  是 Java 的运行环境，包含 JVM + java的核心类库（Java SE标准类库）

**JVM** 是 Java 虚拟机

----



### JDK的安装与配置

#### 安装

官方网址：https://www.oracle.com/java/technologies/javase-downloads.html

注意：安装路径不能有中文

#### 配置

1.我的电脑-属性-高级系统设置-环境变量
2,增加JAVA HOME环境变量
3.编辑path环境变量，增加%JAVA HOME%bin
4.打开CMD，任意目录下敲入java -version。如果出现javac的参数信息，配置成功。

----



# Java基础



### Helloworld

#### 源码：

````java
public class Hello{
    public static void main(String[] args){
        System.out.println("Helloworld");
    }
}
````



#### 说明：

**public class Hello** 表示 ***Hello*** 是一个 ***public*** 类型的类，***class*** 代表类

**public static void main(String[] args)** 表示程序的**主方法**（程序的入口），***static*** 表示静态（面向对象部分）

**System.out.println("Helloworld")** 表示输出语句，输出***Helloworld***



#### 编译:

1.源码文件目录执行 javac <文件名.java>   //对源码进行编译

注意：编码需要与cmd编码一致，修改后要保存（例如GBK需要对应GBK，UTF-8需要对应UTF-8）

2.java <文件名> //不需要加 *.class* ,运行程序

----



### 类

1.一个源文件中最多只能有一个oublic类。如果源文件包含一个public类，则文件名必须按该类名命名！

2.其它类的个数不限，也可以将main方法写在非public类中，然后指定运行非public类，这样入口方法就是非public的main方法

3.编译后，每一个类都有一个对应的 ***.class*** 文件

----



### 转义符

\t：一个制表位，实现对齐的功能
\\n：换行符
\\\：一个\

\\'：一个'

\\"：一个”

\r:一个回车，System.out.println("Hello\r你好")；

----



### 注释

#### 普通注释：

**单行注释：** *//*

````java
//这是一行注释
````



**多行注释：** /*  */

````java
/*这是一行注释*/
````

注意：多行注释不允许嵌套

----

#### 文档注释：

````java
/**
*
*/
````

注释内容可以被JDK提供的工具javadoc所解析，生成一套以网页文件形式体现的该程序的说明文档，一般写在类

````java
/**
*@author TyxTang
*@see Collection
*@see List
*@since 1.2
*/
````

**javadoc -d 文件夹名 -xx -yy**  例子: javadoc -dd:\\temp -author -version Comment02.java

**使用 @ Java标签**

----



## 代码规范

1.给类和方法注释的时候要用javadoc来写

2.非javadoc注释是给代码维护者看的。

3.**tab** 实现缩进，**shift+tab** 实现向后缩进

4.**运算符** 和 **=** 左右两边习惯性加空格

5.源文件使用 **UTF-8** 编码

6.行宽度不要超过80字符

----



## 加（+）号的使用

1.两边都是数值，做加法运算

2.两边有一边是字符串，做拼接运算

----



## 数据类型

![image-20220902003857983](https://tyxtang-images-1301033129.cos.ap-guangzhou.myqcloud.com/images/image-20220902003857983.png)

数据类型分为两大类：基本数据类型、引用数据类型



常量类型（具体值）默认为int型，声明long型常量需在后加 “l” 或 "L" ；