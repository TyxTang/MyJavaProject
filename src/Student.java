public class Student {
    public String name;
    public int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show() {
        System.out.println("姓名： " + name + ", 年龄： " + age);
    }
}

/*class Undergraduate enxtends Student {
    private String speciality;
    public Undergraduate(String name, int age, String specialty) {
        super(name, age);
        this.speciality = speciality;
    }
    public void show() {
        super.show();
        System.out.println("专业: " + speciality);
    }
}
*/
//程序有误