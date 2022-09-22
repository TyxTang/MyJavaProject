package Homework;

public class TyxSchool {
    public static void main(String[] args) {
        School school = new School(350);
        Student student1 = new Student("张三","123", 310, 100);
        Student student2 = new Student("李四","456", 351, 80);
        Student student3 = new Student("王五","789", 330, 85);
        Matriculation.status (student1);
        Matriculation.status (student2);
        Matriculation.status (student3);
    }
}

class School {
    static int line;
    public School(int line1) {
        line = line1;
    }
    public static void setLine(int score) {
        line = score;
    }
    public static int getLine(){
        return line;
    }
}

class Student{
    String name;
    String id;
    int total;
    int sports;
    Student (String name1 , String id1 , int total1 , int sports1){
        name = name1;
        id = id1;
        total = total1;
        sports = sports1;
    }
    public int getSports(){
        return sports;
    }
    public int getTotal(){
        return total;
    }
    public String getMessage(){
        return (id + " " + name + " " + total + " " +sports);
    }
}

class Matriculation{
    static void status (Student student){
        if((student.getTotal() >= 300 && student.getSports() >=96) || student.getTotal() > School.getLine()){
            System.out.println(student.getMessage() + " 被录取");
        }
        else{
            System.out.println(student.getMessage() + " 未被录取");
        }
    }
}
