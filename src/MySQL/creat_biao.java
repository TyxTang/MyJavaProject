package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class creat_biao {
    private Connection con ;

    String driver = "com.mysql.jc.jdbc.Driver";
    String url = "jdbc:mysql://www.tyxtang.com:7706/pay";

    String user = "TyxTang";

    String password = "root";

    public creat_biao(){
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
            String sql = "create table payuser (ID int primary key, name char(15) not null, sex char(15) not null, age int not null, salary int not null, party char(5) not null)";
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
            String sql1 = "insert into payuser values(1, '张三', '男', 25, 1200, '是')";
            String sql2 = "insert into payuser values(2, '李四', '男', 24, 1100, '否')";
            String sql3 = "insert into payuser values(3, '王五', '男', 26, 1300, '是')";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.executeUpdate(sql3);
            stmt.close();
            System.out.println("插入数据成功！");
        }catch(SQLException e){
            System.out.println("数据已存在" + e.getMessage());
        }
    }
    public static void main(String[] args) {
        creat_biao jdbc = new creat_biao();
        jdbc.createTable();
        jdbc.insertDate();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //连接数据库
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
