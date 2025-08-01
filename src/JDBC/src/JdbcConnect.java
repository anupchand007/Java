import java.sql.*;

public class JdbcConnect {
    public static void main(String[] args) {
        try {
            // Load driver (optional in newer Java)
            Class.forName("com.mysql.jdbc.Driver");


            // Connect to DB
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "your_password");

            // Create statement and execute
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // Process result
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            // Close connection
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
