package MySQL;

import java.sql.*;

public class TyxMySQLconnect {
    private Connection con ;

    String driver = "com.mysql.jc.jdbc.Driver";
    String url = "jdbc:mysql://www.tyxtang.com:7706/mydb";

    String user = "TyxTang";

    String password = "root";

    public TyxMySQLconnect(){
        try{
            Class.forName(driver);
        }catch(ClassNotFoundException ce){
            System.out.println("SQLException:" + ce.getMessage());
        }

        try{
            con = DriverManager.getConnection(url,user,password);
        }catch(SQLException e){
            System.out.println("SQLException:" + e.getMessage());
        }
    }

    public void createTable(){
        try{
            Statement stmt = con.createStatement();
            String sql = "create table employee (ID int primary key, name char(15) not null, sex char(15) not null, age int not null, salary int not null, party char(5) not null)";
            stmt.execute(sql);
            stmt.close();
            System.out.println("建立数据库成功!");
        }catch(SQLException e){
            System.out.println("\n检测到数据库已存在 错误代码：\"" + e.getMessage() + "\"\n");
        }
    }

    public void insertDate(){
        try{
            Statement stmt = con.createStatement();
            String sql1 = "insert into employee values(1, '张三', '男', 25, 1200, '是')";
            String sql2 = "insert into employee values(2, '李四', '男', 24, 1100, '否')";
            String sql3 = "insert into employee values(3, '王五', '男', 26, 1300, '是')";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.executeUpdate(sql3);
            stmt.close();
            System.out.println("插入数据成功！");
        }catch(SQLException e){
            System.out.println("数据已存在" + e.getMessage());
        }
    }

    public void increaseSalary(){
        try{
            System.out.println("增加工资前：");
            print();
            Statement stmt = con.createStatement();
            String sql1 = "update employee set salary = salary*1.5 where age>45";
            stmt.executeUpdate(sql1);
            String sql2 = "update employee set salary = salary*1.1 where age<=45";
            stmt.executeUpdate(sql2);
            stmt.close();
            print();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(){
        Statement stmt;
        try{
            System.out.println("删除工资超过1500元的员工前：");
            print();
            stmt = con.createStatement();
            String sql = "delete from employee where salary>1500";
            stmt.executeUpdate(sql);
            System.out.println("删除工资超过1500元的员工后：");
            print();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void print() {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee order by salary desc");
            while (rs.next()) {
                System.out.println("编号：" + rs.getString("ID") + "\t" +
                        "姓名：" + rs.getString("name") + "\t" +
                        "性别：" + rs.getString("sex") + "\t" +
                        "年龄：" + rs.getString("age") + "\t" +
                        "工资：" + rs.getFloat("salary") + "\t" +
                        "党员：" + rs.getString("party"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TyxMySQLconnect jdbc = new TyxMySQLconnect();
        jdbc.createTable();
        jdbc.insertDate();
        jdbc.increaseSalary();
        jdbc.delete();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //连接数据库
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
