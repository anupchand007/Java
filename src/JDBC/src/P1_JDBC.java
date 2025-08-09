package JDBC.src;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import java.sql.*;

public class P1_JDBC {

    String url = "jdbc:mysql://localhost:3306/testdb";
    String user = "root";
    String password = "";

//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        Connection conn = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/testdb", "root", "");
//
//        Statement stmt = conn.createStatement();
//
//        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO user (id, name, age, roll) VALUES (?, ?, ?, ?)");
//        pstmt.setInt(1, 7);
//        pstmt.setString(2, "wakjda Chand");
//        pstmt.setInt(3, 25);
//        pstmt.setInt(4, 70);
//        pstmt.executeUpdate();
//
//        System.out.println("Data Inserted!!!");
//

    /// /        int rowsAffected = stmt.executeUpdate(
    /// /                "INSERT INTO user (id, name, age, roll) VALUES (1, 'anupchand', 22, 71)"
    /// /        );
    /// /
    /// /        System.out.println(rowsAffected + " row(s) inserted.");
//
//        stmt.close();
//        conn.close();
//    }
//}

//import javax.swing.plaf.nimbus.State;
//import java.sql.*;
//
//public class P1_JDBC {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root",
//                "");
//
//        Statement stmt = conn.createStatement();
//
//        ResultSet rs = stmt.executeQuery("SELECT * FROM user");
//
//        while(rs.next()){
//            System.out.println("Id: "+ rs.getInt("id")
//                    + ", Name: " + rs.getString("name")
//                    + ", Age: "+ rs.getInt("age")
//                    + ", Roll: " + rs.getInt("roll"));
//        }
//
//    }
//}
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(url, user, password);

        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_UPDATABLE);


        ResultSet rs = stmt.executeQuery("SELECT * FROM user");
                rs.last();
        rs.updateString("name", "WizzyBoy");
        rs.updateRow();

//        RowSet rs = new CachedRowSet();
//        rs.setURL(url);
//        rs.setUsername(user);
//        rs.setPassword(password);
//        rs.execute();

        System.out.println("Updated: " + rs.getString("name"));

    }
}