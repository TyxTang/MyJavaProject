package Homework;

public class TyxUser {
    public static void main(String[] args) {
        User user = new User("TyxTang", "123456");
        System.out.println(user.getName() + " " + user.getPassword());
    }
}

class User{
    public String name;
    private String password;
    static int count = 0;
    public User(String name, String password){
        this.name = name;
        this.password = password;
        count++;
    }
    public String getPassword(){
        return password;
    }
    public String getName(){
        return name;
    }
}
