package project;

import java.sql.*;
public class DBLoader
{
     public static ResultSet executeSQL(String sql) throws Exception
    {
        //## code//
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loading done");
        
        Connection con=DriverManager.getConnection("jdbc:mysql:// localhost:3306/vod","root","system");
        System.out.println("Connection Done");
        
        Statement stmt =con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        System.out.println("statement done");
        
        ResultSet rs=stmt.executeQuery(sql);
        System.out.println("ResultSet Created");
        return rs;
        
        //##Code Ends Here
    }
}
