/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author seany
 */
public class Demo {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int ID;
        String MAJOR;
        while(true){
            System.out.println("Choose an ID between 1-23 to show Student Name");
            ID = sc.nextInt();
            
            if (ID >= 1 && ID <= 23) break;
        }
        String sql = "select STUDENT_NAME from studentinfo where STUDENT_ID = "+String.valueOf(ID);
        String sql2 = "DESCRIBE studentInfo";
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "yauder";
        
        Connection connect = DriverManager.getConnection(url, username, password);
        Statement statement = connect.createStatement();
        ResultSet result = statement.executeQuery(sql2);
        result.next();
        String name = result.getString(1);
        
        System.out.println(name);
    }
}