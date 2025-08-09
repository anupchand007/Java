package JDBC.src;

import java.sql.*;

public class P2_TRANSACTION {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(url, user, password);

        conn.setAutoCommit(false);

        try{
            Statement stmt = conn.createStatement();
            int rs1= stmt.executeUpdate("UPDATE user SET roll = 100 WHERE id = 2");
            stmt.executeUpdate("UPDATE user SET name ='SAMSUNG CHAND' where Id = 99");

            conn.commit();

            System.out.println("Updated successfully :" + rs1);
        }catch (Exception e){
            conn.rollback();
        }

    }
}
